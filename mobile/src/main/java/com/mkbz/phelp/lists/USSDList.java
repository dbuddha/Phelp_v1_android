package com.mkbz.phelp.lists;

import java.util.List;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.mkbz.phelp.datasource.ModelDataSource;
import com.mkbz.phelp.model.USSD;

public class USSDList extends ListFragment {
    private ModelDataSource<USSD> datasource;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        datasource = new ModelDataSource<USSD>(getActivity(),USSD.TABLE,USSD.ID,new USSD());
        datasource.open();

        List<USSD> values =  datasource.getAll();



        values.add(new USSD());
        // use the SimpleCursorAdapter to show the
        // elements in a ListView
        ArrayAdapter<USSD> adapter = new ArrayAdapter<USSD>(getActivity(),android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        Log.d("ussd","activity ussd created");
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
        Log.d("ussd", "activity ussd resumed");
    }

    @Override
    public void onPause() {
        datasource.close();
        super.onPause();

        Log.d("ussd", "activity ussd paused");
    }

} 