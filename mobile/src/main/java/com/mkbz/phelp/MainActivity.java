package com.mkbz.phelp;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.internal.view.SupportMenuInflater;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.mkbz.phelp.dialer.DialCommand;
import com.mkbz.phelp.model.Emergency;
import com.mkbz.phelp.model.USSD;
import com.mkbz.phelp.utils.PromptRunnable;
import com.mkbz.phelp.view.country.CountryListAdapter;
import com.mkbz.phelp.view.country.CountryPickerDialogFragment;
import com.mkbz.phelp.view.emergency.EmergencyPickerListFragment;
import com.mkbz.phelp.view.favorite.FavoritePickerListFragment;
import com.mkbz.phelp.view.operator.OperatorPickerDialogFragment;
import com.mkbz.phelp.lists.*;
import com.mkbz.phelp.view.ussd.USSDPickerListFragment;

import java.lang.reflect.Field;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TabListener{
    public static final String MyPREFERENCES = "myprefs";
    public static final String COUNTRY_PICKER = "COUNTRY_PICKER";
    public static final String OPERATOR_PICKER = "OPERATOR_PICKER";
    public static final String COLOR_BACKGROUND_PHELP = "#BF392B";
    // Declare
    public static final int PICK_CONTACT=1;
    public static final int PICK_VALUE=2;

    private static final Drawable background_color = new ColorDrawable(Color.parseColor(COLOR_BACKGROUND_PHELP));
    public static Menu menu;
    private static DialCommand currentDialer;

    public static SharedPreferences getSharedPreferences() {
        return sharedPreferences;
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
    public void toggleFavorite(View v){
        ListView listview = (ListView) v.getParent().getParent();
        USSD aux = (USSD) listview.getItemAtPosition(listview.getPositionForView((View) v.getParent()));
        String type="USSD";//é ussd ou emergency
        long fk =  aux.getId();//fk do objecto clicado
        boolean activo = aux.toggleFavorite();
        ImageView icon = (ImageView) v;
        if (activo) {
            icon.setImageResource(getResId("favorite_on"));
        // removelista()
        } else {
            icon.setImageResource(getResId("favorite_off"));
       //     colocaiconon()
        //    addlista()
        }
       // toggleBD(type,fk);
    }

    public static void setSharedPreferences(SharedPreferences sharedPreferences) {
        MainActivity.sharedPreferences = sharedPreferences;
    }

    private static SharedPreferences sharedPreferences;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    public static EmergencyPickerListFragment emergencyFragment;
    public static USSDPickerListFragment ussdFragment;
    public static FavoritePickerListFragment favoriteFragment;
    public static Context context;
    public static MainActivity fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emergencyFragment = new EmergencyPickerListFragment();
        favoriteFragment = new FavoritePickerListFragment();
        ussdFragment = new USSDPickerListFragment();
        context = getApplicationContext();
        fragmentManager = this;

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);



        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        actionBar.setBackgroundDrawable(background_color);
        //nao me perguntes porque mas se nao tiver aqui o new não fica com a cor na de cima
        actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor(COLOR_BACKGROUND_PHELP)));

        // Create the adapter.java that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.java.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter.java. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            int[] icon = {R.drawable.ic_sos, R.drawable.ic_ussd};
            actionBar.addTab(
                    actionBar.newTab()
                            .setText("  " + mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this)
                            .setIcon(icon[i]));
        }
    }

    private static MenuItem countryIcon;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        MainActivity.menu=menu;
        setCountryIcon(menu, inflater);
        return true;
    }


    public void executeCommand(Intent i){
        startActivity(i);
    }

    public static void runCommand(String code){
        DialCommand command = new DialCommand(code,fragmentManager);
        currentDialer = command;
        currentDialer.execute();

    }

    public static void updatedCountry() {
        countryIcon = menu.findItem(R.id.select_country);
        String drawableName = "flag"+sharedPreferences.getString("country_id","PT").toLowerCase(Locale.ENGLISH);
        int id = -1;
        try {
            Class<R.drawable> res = R.drawable.class;
            Field field = res.getField(drawableName);
            int drawableId = field.getInt(null);
            id =  drawableId;
        } catch (Exception e) {
            Log.e("COUNTRYPICKER", "Failure to get drawable id.", e);
        }
        if (id!=-1)
            countryIcon.setIcon(id);
    }


    private void setCountryIcon(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        countryIcon = menu.findItem(R.id.select_country);
        String drawableName = "flag"+sharedPreferences.getString("country_id","PT").toLowerCase(Locale.ENGLISH);
        int id = -1;
        try {
            Class<R.drawable> res = R.drawable.class;
            Field field = res.getField(drawableName);
            int drawableId = field.getInt(null);
            id =  drawableId;
        } catch (Exception e) {
            Log.e("COUNTRYPICKER", "Failure to get drawable id.", e);
        }
        if (id!=-1)
        countryIcon.setIcon(id);
    }

    public static View view;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.select_country) {
             CountryPickerDialogFragment picker = CountryPickerDialogFragment.newInstance("Select Country",getSupportFragmentManager());
             picker.show(getSupportFragmentManager(), COUNTRY_PICKER);

        }
        if (id == R.id.select_operator) {
            OperatorPickerDialogFragment picker = OperatorPickerDialogFragment.newInstance("Select Operator");
            picker.show(getSupportFragmentManager(), OPERATOR_PICKER);
        }
        if (id == R.id.contact_button) {
/*
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setType("plain/text");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"mkbzdev@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Support");
            startActivity(Intent.createChooser(intent, "Select Mail App"));
*/

            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","mkbzdev@gmail.com", null));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Support");
            String [] addresses = {"mkbzdev@gmail.com"};
            emailIntent.putExtra(Intent.EXTRA_EMAIL, addresses);
            startActivity(Intent.createChooser(emailIntent, "Send email..."));


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction) {

    }



    //code
    @Override
    public void onActivityResult(int reqCode, int resultCode, Intent data) {

        super.onActivityResult(reqCode, resultCode, data);
        Log.i("activityResult", "reached activity result with following params:"
                + reqCode + " , "
                + resultCode);

        switch (reqCode) {
            case (PICK_CONTACT) :
                if (resultCode == Activity.RESULT_OK) {
                    String cNumber;
                    Uri contactData = data.getData();
                    Cursor c =  managedQuery(contactData, null, null, null, null);
                    if (c.moveToFirst()) {
                        String id =c.getString(c.getColumnIndexOrThrow(ContactsContract.Contacts._ID));
                        String hasPhone =c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));

                        if (hasPhone.equalsIgnoreCase("1")) {
                            Cursor phones = getContentResolver().query(
                                    ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,
                                    ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+ id,
                                    null, null);
                            phones.moveToFirst();
                            cNumber = phones.getString(phones.getColumnIndex("data1"));
                            currentDialer.fixNumber(cNumber);
                        }
                        String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));


                    }
                }
                break;
        }
    }

    public void promptForResult(final PromptRunnable postrun) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Value");
        alert.setMessage("Choose your value");
        // Create textbox to put into the dialog
        final EditText input = new EditText(this);
        // put the textbox into the dialog
        input.setInputType(EditorInfo.TYPE_CLASS_NUMBER);
        alert.setView(input);
        // procedure for when the ok button is clicked.
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String value = input.getText().toString();
                dialog.dismiss();
                // set value from the dialog inside our runnable implementation
                postrun.setValue(value);
                // ** HERE IS WHERE THE MAGIC HAPPENS! **
                // now that we have stored the value, lets run our Runnable
                postrun.run();
                return;
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                return;
            }
        });
        alert.show();
    }
    public void promptContactForResult(final PromptRunnable postRun,final PromptRunnable contactRun) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Number");
        alert.setMessage("Choose number");
        // Create textbox to put into the dialog
        final EditText input = new EditText(this);
        input.setInputType(EditorInfo.TYPE_CLASS_NUMBER);
        // put the textbox into the dialog
        alert.setView(input);

        input.setInputType(EditorInfo.TYPE_CLASS_NUMBER);
        alert.setNeutralButton("Contacts", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
                contactRun.run();
                return;
            }
        });

        // procedure for when the ok button is clicked.
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String value = input.getText().toString();
                dialog.dismiss();
                // set value from the dialog inside our runnable implementation
                postRun.setValue(value);
                // ** HERE IS WHERE THE MAGIC HAPPENS! **
                // now that we have stored the value, lets run our Runnable
                postRun.run();
                return;
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                return;
            }
        });
        alert.show();
    }

    public void setCurrentDialer(DialCommand currentDialer) {
        this.currentDialer = currentDialer;
    }

    public DialCommand getCurrentDialer() {
        return currentDialer;
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public Fragment[] fragments={emergencyFragment,ussdFragment};

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return fragments[position];
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

}
