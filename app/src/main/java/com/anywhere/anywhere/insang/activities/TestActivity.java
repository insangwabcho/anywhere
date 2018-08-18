package com.anywhere.anywhere.insang.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.PlaceDTO;
import com.anywhere.anywhere.insang.src.manager.TripManager;

public class TestActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.insang_test);

    TripManager manager = TripManager.getInstance();
    manager.newTrip();

    int day = 1;

    PlaceDTO place = new PlaceDTO();
    place.setGpsX("12.222222");
    place.setGpsY("13.333333");
    place.setInfoUrl("http://test.com/test/test");
    place.setName("testName");
    place.setPoiId("PoiId");
    place.setPoiNm("poiNm");
    place.setSortNo(0);

    manager.insertSchedule(day, 1, place);

    System.out.println("hello");

  }
}
