package com.anywhere.anywhere;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anywhere.anywhere.insang.activities.HomeActivity;

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
        Intent homeIntent= new Intent(MainActivity.this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
      }
    }, 2000);

  }
}