//region # 18.08.18 생성 --insang
// endregion

package com.anywhere.anywhere.insang.src.manager;

import com.anywhere.anywhere.insang.models.dto.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.ObjectDTO;
import com.anywhere.anywhere.insang.src.Trip.MyTrip;

import java.util.List;

public class TripManager extends MyTrip {

  //region # 싱글톤 처리 #
  private static TripManager instance;

  private TripManager() {
  }

  synchronized public static TripManager getInstance() {
    if (instance == null)
      instance = new TripManager();
    return instance;
  }
  //endregion

  //region # 여행 manager 기능 #

  public void newTrip() { //기본 하루짜리 새로운 여행을 생성
    super.newDaySchedule();
  }

  public List<DayScheduleDTO> getTrip(){
    return super.getTrip();
  }

  public void addTripDay(){ //기본 여행에 새로 하루 더 추가
    super.addTripDay();
  }

  public void removeDaySchedule(int day) { //일별 여행 전부삭제
    super.removeDaySchedule(day);
  }

  public void insertSchedule(int day, int sort, ObjectDTO schedule) { //일정 등록
    super.setDay(day);
    super.insertSchedule(sort, schedule);
  }

  public void removeSchedule(int day, int sort) { //일정 삭제
    super.setDay(day);
    super.removeSchedule(sort);
  }

  public DayScheduleDTO getScheduleList(int day){ //일정 목록 가져오기
    return super.getScheduleList(day);
  }



  //endregion

  //region # 서버 및 DB 관련 기능 #

  //endregion


  public void getSize() {
    super.getSize();
  }
}