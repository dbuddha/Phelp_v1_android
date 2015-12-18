package com.mkbz.phelp.view.favorite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.R;
import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.dialer.Dialer;
import com.mkbz.phelp.model.Favorite;

import java.util.ArrayList;
import java.util.List;

public class FavoritePickerListFragment extends Fragment{
    /**
     * View components
     */
    private static ViewGroup container;
    private ListView FavoriteListView;

    /**
     * Adapter for the listview
     */
    private FavoriteListAdapter adapter;

    /**
     * Hold all countries, sorted by country name
     */
    private List<Favorite> allFavoritesList;

    /**
     * Hold countries that matched user query
     */
    private List<Favorite> selectedFavoritesList;

    /**
     * Listener to which country user selected
     */
    private FavoritePickerListener listener;

    /**
     * Set listener
     *
     * @param listener
     */
    public void setListener(FavoritePickerListener listener) {
        this.listener = listener;
    }

    public ListView getCountryListView() {
        return FavoriteListView;
    }


    public void updatedCountry() {
       /* allFavoritesList=null;
        adapter.updateData(getAllFavorites());*/
        allFavoritesList = null;
        adapter.updateData(getAllFavorites());
        //adapter.notifyDataSetChanged();
    }

    /**
     * Get all countries with code and name from res/raw/countries.json
     *
     * @return
     */
    private List<Favorite> getAllFavorites() {
        if (allFavoritesList == null) {
            try {
                ModelDataSource<Favorite> datasource;
                allFavoritesList = new ArrayList<Favorite>();
                datasource = new ModelDataSource<>(getActivity(), Favorite.TABLE, Favorite.ID, new Favorite());
                datasource.open();
                allFavoritesList.addAll(datasource.getAll(null,null));
                //allFavoritesList.addAll(datasource.getAll(null,null));

                selectedFavoritesList = new ArrayList<Favorite>();
                selectedFavoritesList.addAll(allFavoritesList);
                datasource.close();
                return allFavoritesList;
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
                selectedFavoritesList = new ArrayList<Country>();
                selectedFavoritesList.addAll(allCountriesList);

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
    public static FavoritePickerListFragment newInstance(String dialogTitle) {
        FavoritePickerListFragment picker = new FavoritePickerListFragment();
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
        View view = inflater.inflate(R.layout.favorite_layout, null);
        // Get countries from the database
        getAllFavorites();

        // Set dialog title if show as dialog
        Bundle args = getArguments();

        // Get view components
        FavoriteListView = (ListView) view
                .findViewById(R.id.favorite_picker_listview);

        // Set adapter
        adapter = new FavoriteListAdapter(getActivity(), selectedFavoritesList);
        FavoriteListView.setAdapter(adapter);

        // Inform listener
        FavoriteListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Favorite Favorite = selectedFavoritesList.get(position);
                Intent intent = Dialer.getExecutable(Favorite.getCode());
                startActivity(intent);
            }
        });
        return view;
    }

}