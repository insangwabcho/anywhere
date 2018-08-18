package com.anywhere.anywhere.insang.models.dto;

import java.util.List;

public class DayScheduleDTO extends ObjectDTO {

  public List<ObjectDTO> schedule;

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
    return super.sortNo;
  }

  public void setSortNo(int sortNo) {
    super.sortNo = sortNo;
  }

  public String getName() {
    return super.name;
  }

  public void setName(String name) {
    super.name = name;
  }

  public String getInfoUrl() {
    return super.infoUrl;
  }

  public void setInfoUrl(String infoUrl) {
    super.infoUrl = infoUrl;
  }

}
