package com.mkbz.phelp.lists;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.model.Country;
import com.mkbz.phelp.model.Operator;


import java.util.List;

/**
 * Created by Jos on 17/11/2015.
 */
public class OperatorList extends ListFragment {
    private ModelDataSource<Operator> datasource;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datasource = new ModelDataSource<>(getActivity(), Operator.TABLE,Operator.ID,new Operator());
        datasource.open();

        String aux = MainActivity.getSharedPreferences().getString("country_id", "US");
        Log.d(aux, "Country value before operator query");
        List<Operator> values =  datasource.getAll("country_id = ?", new String[]{aux});

        //values.add(new Operator());
        // use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<Operator> adapter = new ArrayAdapter<Operator>(getActivity(),android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        Log.d("Country", "activity Operator created");
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){

        SharedPreferences.Editor editor = MainActivity.getSharedPreferences().edit();
        editor.putLong("operator_id", id);
        editor.commit();
        //datasource.get(id);
        Long aux = MainActivity.getSharedPreferences().getLong("operator_id", 0);

        Log.d("Operator", aux.toString());
    }
    @Override
    public void onResume() {
        datasource.open();
        super.onResume();
        Log.d("Country", "activity Operator resumed");
    }

    @Override
    public void onPause() {
        datasource.close();
        super.onPause();

        Log.d("Country", "activity Operator paused");
    }

}
