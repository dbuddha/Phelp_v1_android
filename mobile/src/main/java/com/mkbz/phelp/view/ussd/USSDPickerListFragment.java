package com.mkbz.phelp.view.ussd;

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
import com.mkbz.phelp.model.USSD;

import java.util.ArrayList;
import java.util.List;

public class USSDPickerListFragment extends Fragment{
    /**
     * View components
     */
    private static ViewGroup container;
    private ListView USSDListView;

    /**
     * Adapter for the listview
     */
    private USSDListAdapter adapter;

    /**
     * Hold all countries, sorted by country name
     */
    private List<USSD> allUSSDList;

    /**
     * Hold countries that matched user query
     */
    private List<USSD> selectedUSSDList;

    /**
     * Listener to which country user selected
     */
    private USSDPickerListener listener;

    /**
     * Set listener
     *
     * @param listener
     */
    public void setListener(USSDPickerListener listener) {
        this.listener = listener;
    }

    public ListView getUSSDListView() {
        return USSDListView;
    }


    public void updatedOperator() {
       /* allEmergencysList=null;
        adapter.updateData(getAllEmergencys());*/
        allUSSDList = null;
        adapter.updateData(getAllUSSD());
        //adapter.notifyDataSetChanged();
    }

    /**
     * Get all countries with code and name from res/raw/countries.json
     *
     * @return
     */
    private List<USSD> getAllUSSD() {
        if (allUSSDList == null) {
            try {
                ModelDataSource<USSD> datasource;
                allUSSDList = new ArrayList<USSD>();
                datasource = new ModelDataSource<>(getActivity(), USSD.TABLE, USSD.ID, new USSD());
                datasource.open();
                Long operator_id = MainActivity.getSharedPreferences().getLong("operator_id", 0);
                String aux = String.valueOf(operator_id);
                Log.d(aux, "Country value before Emergency query");
                 allUSSDList.addAll(datasource.getAll("operator_id = ?", new String[]{aux}));
                //allEmergencysList.addAll(datasource.getAll(null,null));

                selectedUSSDList = new ArrayList<USSD>();
                selectedUSSDList.addAll(allUSSDList);
                datasource.close();
                return allUSSDList;

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
    public static USSDPickerListFragment newInstance(String dialogTitle) {
        USSDPickerListFragment picker = new USSDPickerListFragment();
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
        View view = inflater.inflate(R.layout.ussd_layout, null);
        // Get countries from the database
        getAllUSSD();

        // Set dialog title if show as dialog
        Bundle args = getArguments();

        // Get view components
        USSDListView = (ListView) view
                .findViewById(R.id.ussd_picker_listview);

        // Set adapter
        adapter = new USSDListAdapter(getActivity(), selectedUSSDList);
        USSDListView.setAdapter(adapter);

        // Inform listener
        USSDListView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                USSD ussd = selectedUSSDList.get(position);

                MainActivity.runCommand(ussd.getCode());
            }
        });
        return view;
    }

}