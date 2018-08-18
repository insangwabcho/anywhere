package com.anywhere.anywhere.insang.models.dto;

public class ObjectDTO{

  public int sortNo;

  public String name;

  public String infoUrl;

  public int getSortNo() {
    return sortNo;
  }

  public void setSortNo(int sortNo) {
    this.sortNo = sortNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInfoUrl() {
    return infoUrl;
  }

  public void setInfoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
  }

  public ObjectDTO(int sortNo, String name, String infoUrl) {
    this.sortNo = sortNo;
    this.name = name;
    this.infoUrl = infoUrl;
  }

  public ObjectDTO() {
  }


}