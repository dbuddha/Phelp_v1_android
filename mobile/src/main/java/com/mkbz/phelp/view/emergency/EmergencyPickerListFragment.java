package com.mkbz.phelp.view.emergency;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.R;
import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.dialer.Dialer;
import com.mkbz.phelp.model.Emergency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class EmergencyPickerListFragment extends Fragment implements
        Comparator<Emergency> {
    /**
     * View components
     */
    private static ViewGroup container;

    private EditText searchEditText;
    private ListView EmergencyListView;

    /**
     * Adapter for the listview
     */
    private EmergencyListAdapter adapter;

    /**
     * Hold all countries, sorted by country name
     */
    private List<Emergency> allEmergencysList;

    /**
     * Hold countries that matched user query
     */
    private List<Emergency> selectedEmergencysList;

    /**
     * Listener to which country user selected
     */
    private EmergencyPickerListener listener;

    /**
     * Set listener
     *
     * @param listener
     */
    public void setListener(EmergencyPickerListener listener) {
        this.listener = listener;
    }

    public EditText getSearchEditText() {
        return searchEditText;
    }

    public ListView getCountryListView() {
        return EmergencyListView;
    }


    /**
     * Get all countries with code and name from res/raw/countries.json
     *
     * @return
     */
    private List<Emergency> getAllEmergencys() {
        if (allEmergencysList == null) {
            try {
                ModelDataSource<Emergency> datasource;
                allEmergencysList = new ArrayList<Emergency>();
                datasource = new ModelDataSource<>(getActivity(), Emergency.TABLE,Emergency.ID,new Emergency());
                datasource.open();
                String aux = MainActivity.getSharedPreferences().getString("country_id", "US").toLowerCase();
                Log.d(aux, "Country value before Emergency query");
                allEmergencysList.addAll(datasource.getAll("country_id = ?", new String[]{aux}));
               // allEmergencysList.addAll(datasource.getAll(null,null));

                selectedEmergencysList = new ArrayList<Emergency>();
                selectedEmergencysList.addAll(allEmergencysList);
                datasource.close();
                return allEmergencysList;
              /*  // Read from local file
                String allCountriesString = readFileAsString(getActivity());
                Log.d("countrypicker", "country: " + allCountriesString);
                JSONObject jsonObject = new JSONObject(allCountriesString);
                Iterator<?> keys = jsonObject.keys();

                // Add the data to all countries list
                while (keys.hasNext()) {
                    String key = (String) keys.next();
                    Country country = new Country();
                    country.setCode(key);
                    country.setName(jsonObject.getString(key));
                    allCountriesList.add(country);
                }

                // Sort the all countries list based on country name
                Collections.sort(allCountriesList, this);

                // Initialize selected countries with all countries
                selectedEmergencysList = new ArrayList<Country>();
                selectedEmergencysList.addAll(allCountriesList);

                // Return*/

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    /**
     * To support show as dialog
     *
     * @param dialogTitle
     * @return
     */
    public static EmergencyPickerListFragment newInstance(String dialogTitle) {
        EmergencyPickerListFragment picker = new EmergencyPickerListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", dialogTitle);
        picker.setArguments(bundle);
        return picker;
    }

    /**
     * Create view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewContainer,
                             final Bundle savedInstanceState) {
        // Inflate view
        View view = inflater.inflate(R.layout.country_dialog_layout, null);
        // Get countries from the database
        getAllEmergencys();

        // Set dialog title if show as dialog
        Bundle args = getArguments();

        // Get view components
        searchEditText = (EditText) view
                .findViewById(R.id.country_picker_search);
        EmergencyListView = (ListView) view
                .findViewById(R.id.country_picker_listview);

        // Set adapter
        adapter = new EmergencyListAdapter(getActivity(), selectedEmergencysList);
        EmergencyListView.setAdapter(adapter);

        // Inform listener
        EmergencyListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Emergency Emergency = selectedEmergencysList.get(position);
                Intent intent = Dialer.getExecutable(Emergency.getCode());
                startActivity(intent);
            }
        });

        // Search for which countries matched user query
        searchEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                search(s.toString());
            }
        });

        return view;
    }

    /**
     * Search allCountriesList contains text and put result into
     * selectedEmergencysList
     *
     * @param text
     */
    @SuppressLint("DefaultLocale")
    private void search(String text) {
        selectedEmergencysList.clear();

        for (Emergency Emergency : allEmergencysList) {
            if (Emergency.getTitle().toLowerCase(Locale.ENGLISH)
                    .contains(text.toLowerCase())) {
                selectedEmergencysList.add(Emergency);
            }
        }

        adapter.notifyDataSetChanged();
    }

    /**
     * Support sorting the countries list
     */
    @Override
    public int compare(Emergency lhs, Emergency rhs) {
        return lhs.getTitle().compareTo(rhs.getTitle());
    }

}