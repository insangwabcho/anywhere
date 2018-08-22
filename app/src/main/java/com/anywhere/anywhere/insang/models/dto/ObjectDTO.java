package com.anywhere.anywhere.insang.models.dto;

public class ObjectDTO {

  private int sortNo;

  private String scheduleName;

  private String infoUrl;

  private int division;

  protected int getSortNo() {
    return sortNo;
  }

  protected void setSortNo(int sortNo) {
    this.sortNo = sortNo;
  }

  protected String getScheduleName() {
    return scheduleName;
  }

  protected void setScheduleName(String scheduleName) {
    this.scheduleName = scheduleName;
  }

  protected String getInfoUrl() {
    return infoUrl;
  }

  protected void setInfoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
  }

  protected int getDivision() {
    return division;
  }

  protected void setDivision(int division) {
    this.division = division;
  }

  protected ObjectDTO(int sortNo, String scheduleName, String infoUrl) {
    this.sortNo = sortNo;
    this.scheduleName = scheduleName;
    this.infoUrl = infoUrl;
  }

  public ObjectDTO() {
  }


}