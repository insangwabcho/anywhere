package com.anywhere.anywhere;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anywhere.anywhere.insang.activities.HomeActivity;
import com.anywhere.anywhere.min.MinActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Handler 이용 2초후 HomeActivity로 화면 전환
    Handler handler= new Handler();
    handler.postDelayed(new Runnable(){
      @Override
      public void run() {
        Intent homeIntent= new Intent(MainActivity.this, MinActivity.class);
        startActivity(homeIntent);
        finish();
      }
    }, 1000);

  }
}