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

        TripManager manager= TripManager.getInstance();
        manager.newTrip();

        PlaceDTO place= new PlaceDTO();

    }
}
