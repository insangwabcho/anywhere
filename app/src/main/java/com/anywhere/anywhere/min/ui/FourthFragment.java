package com.anywhere.anywhere.min.ui;




import android.os.Bundle;
import android.support.annotation.Nullable;


import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.src.fragment.SlidingDrawer;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment implements View.OnClickListener{

    private RecyclerView rvContacts;
    private Button mCreateBtn;
    private String formName;
    private View view;

    public FourthFragment() {
        // Required empty public constructor
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fourth_fragment_layout, container, false);

    }

    @Override
    public void onClick(View view) {

    }
}
