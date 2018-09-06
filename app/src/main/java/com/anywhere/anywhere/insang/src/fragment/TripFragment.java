package com.anywhere.anywhere.insang.src.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.src.adapter.TripListAdapter;
import com.anywhere.anywhere.insang.models.dto.TripDTO;

import java.util.ArrayList;

public class TripFragment extends ListFragment{

  private int TRIP_LIST_COUNT;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

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

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    ArrayList<TripDTO> tripList= new ArrayList<>();

    for (int i=0; i<10; i++){
      TripDTO item= new TripDTO(i+1, "trip"+ (i+1));
      tripList.add(item);
    }

    TripListAdapter adapter= new TripListAdapter(getActivity(), R.layout.insang_trip_list, tripList);
    setListAdapter(adapter);

  }

  @Override
  public void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
  }
}
