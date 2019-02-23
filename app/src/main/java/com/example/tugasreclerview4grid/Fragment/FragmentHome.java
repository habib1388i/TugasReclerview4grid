package com.example.tugasreclerview4grid.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugasreclerview4grid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {
    RecyclerView rvHome;
    HomeAdapeter adapeter;

    String[] namahome = {"laptop","lampu","stopkontak","hp","casing","casan"};
    String[] harganya = {"RP.3000000","RP.3000000","RP.3000000","RP.3000000","RP.3000000","RP.3000000"};
    int[] gambarhome = {R.drawable.laptop,R.drawable.lampu,R.drawable.stopkontak,R.drawable.hp,R.drawable.casing,R.drawable.casan};


    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_home, container, false);
        rvHome = v.findViewById(R.id.rv_home);
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvHome.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        adapeter= new HomeAdapeter(getActivity(),namahome,gambarhome,harganya);
        rvHome.setAdapter(adapeter);
    }
}
