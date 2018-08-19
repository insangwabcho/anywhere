package com.anywhere.anywhere.insang.models.dto;

public class PathDTO extends ObjectDTO {

  /***

   f로 시작하는것은 from (출발지)
   t로 시작하는것은 to (목적지)

   ***/

  private String fid;

  private String fname;

  private String fx;

  private String fy;

  private String routeId;

  private String routeNm;

  private String tid;

  private String tname;

  private String tx;

  private String ty;

  public String getFid() {
    return fid;
  }

  public void setFid(String fid) {
    this.fid = fid;
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getFx() {
    return fx;
  }

  public void setFx(String fx) {
    this.fx = fx;
  }

  public String getFy() {
    return fy;
  }

  public void setFy(String fy) {
    this.fy = fy;
  }

  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public String getRouteNm() {
    return routeNm;
  }

  public void setRouteNm(String routeNm) {
    this.routeNm = routeNm;
  }

  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public String getTx() {
    return tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public String getTy() {
    return ty;
  }

  public void setTy(String ty) {
    this.ty = ty;
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
