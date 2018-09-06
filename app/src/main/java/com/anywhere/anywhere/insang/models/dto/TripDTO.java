package com.anywhere.anywhere.insang.models.dto;

public class TripDTO {

  private int tripNum;
  private String tripName;

  public TripDTO(){}
  public TripDTO(int tripNum, String tripName){
    this.tripNum= tripNum;
    this.tripName= tripName;
  }

  public void setTripName(String tripName){
    this.tripName= tripName;
  }

  public String getTripName(){
    return tripName;
  }

  public void setTripNum(int tripNum){
    this.tripNum= tripNum;
  }

  public int getTripNum(){
    return tripNum;
  }

}
