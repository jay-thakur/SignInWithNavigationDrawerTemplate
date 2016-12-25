package com.appniche.signinwithnavigationdrawertemplate;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {

    private static final String LOG_TAG = MainActivityFragment.class.getSimpleName();
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_main_activity, container, false);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        Log.d(LOG_TAG, "Current login user is :"+user.getEmail());

        Toast.makeText(getActivity(), "Welcome To main page "+user.getEmail(), Toast.LENGTH_LONG).show();

        return rootView;
    }

}
