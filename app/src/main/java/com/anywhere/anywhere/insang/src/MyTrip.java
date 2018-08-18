//region # 18.08.18 생성 --insang
// endregion

package com.anywhere.anywhere.insang.src;

import com.anywhere.anywhere.insang.models.dto.api.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;

import java.util.List;

public class MyTrip {

    //region # Member
    private List<DayScheduleDTO> daySchedule;
    private int settingDay;
    private final int settingIndex= settingDay-1;

    //endregion

    //region # TripDay Set

    protected void newDaySchedule(){ //새로운 하루의 일정을 추가

        daySchedule.add(new DayScheduleDTO());

    }

    protected void newDaySchedule(int day){ //새로운 하루의 일정을 추가(중간에 끼워넣기용)

        if (day != 0 && (daySchedule.size() >= day)){
            daySchedule.add(settingIndex, new DayScheduleDTO());
        }
        else{ //예외처리 필요 (잘못된 Day가 들어왔을때

        }

    }

    protected void removeDaySchedule(int day){ //하루의 일정을 통채로 제거

        daySchedule.remove(day);

        if (daySchedule.size()+1 < settingDay){
            settingDay-= 1;
        }

    }

    //endregion

    //region # Schedule Set
    protected void setDay(int day){ //일정을 관리할 날짜를 설정

        settingDay= day;

    }

    protected void insertSchedule(int sort, ObjectDTO schedule){

        int index= sort-1;
        List<ObjectDTO> dto= getDaySchedule();

        dto.add(index, schedule);

    }

    protected void removeSchedule(int sort){

        int index= sort-1;
        List<ObjectDTO> dto= getDaySchedule();

        dto.remove(index);

    }

    //endregion


    //region # 클래스 내부적으로 사용하는 메소드

    private List<ObjectDTO> getDaySchedule(){
        return daySchedule.get(settingIndex).schedule;
    }

    //endregion
}