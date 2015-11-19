package com.mkbz.phelp.lists;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.ArrayAdapter;

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

        datasource = new ModelDataSource<Operator>(getActivity(), Operator.TABLE,Operator.ID,new Operator());
        datasource.open();

        List<Operator> values =  datasource.getAll();

        values.add(new Operator());
        // use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<Operator> adapter = new ArrayAdapter<Operator>(getActivity(),android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        Log.d("Country", "activity Operator created");
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
