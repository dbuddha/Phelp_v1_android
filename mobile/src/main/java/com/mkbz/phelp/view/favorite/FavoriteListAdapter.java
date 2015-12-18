package com.mkbz.phelp.view.favorite;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mkbz.phelp.R;
import com.mkbz.phelp.model.Favorite;

import java.lang.reflect.Field;
import java.util.List;

public class FavoriteListAdapter extends BaseAdapter {

    private Context context;
    List<Favorite> Favorites;
    LayoutInflater inflater;

    public void updateData(List<Favorite> list){
        Favorites=list;
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
            Log.e("FavoritePICKER", "Failure to get drawable id.", e);
        }
        return -1;
    }

    /**
     * Constructor
     *
     * @param context
     * @param Favorites
     */
    public FavoriteListAdapter(Context context, List<Favorite> Favorites) {
        super();
        this.context = context;
        this.Favorites = Favorites;
        inflater = (LayoutInflater) this.context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return Favorites.size();
    }

    @Override
    public Object getItem(int arg0) {
        return Favorites.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return Favorites.get(arg0).getId();
    }

    /**
     * Return row for each country
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View cellView = convertView;
        Cell cell;
        Favorite Favorite = Favorites.get(position);

        if (convertView == null) {
            cell = new Cell();
            cellView = inflater.inflate(R.layout.fragment_list_favorite_item, null);
            cell.textView = (TextView) cellView.findViewById(R.id.row_title);
            cell.imageView = (ImageView) cellView.findViewById(R.id.row_icon);
            cellView.setTag(cell);
        } else {
            cell = (Cell) cellView.getTag();
        }

        cell.textView.setText(Favorite.getTitle());

       String drawableName = "Favorite_"+Favorite.getTitle().replace(' ','_').toLowerCase();
        if (getResId(drawableName)!=-1)
                cell.imageView.setImageResource(getResId(drawableName));
        else cell.imageView.setImageResource(getResId("no_image_default"));
        return cellView;
    }

    /**
     * Holder for the cell
     *
     */
    static class Cell {
        public TextView textView;
        public ImageView imageView;
    }

}