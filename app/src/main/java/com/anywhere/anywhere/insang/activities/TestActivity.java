package com.anywhere.anywhere.insang.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.min.MinActivity;

public class TestActivity extends AppCompatActivity {

  Button btnHomeActivity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.insang_test);

    btnHomeActivity = findViewById(R.id.btnHomeActivity);

    btnHomeActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(TestActivity.this, HomeActivity.class);
        startActivity(intent);
      }
    });

  }
}
