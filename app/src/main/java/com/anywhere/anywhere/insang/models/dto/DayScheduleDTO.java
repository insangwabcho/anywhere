package com.anywhere.anywhere.insang.models.dto;

import java.util.List;

public class DayScheduleDTO extends ObjectDTO {

  private List<ObjectDTO> schedule;

  public DayScheduleDTO(List<ObjectDTO> schedule) {
    this.schedule = schedule;
  }

  public DayScheduleDTO() {
  }

  public List<ObjectDTO> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<ObjectDTO> schedule) {
    this.schedule = schedule;
  }

  public int getSortNo() {
    return super.getSortNo();
  }

  public void setSortNo(int sortNo) {
    super.setSortNo(sortNo);
  }

  public String getName() {
    return super.getName();
  }

  public void setName(String name) {
    super.setName(name);
  }

  public String getInfoUrl() {
    return super.getInfoUrl();
  }

  public void setInfoUrl(String infoUrl) {
    super.setInfoUrl(infoUrl);
  }

}
