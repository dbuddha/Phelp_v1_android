package com.mkbz.phelp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.mkbz.phelp.model.Country;

import java.util.Comparator;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CountryPickerDialogFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CountryPickerDialogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CountryPickerDialogFragment extends DialogFragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment CountryPickerDialogFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CountryPickerDialogFragment newInstance() {
        CountryPickerDialogFragment fragment = new CountryPickerDialogFragment();
        return fragment;
    }

    public CountryPickerDialogFragment() {
        // Required empty public constructor
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void search(String text) {
        return;
    }

    /**
     * Support sorting the countries list
     */
    private ListView countryListView;
    private EditText searchEditText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        searchEditText = (EditText) container.findViewById(R.id.country_picker_search);
        countryListView = (ListView) container.findViewById(R.id.fragment_list_country);

        searchEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                search(s.toString());
            }
        });
        if (MainActivity.view != null) {
            ViewGroup parent = (ViewGroup) MainActivity.view.getParent();
            if (parent != null)
                parent.removeView(MainActivity.view);
        }
        try {
            getDialog().setTitle("Select Country");
            MainActivity.view = inflater.inflate(R.layout.country_dialog_layout, container, false);
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        return MainActivity.view;
    }
  /*  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getDialog().setTitle("Select Country");
        return inflater.inflate(R.layout.country_dialog_layout, container, false);
    }*/

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
