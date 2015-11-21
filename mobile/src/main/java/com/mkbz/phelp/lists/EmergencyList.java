package com.mkbz.phelp.lists;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.model.Emergency;
import com.mkbz.phelp.model.USSD;

import java.util.List;

public class EmergencyList extends ListFragment {
    private ModelDataSource<Emergency> datasource;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datasource = new ModelDataSource<Emergency>(getActivity(),Emergency.TABLE,Emergency.ID,new Emergency());
        datasource.open();

        List<Emergency> values =  datasource.getAll();

        values.add(new Emergency());
        // use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<Emergency> adapter = new ArrayAdapter<Emergency>(getActivity(),android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        Log.d("emergency","activity Emergency created");
    }

    @Override
    public void onResume() {
        datasource.open();
        super.onResume();
        Log.d("emergency", "activity Emergency resumed");
    }

    @Override
    public void onPause() {
        datasource.close();
        super.onPause();

        Log.d("emergency", "activity Emergency paused");
    }

} 