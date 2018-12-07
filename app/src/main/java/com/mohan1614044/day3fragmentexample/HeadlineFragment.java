package com.mohan1614044.day3fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HeadlineFragment extends Fragment
{
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.haedline_fragment_layout,container,false);
        return view;

    }
}


