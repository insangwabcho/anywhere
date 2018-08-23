package com.anywhere.anywhere.min.ui;


import android.app.AlertDialog;



import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.min.config.AnyWhere;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.nhn.android.maps.NMapContext;
import com.nhn.android.maps.NMapLocationManager;
import com.nhn.android.maps.NMapOverlayItem;
import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.maplib.NGeoPoint;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{

    private MapView mapView = null;

    private GoogleMap map = null;
    private NMapView naverMapView;
    private NMapContext mMapContext;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        naverMapView = (NMapView)getView().findViewById(R.id.nmap);
        naverMapView.setClientId(AnyWhere.ClientID);

        naverMapView.setClickable(true);
        naverMapView.setEnabled(true);
        naverMapView.setFocusable(true);
        naverMapView.setFocusableInTouchMode(true);
        naverMapView.requestFocus();
        NGeoPoint point = new NGeoPoint(127.3333, 37.2123);
        NMapLocationManager locationManager = new NMapLocationManager(getContext());
        locationManager.enableMyLocation(true);
        //point = locationManager.getMyLocation();

        Drawable mark =  getResources().getDrawable(R.drawable.ic_fourth);
        NMapOverlayItem item = new NMapOverlayItem(point,"test", "test",mark);
        item.setVisibility(NMapOverlayItem.VISIBLE );
        System.out.println("x: "+item.getPoint().getLatitude() + ","+ "y: "+ item.getPoint().getLongitude());


        mMapContext.setupMapView(naverMapView);



    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapContext =  new NMapContext(super.getActivity());
        mMapContext.onCreate();

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment_layout, container, false);

       // mapView = (MapView) view.findViewById(R.id.map);

       // mapView.getMapAsync(this);


        return view;
    }

    @Override
    public void onClick(View view) {

    }
    /*@Override
    public void onMapReady(final GoogleMap map) {


        LatLng SEOUL = new LatLng(37.56, 126.97);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        markerOptions.title("서울");
        markerOptions.snippet("한국의 수도");
        map.addMarker(markerOptions);

        map.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
        map.animateCamera(CameraUpdateFactory.zoomTo(10));
        System.out.println("map ready");
    }*/

    @Override
    public void onStart(){
        super.onStart();
        mMapContext.onStart();
    }
    @Override
    public void onResume() {
        super.onResume();
        mMapContext.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
        mMapContext.onPause();
    }
    @Override
    public void onStop() {
        mMapContext.onStop();
        super.onStop();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    @Override
    public void onDestroy() {
        mMapContext.onDestroy();
        super.onDestroy();
    }


}
