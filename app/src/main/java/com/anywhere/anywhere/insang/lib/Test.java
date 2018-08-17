package com.anywhere.anywhere.insang.lib;

import com.anywhere.anywhere.insang.models.dao.manager.TripManager;

public class Test {

    public void test(){

        TripManager manager= TripManager.getInstance();

        manager.newTrip();

        manager.newSchedule();

    }

}
