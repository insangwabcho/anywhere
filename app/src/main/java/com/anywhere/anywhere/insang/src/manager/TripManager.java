//region # 18.08.18 생성 --insang
// endregion

package com.anywhere.anywhere.insang.src.manager;

import com.anywhere.anywhere.insang.models.dto.ObjectDTO;
import com.anywhere.anywhere.insang.src.Trip.MyTrip;

public class TripManager extends MyTrip {

    //region # 싱글톤 처리
    private static TripManager instance;

    private TripManager() {
    }

    synchronized public static TripManager getInstance() {
        if (instance == null)
            instance = new TripManager();
        return instance;
    }
    //endregion

    //region # 여행 manager 기능

    //기본 하루짜리 새로운 여행을 생성
    public void newTrip() {
        this.newDaySchedule();
    }

    //일정 등록
    public void insertSchedule(int day, int sort, ObjectDTO schedule) {
        this.setDay(day);
        this.insertSchedule(sort, schedule);
    }

    //여행일정 삭제
    public void removeSchedule(int day, int sort){
        this.setDay(day);
        this.removeSchedule(sort);
    }

    //endregion

    //region # 서버 및 DB 관련 기능

    //endregion

}