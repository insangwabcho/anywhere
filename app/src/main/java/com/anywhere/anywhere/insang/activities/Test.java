package com.anywhere.anywhere.insang.activities;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.src.manager.TripManager;
import com.anywhere.anywhere.insang.models.dto.ObjectDTO;
import com.odsay.odsayandroidsdk.API;
import com.odsay.odsayandroidsdk.ODsayData;
import com.odsay.odsayandroidsdk.ODsayService;
import com.odsay.odsayandroidsdk.OnResultCallbackListener;

public class Test {

  public void test() {



    TripManager manager = TripManager.getInstance();

    manager.newTrip();
    manager.insertSchedule(1, 1, new ObjectDTO());

    manager.removeSchedule(1, 2);



  }

}
