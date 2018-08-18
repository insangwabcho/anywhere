package com.anywhere.anywhere.insang.models.dto;

import java.util.List;

public class LocationDTO extends ObjectDTO{

  public String distance;

  public List<PathDTO> pathList;

  public String time;

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
