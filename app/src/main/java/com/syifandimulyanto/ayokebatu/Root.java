package com.syifandimulyanto.ayokebatu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class Root extends Fragment {

    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_home, container, false);

        getActivity().setTitle("Ayokebatu Apps");

        return rootView;
    }
}
