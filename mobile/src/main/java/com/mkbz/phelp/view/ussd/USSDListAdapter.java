package com.mkbz.phelp.view.ussd;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mkbz.phelp.R;
import com.mkbz.phelp.model.Emergency;
import com.mkbz.phelp.model.USSD;

import java.lang.reflect.Field;
import java.util.List;

public class USSDListAdapter extends BaseAdapter {

    private Context context;
    List<USSD> ussdList;
    LayoutInflater inflater;

    public void updateData(List<USSD> list){
        ussdList=list;
        notifyDataSetChanged();
    }
    /**
     * The drawable image name has the format "flag_$countryCode". We need to
     * load the drawable dynamically from country code. Code from
     * http://stackoverflow.com/
     * questions/3042961/how-can-i-get-the-resource-id-of
     * -an-image-if-i-know-its-name
     *
     * @param drawableName
     * @return
     */
    private int getResId(String drawableName) {

        try {
            Class<R.drawable> res = R.drawable.class;
            Field field = res.getField(drawableName);
            int drawableId = field.getInt(null);
            return drawableId;
        } catch (Exception e) {
            Log.e("USSDPicker", "Failure to get drawable id.", e);
        }

        return -1;
    }

    /**
     * Constructor
     *
     * @param context
     * @param ussdList
     */
    public USSDListAdapter(Context context, List<USSD> ussdList) {
        super();
        this.context = context;
        this.ussdList = ussdList;
        inflater = (LayoutInflater) this.context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return ussdList.size();
    }

    @Override
    public Object getItem(int arg0) {
        return ussdList.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return ussdList.get(arg0).getId();
    }

    /**
     * Return row for each country
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View cellView = convertView;
        Cell cell;
        USSD ussd = ussdList.get(position);

        if (convertView == null) {
            cell = new Cell();
            cellView = inflater.inflate(R.layout.fragment_list_ussd_item, null);
            cell.textView = (TextView) cellView.findViewById(R.id.row_title);
       //     cell.imageView = (ImageView) cellView.findViewById(R.id.row_icon);
      //      cell.favorite = (ImageView) cellView.findViewById(R.id.favorite_icon);
            cellView.setTag(cell);
        } else {
            cell = (Cell) cellView.getTag();
        }
        if(ussd.getTitle().length()!=0)
             cell.textView.setText(ussd.getTitle());
        else cell.textView.setText(ussd.getDescription());

        String drawableName = "ussd_"+ussd.getTitle().replace(' ', '_').toLowerCase();
/*
        if (getResId(drawableName)!=-1)
                cell.imageView.setImageResource(getResId(drawableName));
        else cell.imageView.setImageResource(0);*/
   //     else cell.imageView.setImageResource(getResId("no_image_default"));

        //favorite
//        cell.favorite.setImageResource(getResId("favorite_off"));
        return cellView;
    }

    /**
     * Holder for the cell
     *
     */
    static class Cell {
        public TextView textView;
        public ImageView imageView;
        public ImageView favorite;

    }

}