package com.anywhere.anywhere.insang.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.PlaceDTO;
import com.anywhere.anywhere.insang.src.function.Route;
import com.anywhere.anywhere.insang.src.manager.PathManager;

public class TestActivity extends AppCompatActivity {

  Button btnHomeActivity;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.insang_test);

    btnHomeActivity = (Button) findViewById(R.id.btnHomeActivity);
    btnHomeActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(TestActivity.this, HomeActivity.class);
        startActivity(intent);
      }
    });

    PathManager pfManager = PathManager.getInstance(this);
    pfManager.searchForPath(new PlaceDTO(), new PlaceDTO(), Route.OPT_SHORTEST);



  }
}
