package com.mkbz.phelp.lists;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.R;
import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.model.Country;


import java.util.List;

/**
 * Created by Jos on 17/11/2015.
 */
    public class CountryList extends ListFragment {
        private ModelDataSource<Country> datasource;

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            datasource = new ModelDataSource<Country>(getActivity(), Country.TABLE,Country.ID,new Country());
            datasource.open();

            List<Country> values =  datasource.getAll(null,null);

           // values.add(new Country());
            // use the SimpleCursorAdapter to show the
            // elements in a ListView
            ArrayAdapter<Country> adapter = new ArrayAdapter<Country>(getActivity(), android.R.layout.simple_list_item_1, values);
            setListAdapter(adapter);
            Log.d("Country", "activity Country created");
        }
        @Override
        public void onListItemClick(ListView l, View v, int position, long id){
            SharedPreferences.Editor editor = MainActivity.getSharedPreferences().edit();
            editor.putLong("country_id", id);
            editor.commit();
            //datasource.get(id);
            Long aux = MainActivity.getSharedPreferences().getLong("country_id", 0);
            Log.d("Country", aux.toString());
        }
        @Override
        public void onResume() {
            datasource.open();
            super.onResume();
            Log.d("Country", "activity Country resumed");
        }

        @Override
        public void onPause() {
            datasource.close();
            super.onPause();
            Log.d("Country", "activity Country paused");
        }

    }
