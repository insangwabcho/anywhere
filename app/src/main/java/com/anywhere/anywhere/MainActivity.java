package com.anywhere.anywhere;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anywhere.anywhere.insang.activities.HomeActivity;
import com.anywhere.anywhere.insang.activities.TestActivity;
import com.anywhere.anywhere.min.MinActivity;

public class MainActivity extends AppCompatActivity {

    Button btnInsang;
    Button btnMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//    //Handler 이용 2초후 HomeActivity로 화면 전환
//    Handler handler= new Handler();
//    handler.postDelayed(new Runnable(){
//      @Override
//      public void run() {
//        Intent homeIntent= new Intent(MainActivity.this,MinActivity.class);
//        startActivity(homeIntent);
//        finish();
//      }
//    }, 1000);

    btnInsang= (Button) findViewById(R.id.btnInsang);
    btnMin= (Button) findViewById(R.id.btnMin);

    btnInsang.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(MainActivity.this, TestActivity.class);
            startActivity(intent);
            finish();
        }
    });

    btnMin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(MainActivity.this, MinActivity.class);
            startActivity(intent);
            finish();
        }
    });

    }
}