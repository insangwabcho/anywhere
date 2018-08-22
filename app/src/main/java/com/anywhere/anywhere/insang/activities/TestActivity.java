package com.anywhere.anywhere.insang.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.ObjectDTO;
import com.anywhere.anywhere.insang.models.dto.PathDTO;
import com.anywhere.anywhere.insang.models.dto.PlaceDTO;
import com.anywhere.anywhere.insang.src.manager.TripManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.odsay.odsayandroidsdk.API;
import com.odsay.odsayandroidsdk.ODsayData;
import com.odsay.odsayandroidsdk.ODsayService;
import com.odsay.odsayandroidsdk.OnResultCallbackListener;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class TestActivity extends AppCompatActivity {

  Button btnHomeActivity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.insang_test);

    btnHomeActivity= (Button)findViewById(R.id.btnHomeActivity);
    btnHomeActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent= new Intent(TestActivity.this, HomeActivity.class);
        startActivity(intent);
      }
    });

    ODsayService ods= ODsayService.init(this, this.getString(R.string.odsay_key));

    String sy= "37.5338038";
    String sx= "126.96532830000001";
    String ey= "37.58208";
    String ex= "127.001892";
    String opt= "0";
    String searchtype= "0";
    String searchpathtype= "0";




    ods.requestSearchPubTransPath(sx, sy, ex, ey, opt, searchtype, searchpathtype, new OnResultCallbackListener() {
      @Override
      public void onSuccess(ODsayData oDsayData, API api) {
        PathDTO dto= jsonParseTest(oDsayData.getJson().toString(), PathDTO.class);
      }

      @Override
      public void onError(int i, String s, API api) {
        System.out.println("on error");
      }
    });

  }

  public <T> T jsonParseTest(String json, Class<T> dto){
    Gson gson= new GsonBuilder().create();
    return gson.fromJson(json, dto);
  }
}
