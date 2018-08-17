package com.anywhere.anywhere.insang.models.dao.manager;

import com.anywhere.anywhere.insang.models.dto.api.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;

import java.util.List;

public class TripManager {

  private List<ObjectDTO> daySchedule;

  public void insertDaySchedule(ObjectDTO dto){
    daySchedule.add(dto);
  }

  public void removeDaySchedule(ObjectDTO dto){
    daySchedule.remove(dto);
  }

  public ObjectDTO getDaySchedule(int day){
    return daySchedule.get(day);
  }

}
