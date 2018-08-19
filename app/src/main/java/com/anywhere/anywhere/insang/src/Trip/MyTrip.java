//region # 18.08.18 생성 --insang
// endregion

package com.anywhere.anywhere.insang.src.Trip;

import com.anywhere.anywhere.insang.models.dto.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.ObjectDTO;

import java.util.ArrayList;
import java.util.List;

public class MyTrip {

  //region # Member
  private List<DayScheduleDTO> daySchedule;
  private int settingDay;

  //endregion

  //region # 여행 세팅

  protected List<DayScheduleDTO> getTrip(){
    if (daySchedule == null){
      return null;
    }
    return daySchedule;
  }

  protected void newDaySchedule() { //새로운 하루의 일정을 추가
    daySchedule = new ArrayList<>();
    daySchedule.add(new DayScheduleDTO());

  }

  protected void addTripDay() { //새로운 하루의 일정을 추가(중간에 끼워넣기용)
//    if (day != 0 && (daySchedule.size() >= day)) {
//      daySchedule.add(day-1, new DayScheduleDTO());
//    } else { //예외처리 필요 (잘못된 Day가 들어왔을때
//
//    }
    daySchedule.add(new DayScheduleDTO());
  }

  protected void removeDaySchedule(int day) { //하루의 일정을 통채로 제거

    daySchedule.remove(day);

    if (daySchedule.size() + 1 < settingDay) {
      settingDay -= 1;
    }

  }

  protected void setDay(int day) { //일정을 관리할 날짜를 설정
    int index = day - 1;
    settingDay = index;
    System.out.println("SettingDay Index: "+index);
  }

  protected void insertSchedule(int sort, ObjectDTO schedule) {

    int index = sort - 1;
    List<DayScheduleDTO> dto = getDaySchedule();

    DayScheduleDTO dayDTO= dto.get(settingDay);

    dayDTO.getSchedule().add(schedule);

  }

  protected void removeSchedule(int sort) {

    int index = sort - 1;
    List<DayScheduleDTO> dto = getDaySchedule();

    DayScheduleDTO dayDTO= dto.get(settingDay);

    dayDTO.getSchedule().remove(index);
  }

  protected DayScheduleDTO getScheduleList(int day){
    int index= day-1;
    return daySchedule.get(index);
  }

  //endregion

  //region # 클래스 내부적으로 사용하는 메소드

  private List<DayScheduleDTO> getDaySchedule() {
    return daySchedule;
  }

  //endregion

  public void getSize() {
    System.out.println(daySchedule.size());
    System.out.println(settingDay);
  }
}