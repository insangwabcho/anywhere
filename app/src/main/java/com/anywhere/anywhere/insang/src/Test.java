package com.anywhere.anywhere.insang.src;

import com.anywhere.anywhere.insang.src.manager.TripManager;
import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;

public class Test {

    public void test(){

        TripManager manager= TripManager.getInstance();

        manager.newTrip();
        manager.insertSchedule(1,1, new ObjectDTO());

        manager.removeSchedule(1, 2);

    }

}
