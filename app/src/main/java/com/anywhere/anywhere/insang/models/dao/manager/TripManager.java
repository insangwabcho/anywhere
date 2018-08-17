package com.anywhere.anywhere.insang.models.dao.manager;

import com.anywhere.anywhere.insang.models.dto.api.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;
import com.anywhere.anywhere.insang.models.dto.api.TripDTO;

import java.util.List;

public class TripManager {

  private List<ObjectDTO> trip;
  private TripDTO dto;

  public TripManager(List<ObjectDTO> trip) {
    this.trip = trip;
  }

  public void insertDaySchedule(ObjectDTO dto){
    trip.add(dto);
  }

  public void removeDaySchedule(ObjectDTO dto){
    trip.remove(dto);
  }

  public ObjectDTO getDaySchedule(int day){
    return trip.get(day);
  }

}
