package com.mkbz.phelp;

import java.util.List;
import java.util.Random;

import android.app.ListActivity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.model.USSD;

public class USSDListActivity extends ListFragment {
    private ModelDataSource<USSD> datasource;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datasource = new ModelDataSource<USSD>(getActivity(),USSD.TABLE,USSD.ID,new USSD());
        datasource.open();

        List<USSD> values =  datasource.getAll();

        // use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<USSD> adapter = new ArrayAdapter<USSD>(getActivity(),android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

   /* // Will be called via the onClick attribute
    // of the buttons in main.xml
    public void onClick(View view) {

        ArrayAdapter<USSD> adapter = (ArrayAdapter<USSD>) getListAdapter();
        USSD USSD = null;
        switch (view.getId()) {
            case R.id.add:
                String[] USSDs = new String[]{"Cool", "Very nice", "Hate it"};
                int nextInt = new Random().nextInt(3);
                // save the new USSD to the database
                USSD = datasource.createUSSD(USSDs[nextInt]);
                adapter.add(USSD);
                break;
            case R.id.delete:
                if (getListAdapter().getCount() > 0) {
                    USSD = (USSD) getListAdapter().getItem(0);
                    datasource.deleteUSSD(USSD);
                    adapter.remove(USSD);
                }
                break;
        }
        adapter.notifyDataSetChanged();
    }*/

    @Override
    public void onResume() {
        datasource.open();
        super.onResume();
    }

    @Override
    public void onPause() {
        datasource.close();
        super.onPause();
    }

} 