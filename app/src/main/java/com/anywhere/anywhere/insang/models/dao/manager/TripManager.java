package com.anywhere.anywhere.insang.models.dao.manager;

import com.anywhere.anywhere.insang.models.dto.api.DayScheduleDTO;

import java.util.ArrayList;
import java.util.List;

public class TripManager {

  private static TripManager instance;
  private static ScheduleManager scheduleManager;
  private List<DayScheduleDTO> trip;

  private TripManager(){ }

  synchronized public static TripManager getInstance(){
    if (instance == null)
      instance= new TripManager();
    return instance;
  }

  synchronized public ScheduleManager getScheduleManager(int day){
    if (scheduleManager == null){
      scheduleManager= new ScheduleManager(trip.get(day));
    }
    return scheduleManager;
  }

  //region Trip Manager

  public void newTrip(){
    trip= new ArrayList<>();
  }

  public void insertDaySchedule(DayScheduleDTO dto){
    trip.add(dto);
  }

  public void removeDaySchedule(DayScheduleDTO dto){
    trip.remove(dto);
  }

  public DayScheduleDTO getDaySchedule(int day){
    return trip.get(day);
  }

  //endregion

  //region Schedule Manager

  public void newSchedule(){

  }

  //endregion
}