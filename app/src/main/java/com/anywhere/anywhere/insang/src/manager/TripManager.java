//region # 18.08.18 생성 --insang
// endregion

package com.anywhere.anywhere.insang.src.manager;

import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;
import com.anywhere.anywhere.insang.src.MyTrip;

public class TripManager extends MyTrip {

    private static TripManager instance;

    private TripManager() {
    }

    synchronized public static TripManager getInstance() {
        if (instance == null)
            instance = new TripManager();
        return instance;
    }


    public void newTrip() { //하루짜리 새로운 여행을 생성
        this.newDaySchedule();
    }

    public void insertSchedule(int day, int sort, ObjectDTO schedule) {
        this.setDay(day);
        this.insertSchedule(sort, schedule);
    }

    public void removeSchedule(int day, int sort){
        this.setDay(day);
        this.removeSchedule(sort);
    }


}