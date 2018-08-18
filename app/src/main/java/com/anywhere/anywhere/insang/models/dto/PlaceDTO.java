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