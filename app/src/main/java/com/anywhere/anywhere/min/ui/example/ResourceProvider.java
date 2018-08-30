package com.anywhere.anywhere.min.ui.example;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ListView;

import com.nhn.android.maps.NMapOverlayItem;
import com.nhn.android.maps.overlay.NMapPOIitem;
import com.nhn.android.mapviewer.overlay.NMapResourceProvider;

/**
 * Created by ken13 on 2018-08-30.
 */

public class ResourceProvider extends NMapResourceProvider implements NMapCalloutCustomOldOverlay.ResourceProvider {
    public ResourceProvider(Context context) {
        super(context);
    }

    @Override
    protected int findResourceIdForMarker(int i, boolean b) {
        return 0;
    }

    @Override
    protected Drawable getDrawableForMarker(int i, boolean b, NMapOverlayItem nMapOverlayItem) {
        return null;
    }

    @Override
    public Drawable getCalloutBackground(NMapOverlayItem nMapOverlayItem) {
        return null;
    }

    @Override
    public String getCalloutRightButtonText(NMapOverlayItem nMapOverlayItem) {
        return null;
    }

    @Override
    public Drawable[] getCalloutRightButton(NMapOverlayItem nMapOverlayItem) {
        return new Drawable[0];
    }

    @Override
    public Drawable[] getCalloutRightAccessory(NMapOverlayItem nMapOverlayItem) {
        return new Drawable[0];
    }

    @Override
    public int[] getCalloutTextColors(NMapOverlayItem nMapOverlayItem) {
        return new int[0];
    }

    @Override
    public Drawable[] getLocationDot() {
        return new Drawable[0];
    }

    @Override
    public Drawable getDirectionArrow() {
        return null;
    }

    @Override
    public int getParentLayoutIdForOverlappedListView() {
        return 0;
    }

    @Override
    public int getOverlappedListViewId() {
        return 0;
    }

    @Override
    public int getLayoutIdForOverlappedListView() {
        return 0;
    }

    @Override
    public void setOverlappedListViewLayout(ListView listView, int i, int i1, int i2) {

    }

    @Override
    public int getListItemLayoutIdForOverlappedListView() {
        return 0;
    }

    @Override
    public int getListItemTextViewId() {
        return 0;
    }

    @Override
    public int getListItemTailTextViewId() {
        return 0;
    }

    @Override
    public int getListItemImageViewId() {
        return 0;
    }

    @Override
    public int getListItemDividerId() {
        return 0;
    }

    @Override
    public void setOverlappedItemResource(NMapPOIitem nMapPOIitem, ImageView imageView) {

    }
}
