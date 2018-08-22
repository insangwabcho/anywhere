package com.anywhere.anywhere.insang.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.ObjectDTO;
import com.anywhere.anywhere.insang.src.manager.TripManager;
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

    Context context = new AppCompatActivity();

    ODsayService ods = ODsayService.init(context, context.getString(R.string.odsay_key));

    String sx = "37.5338038";
    String sy = "126.96532830000001";
    String ex = "37.58208";
    String ey = "127.001892";
    String opt = "0";
    String searchtype = "0";
    String searchpathtype = "0";


    ods.requestSearchPubTransPath(sx, sy, ex, ey, opt, searchtype, searchpathtype, new OnResultCallbackListener() {
      @Override
      public void onSuccess(ODsayData oDsayData, API api) {
        System.out.println(oDsayData.getJson());
      }

      @Override
      public void onError(int i, String s, API api) {
        System.out.println("on error");
      }
    });

  }

}
