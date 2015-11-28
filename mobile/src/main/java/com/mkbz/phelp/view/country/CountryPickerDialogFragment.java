        package com.mkbz.phelp.view.country;


        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.Currency;
        import java.util.List;
        import java.util.Locale;

        import android.annotation.SuppressLint;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.support.v4.app.DialogFragment;
        import android.support.v4.app.FragmentManager;
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
        import com.mkbz.phelp.model.Country;
        import com.mkbz.phelp.view.operator.OperatorPickerDialogFragment;

public class CountryPickerDialogFragment extends DialogFragment implements
        Comparator<Country> {
    /**
     * View components
     */
    private EditText searchEditText;
    private ListView countryListView;
    private static FragmentManager fragment;
    /**
     * Adapter for the listview
     */
    private CountryListAdapter adapter;

    /**
     * Hold all countries, sorted by country name
     */
    private List<Country> allCountriesList;

    /**
     * Hold countries that matched user query
     */
    private List<Country> selectedCountriesList;

    /**
     * Listener to which country user selected
     */
    private CountryPickerListener listener;

    /**
     * Set listener
     *
     * @param listener
     */
    public void setListener(CountryPickerListener listener) {
        this.listener = listener;
    }

    public EditText getSearchEditText() {
        return searchEditText;
    }

    public ListView getCountryListView() {
        return countryListView;
    }

    /**
     * Convenient function to get currency code from country code currency code
     * is in English locale
     *
     * @param countryCode
     * @return
     */
    public static Currency getCurrencyCode(String countryCode) {
        try {
            return Currency.getInstance(new Locale("en", countryCode));
        } catch (Exception e) {

        }
        return null;
    }


    /**
     * Get all countries with code and name from res/raw/countries.json
     *
     * @return
     */
    private List<Country> getAllCountries() {
        if (allCountriesList == null) {
            try {
                ModelDataSource<Country> datasource;
                allCountriesList = new ArrayList<Country>();
                datasource = new ModelDataSource<Country>(getActivity(), Country.TABLE,Country.ID,new Country());
                datasource.open();

                allCountriesList.addAll(datasource.getAll(null, null));

                selectedCountriesList = new ArrayList<Country>();
                selectedCountriesList.addAll(allCountriesList);
                datasource.close();
                return allCountriesList;
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
                selectedCountriesList = new ArrayList<Country>();
                selectedCountriesList.addAll(allCountriesList);

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
    public static CountryPickerDialogFragment newInstance(String dialogTitle,FragmentManager fgm) {
        fragment = fgm;
        CountryPickerDialogFragment picker = new CountryPickerDialogFragment();
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
        getAllCountries();

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
        countryListView = (ListView) view
                .findViewById(R.id.country_picker_listview);

        // Set adapter
        adapter = new CountryListAdapter(getActivity(), selectedCountriesList);
        countryListView.setAdapter(adapter);

        // Inform listener
        countryListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Country country = selectedCountriesList.get(position);
                SharedPreferences.Editor editor = MainActivity.getSharedPreferences().edit();
                editor.putString("country_id", country.getCode());
                editor.commit();
                getDialog().dismiss();

                String aux = MainActivity.getSharedPreferences().getString("country_id", "US");
                Log.d("Country", aux + "-" + position + " -> " + id + " -> " + country.toString());
                if (listener != null) {
                    listener.onSelectCountry(country.getName(),
                            country.getCode());
                }
                MainActivity.emergencyFragment.updatedCountry();
                OperatorPickerDialogFragment picker = OperatorPickerDialogFragment.newInstance("Select Operator");
                picker.show(fragment, MainActivity.OPERATOR_PICKER);
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
     * selectedCountriesList
     *
     * @param text
     */
    @SuppressLint("DefaultLocale")
    private void search(String text) {
        selectedCountriesList.clear();

        for (Country country : allCountriesList) {
            if (country.getName().toLowerCase(Locale.ENGLISH)
                    .contains(text.toLowerCase())) {
                selectedCountriesList.add(country);
            }
        }

        adapter.notifyDataSetChanged();
    }

    /**
     * Support sorting the countries list
     */
    @Override
    public int compare(Country lhs, Country rhs) {
        return lhs.getName().compareTo(rhs.getName());
    }

}