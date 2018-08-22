package com.anywhere.anywhere.insang.models.dto;

import java.util.ArrayList;
import java.util.List;

public class DayScheduleDTO extends ObjectDTO {

  private List<ObjectDTO> schedule;

  public DayScheduleDTO(List<ObjectDTO> schedule) {
    this.schedule = schedule;
  }

  public DayScheduleDTO() {
  }

  public List<ObjectDTO> getSchedule() {
    if (schedule == null) {
      schedule = new ArrayList<>();
    }
    return schedule;
  }

  public int getSortNo() {
    return super.getSortNo();
  }

  public void setSortNo(int sortNo) {
    super.setSortNo(sortNo);
  }

  public String getScheduleName() {
    return super.getScheduleName();
  }

  public void setScheduleName(String name) {
    super.setScheduleName(name);
  }

  public String getInfoUrl() {
    return super.getInfoUrl();
  }

  public void setInfoUrl(String infoUrl) {
    super.setInfoUrl(infoUrl);
  }

  public int getDivision() {
    return super.getDivision();
  }

  public void setDivision(int division) {
    super.setDivision(division);
  }

  public int getScheduleTime() {
    return super.getScheduleTime();
  }

  public void setScheduleTime(int scheduleTime) {
    super.setScheduleTime(scheduleTime);
  }

}
