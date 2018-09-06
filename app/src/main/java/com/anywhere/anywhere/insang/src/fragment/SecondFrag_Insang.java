package com.anywhere.anywhere.insang.src.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.src.adapter.TripListAdapter;
import com.anywhere.anywhere.insang.models.dto.TripDTO;
import com.anywhere.anywhere.min.MinActivity;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFrag_Insang extends Fragment implements View.OnClickListener {

  private int TRIP_LIST_COUNT;

  private SlidingDrawer mSlidingDrawer;
  private ListView listView;

  public SecondFrag_Insang() {
    // Required empty public constructor
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    listView= getActivity().findViewById(R.id.list);

    //여행 목록 arrayist
    final ArrayList<TripDTO> tripData = new ArrayList<>();

    //여행 목록 리스트를 DB에서 불러와야 함. 지금은 for문으로 임의로 갯수 설정
    for (int i = 0; i < 20; i++) {
      TripDTO item = new TripDTO();
      item.setTripName("trip" + (i + 1));

      tripData.add(item);
    }

    //ListView Adapter
    TripListAdapter adapter = new TripListAdapter(getActivity(), R.layout.insang_trip_list, tripData);

    listView.setAdapter(adapter);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    //여행 목록 갯수 파악 (DB에서);
    TRIP_LIST_COUNT = 4;

    View v;

    if (TRIP_LIST_COUNT == 0) {
      v = inflater.inflate(R.layout.insang_secondfrag_empty, container, false);
    } else {
      v = inflater.inflate(R.layout.insang_secondfrag, container, false);
    }

    return v;
  }


  /* fragment가 activity에 붙는순간 콜백 */
  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    mSlidingDrawer = ((MinActivity) getActivity()).getDrawer();
  }



  @Override
  public void onStart() {
    super.onStart();
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "test: " + position, Toast.LENGTH_SHORT).show();
      }
    });
  }


  @Override
  public void onClick(View v) {
    System.out.println("onclick");
  }
}
