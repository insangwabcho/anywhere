package com.anywhere.anywhere.min.ui;




import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;


import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.min.config.AnyWhere;
import com.anywhere.anywhere.min.ui.example.NMapPOIflagType;
import com.anywhere.anywhere.min.ui.example.NMapViewerResourceProvider;
import com.anywhere.anywhere.min.util.NaverAPI;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.nhn.android.maps.NMapContext;
import com.nhn.android.maps.NMapController;
import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.overlay.NMapPOIdata;
import com.nhn.android.maps.overlay.NMapPOIitem;
import com.nhn.android.mapviewer.overlay.NMapOverlayManager;
import com.nhn.android.mapviewer.overlay.NMapPOIdataOverlay;


/**
 * A simple {@link Fragment} subclass.
 */
public class  ThirdFragment extends Fragment implements View.OnClickListener{

    private RecyclerView rvContacts;
    private Button mCreateBtn;
    private String formName;
    private View view;

    private NMapView mMapView;
    private NMapContext mMapContext;

    private NMapController mMapController;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        mMapView = (NMapView)getView().findViewById(R.id.ntestmap);
        mMapView.setClientId(AnyWhere.ClientID);
        mMapContext.setupMapView(mMapView);

        mMapView.setClickable(true);
        mMapView.setEnabled(true);
        mMapView.setFocusable(true);
        mMapView.setFocusableInTouchMode(true);
        mMapView.requestFocus();
       // mMapView.setOnMapStateChangeListener(onMapViewStateChangeListener);
       // mMapView.setOnMapViewTouchEventListener(onMapViewTouchEventListener);
        mMapController = mMapView.getMapController();
        NMapViewerResourceProvider mMapViewerResourceProvider = new NMapViewerResourceProvider(getContext());

        NMapOverlayManager mOverlayManager = new NMapOverlayManager(getContext(), mMapView, mMapViewerResourceProvider);

        int markerId = NMapPOIflagType.PIN;

// set POI data
        NMapPOIdata poiData = new NMapPOIdata(2, mMapViewerResourceProvider);

        poiData.beginPOIdata(2);
        poiData.addPOIitem(127.0630205, 37.5091300, "Pizza 777-111", markerId, 0);
        poiData.addPOIitem(127.061, 37.51, "Pizza 123-456", markerId, 0);

        poiData.endPOIdata();

// create POI data overlay
        NMapPOIdataOverlay poiDataOverlay = mOverlayManager.createPOIdataOverlay(poiData, null);

        //poiDataOverlay.setOnStateChangeListener(onPOIdataStateChangeListener);
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getActivity().getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);

        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {

                System.out.println("search: "+ place.getAddress());
                Location location = new Location("");
                location.setLatitude(place.getLatLng().latitude);
                location.setLongitude(place.getLatLng().longitude);
                NaverAPI api = new NaverAPI();
                api.test((String) place.getAddress());



            }

            @Override
            public void onError(Status status) {
                Log.i("tag", "An error occurred: " + status);
            }
        });



    }

    public void onCalloutClick(NMapPOIdataOverlay poiDataOverlay, NMapPOIitem item) {
        // [[TEMP]] handle a click event of the callout
        Toast.makeText(getContext(), "onCalloutClick: " + item.getTitle(), Toast.LENGTH_LONG).show();
    }

    public void onFocusChanged(NMapPOIdataOverlay poiDataOverlay, NMapPOIitem item) {
        if (item != null) {
            Log.i("log", "onFocusChanged: " + item.toString());
        } else {
            Log.i("log", "onFocusChanged: ");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.third_fragment_layout, container, false);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapContext =  new NMapContext(super.getActivity());
        mMapContext.onCreate();

    }


}
