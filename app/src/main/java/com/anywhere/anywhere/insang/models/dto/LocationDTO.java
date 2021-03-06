package com.anywhere.anywhere.insang.models.dto;

import java.util.List;

public class LocationDTO extends ObjectDTO {

  private String distance;

  private List<PathDTO> pathList;

  private String time;

  public LocationDTO() {
  }

  public LocationDTO(int sortNo, String name, String infoUrl, String distance, List<PathDTO> pathList, String time) {
    super(sortNo, name, infoUrl);
    this.distance = distance;
    this.pathList = pathList;
    this.time = time;
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public List<PathDTO> getPathList() {
    return pathList;
  }

  public void setPathList(List<PathDTO> pathList) {
    this.pathList = pathList;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
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
