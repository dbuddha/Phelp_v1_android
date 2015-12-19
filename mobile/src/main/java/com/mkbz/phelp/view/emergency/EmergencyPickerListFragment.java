package com.mkbz.phelp.view.emergency;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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

public class EmergencyPickerListFragment extends Fragment{
    /**
     * View components
     */
    private static ViewGroup container;
    private FragmentActivity context;
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

    public ListView getCountryListView() {
        return EmergencyListView;
    }


    public void updatedCountry() {
       /* allEmergencysList=null;
        adapter.updateData(getAllEmergencys());*/
        allEmergencysList = null;

        if (adapter!=null) adapter.updateData(getAllEmergencys());
        else {

            adapter = new EmergencyListAdapter(context, selectedEmergencysList);
        }
        //adapter.notifyDataSetChanged();
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
                datasource = new ModelDataSource<>(getActivity(), Emergency.TABLE, Emergency.ID, new Emergency());
                datasource.open();
                String aux = MainActivity.getSharedPreferences().getString("country_id", "US").toUpperCase();
                Log.d(aux, "Country value before Emergency query");
                allEmergencysList.addAll(datasource.getAll("country_id = ?", new String[]{aux}));
                //allEmergencysList.addAll(datasource.getAll(null,null));

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
        View view = inflater.inflate(R.layout.emergency_layout, null);
        // Get countries from the database
        getAllEmergencys();

        // Set dialog title if show as dialog
        Bundle args = getArguments();

        // Get view components
        EmergencyListView = (ListView) view
                .findViewById(R.id.emergency_picker_listview);

        // Set adapter
        context = getActivity();
        adapter = new EmergencyListAdapter(context, selectedEmergencysList);
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
        return view;
    }

}