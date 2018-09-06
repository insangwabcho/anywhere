package com.anywhere.anywhere.insang.src.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.TripDTO;

import java.util.ArrayList;

public class TripListAdapter extends ArrayAdapter<TripDTO> {

  private LayoutInflater inflater;
  private ArrayList<TripDTO> itemList;
  private int layout;
  private Context context;

  public TripListAdapter(Context context, int layoutResourceId, ArrayList<TripDTO> data) {
    super(context, layoutResourceId, data);
    this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    this.layout = layoutResourceId;
    this.context = context;
    this.itemList = data;
  }

  @Override
  public int getCount() {
    return itemList.size();
  }

  @Override
  public TripDTO getItem(int position) {
    return itemList.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {

    if (convertView == null) {
      convertView = inflater.inflate(layout, parent, false);
    }

    TripDTO item = itemList.get(position);
    TextView itemName = convertView.findViewById(R.id.trip_name);
    itemName.setText(item.getTripName());

    return convertView;

  }
}
