package com.mkbz.phelp.dialog.operator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
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
import com.mkbz.phelp.dialog.operator.OperatorListAdapter;
import com.mkbz.phelp.dialog.operator.OperatorPickerListener;
import com.mkbz.phelp.model.Country;
import com.mkbz.phelp.model.Operator;

public class OperatorPickerDialogFragment extends DialogFragment implements
        Comparator<Operator> {
    /**
     * View components
     */
    private EditText searchEditText;
    private ListView operatorListView;

    /**
     * Adapter for the listview
     */
    private OperatorListAdapter adapter;

    /**
     * Hold all countries, sorted by country name
     */
    private List<Operator> allOperatorsList;

    /**
     * Hold countries that matched user query
     */
    private List<Operator> selectedOperatorsList;

    /**
     * Listener to which country user selected
     */
    private OperatorPickerListener listener;

    /**
     * Set listener
     *
     * @param listener
     */
    public void setListener(OperatorPickerListener listener) {
        this.listener = listener;
    }

    public EditText getSearchEditText() {
        return searchEditText;
    }

    public ListView getCountryListView() {
        return operatorListView;
    }


    /**
     * Get all countries with code and name from res/raw/countries.json
     *
     * @return
     */
    private List<Operator> getAllOperators() {
        if (allOperatorsList == null) {
            try {
                ModelDataSource<Operator> datasource;
                allOperatorsList = new ArrayList<Operator>();
                datasource = new ModelDataSource<>(getActivity(), Operator.TABLE,Operator.ID,new Operator());
                datasource.open();
                String aux = MainActivity.getSharedPreferences().getString("country_id", "US").toLowerCase();
                Log.d(aux, "Country value before operator query");
                allOperatorsList.addAll(datasource.getAll("country_id = ?", new String[]{aux}));
               // allOperatorsList.addAll(datasource.getAll(null,null));

                selectedOperatorsList = new ArrayList<Operator>();
                selectedOperatorsList.addAll(allOperatorsList);

                return allOperatorsList;
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
                selectedOperatorsList = new ArrayList<Country>();
                selectedOperatorsList.addAll(allCountriesList);

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
    public static OperatorPickerDialogFragment newInstance(String dialogTitle) {
        OperatorPickerDialogFragment picker = new OperatorPickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("dialogTitle", dialogTitle);
        picker.setArguments(bundle);
        return picker;
    }

    /**
     * Create view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view
        View view = inflater.inflate(R.layout.country_dialog_layout, null);

        // Get countries from the database
        getAllOperators();

        // Set dialog title if show as dialog
        Bundle args = getArguments();
        if (args != null) {
            String dialogTitle = args.getString("dialogTitle");
            getDialog().setTitle(dialogTitle);
/*
            int width = getResources().getDimensionPixelSize(
                    R.dimen.cp_dialog_width);
            int height = getResources().getDimensionPixelSize(
                    R.dimen.cp_dialog_height);
            getDialog().getWindow().setLayout(width, height);*/
        }

        // Get view components
        searchEditText = (EditText) view
                .findViewById(R.id.country_picker_search);
        operatorListView = (ListView) view
                .findViewById(R.id.country_picker_listview);

        // Set adapter
        adapter = new OperatorListAdapter(getActivity(), selectedOperatorsList);
        operatorListView.setAdapter(adapter);

        // Inform listener
        operatorListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Operator operator = selectedOperatorsList.get(position);
                SharedPreferences.Editor editor = MainActivity.getSharedPreferences().edit();
                editor.putInt("operator_id", operator.getNetwork_code());
                editor.commit();
                getDialog().dismiss();

                int aux = MainActivity.getSharedPreferences().getInt("operator_id", 0);
                Log.d("Operator", aux + "-" + position + " -> " + id + " -> " + operator.toString());
                if (listener != null) {
                    listener.onSelectOperator(operator.getName(),
                            operator.getNetwork_code());
                }
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
     * selectedOperatorsList
     *
     * @param text
     */
    @SuppressLint("DefaultLocale")
    private void search(String text) {
        selectedOperatorsList.clear();

        for (Operator operator : allOperatorsList) {
            if (operator.getName().toLowerCase(Locale.ENGLISH)
                    .contains(text.toLowerCase())) {
                selectedOperatorsList.add(operator);
            }
        }

        adapter.notifyDataSetChanged();
    }

    /**
     * Support sorting the countries list
     */
    @Override
    public int compare(Operator lhs, Operator rhs) {
        return lhs.getName().compareTo(rhs.getName());
    }

}