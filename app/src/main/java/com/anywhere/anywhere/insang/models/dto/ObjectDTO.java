package com.anywhere.anywhere.insang.models.dto;

public class ObjectDTO{

  private int sortNo;

  private String name;

  private String infoUrl;

  protected int getSortNo() {
    return sortNo;
  }

  protected void setSortNo(int sortNo) {
    this.sortNo = sortNo;
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected String getInfoUrl() {
    return infoUrl;
  }

  protected void setInfoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
  }

  protected ObjectDTO(int sortNo, String name, String infoUrl) {
    this.sortNo = sortNo;
    this.name = name;
    this.infoUrl = infoUrl;
  }

  public ObjectDTO() {
  }


}