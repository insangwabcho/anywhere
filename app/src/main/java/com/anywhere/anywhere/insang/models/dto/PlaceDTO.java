package com.anywhere.anywhere.insang.models.dto;

public class PlaceDTO extends ObjectDTO {

  public String gpsX;

  public String gpsY;

  public String poiId;

  public String poiNm;

  public PlaceDTO(String gpsX, String gpsY, String poiId, String poiNm) {
    this.gpsX = gpsX;
    this.gpsY = gpsY;
    this.poiId = poiId;
    this.poiNm = poiNm;
  }

  public PlaceDTO() {
  }

  public String getGpsX() {
    return gpsX;
  }

  public void setGpsX(String gpsX) {
    this.gpsX = gpsX;
  }

  public String getGpsY() {
    return gpsY;
  }

  public void setGpsY(String gpsY) {
    this.gpsY = gpsY;
  }

  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public String getPoiNm() {
    return poiNm;
  }

  public void setPoiNm(String poiNm) {
    this.poiNm = poiNm;
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