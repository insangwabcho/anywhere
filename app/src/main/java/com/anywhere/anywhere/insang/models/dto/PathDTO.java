package com.anywhere.anywhere.insang.models.dto;

public class PathDTO extends ObjectDTO {

  //region # superclass

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

  public int getDivision() { return super.getDivision(); }

  public void setDivision(int division) { super.setDivision(division); }

  //endregion

  //region # Member

  private String result;
  private String searchType;
  private String outTrafficCheck;
  private String busCount;
  private String subwayCount;
  private String pointDistance;
  private String startRadius;
  private String endRadius;
  private String path;
  private String pathType;
  private String info;
  private String trafficDistance;
  private String totalWalk;
  private String totalTime;
  private String payment;
  private String busTransitCount;
  private String subwayTransitCount;
  private String mapObj;
  private String firstStartStation;
  private String lastEndStation;
  private String totalStationCount;
  private String busStationCount;
  private String subwayStationCount;
  private String totalDistance;
  private String subPath;
  private String trafficType;
  private String distance;
  private String sectionTime;
  private String stationCount;
  private String lane;
  private String name;
  private String busNo;
  private String type;
  private String busId;
  private String subwayCode;
  private String subwayCityCode;
  private String startName;
  private String startX;
  private String startY;
  private String endName;
  private String endX;
  private String endY;
  private String way;
  private String wayCode;
  private String door;
  private String startID;
  private String endID;
  private String startExitNo;
  private String startExitX;
  private String startExitY;
  private String endExitNo;
  private String endExitX;
  private String endExitY;
  private String passStopList;
  private String stations;
  private String index;
  private String stationID;
  private String stationName;
  private String x;
  private String y;

  //endregion


  public PathDTO() {
  }

  public PathDTO(String result, String searchType, String outTrafficCheck, String busCount, String subwayCount, String pointDistance, String startRadius, String endRadius, String path, String pathType, String info, String trafficDistance, String totalWalk, String totalTime, String payment, String busTransitCount, String subwayTransitCount, String mapObj, String firstStartStation, String lastEndStation, String totalStationCount, String busStationCount, String subwayStationCount, String totalDistance, String subPath, String trafficType, String distance, String sectionTime, String stationCount, String lane, String name, String busNo, String type, String busId, String subwayCode, String subwayCityCode, String startName, String startX, String startY, String endName, String endX, String endY, String way, String wayCode, String door, String startID, String endID, String startExitNo, String startExitX, String startExitY, String endExitNo, String endExitX, String endExitY, String passStopList, String stations, String index, String stationID, String stationName, String x, String y) {
    this.result = result;
    this.searchType = searchType;
    this.outTrafficCheck = outTrafficCheck;
    this.busCount = busCount;
    this.subwayCount = subwayCount;
    this.pointDistance = pointDistance;
    this.startRadius = startRadius;
    this.endRadius = endRadius;
    this.path = path;
    this.pathType = pathType;
    this.info = info;
    this.trafficDistance = trafficDistance;
    this.totalWalk = totalWalk;
    this.totalTime = totalTime;
    this.payment = payment;
    this.busTransitCount = busTransitCount;
    this.subwayTransitCount = subwayTransitCount;
    this.mapObj = mapObj;
    this.firstStartStation = firstStartStation;
    this.lastEndStation = lastEndStation;
    this.totalStationCount = totalStationCount;
    this.busStationCount = busStationCount;
    this.subwayStationCount = subwayStationCount;
    this.totalDistance = totalDistance;
    this.subPath = subPath;
    this.trafficType = trafficType;
    this.distance = distance;
    this.sectionTime = sectionTime;
    this.stationCount = stationCount;
    this.lane = lane;
    this.name = name;
    this.busNo = busNo;
    this.type = type;
    this.busId = busId;
    this.subwayCode = subwayCode;
    this.subwayCityCode = subwayCityCode;
    this.startName = startName;
    this.startX = startX;
    this.startY = startY;
    this.endName = endName;
    this.endX = endX;
    this.endY = endY;
    this.way = way;
    this.wayCode = wayCode;
    this.door = door;
    this.startID = startID;
    this.endID = endID;
    this.startExitNo = startExitNo;
    this.startExitX = startExitX;
    this.startExitY = startExitY;
    this.endExitNo = endExitNo;
    this.endExitX = endExitX;
    this.endExitY = endExitY;
    this.passStopList = passStopList;
    this.stations = stations;
    this.index = index;
    this.stationID = stationID;
    this.stationName = stationName;
    this.x = x;
    this.y = y;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }

  public String getOutTrafficCheck() {
    return outTrafficCheck;
  }

  public void setOutTrafficCheck(String outTrafficCheck) {
    this.outTrafficCheck = outTrafficCheck;
  }

  public String getBusCount() {
    return busCount;
  }

  public void setBusCount(String busCount) {
    this.busCount = busCount;
  }

  public String getSubwayCount() {
    return subwayCount;
  }

  public void setSubwayCount(String subwayCount) {
    this.subwayCount = subwayCount;
  }

  public String getPointDistance() {
    return pointDistance;
  }

  public void setPointDistance(String pointDistance) {
    this.pointDistance = pointDistance;
  }

  public String getStartRadius() {
    return startRadius;
  }

  public void setStartRadius(String startRadius) {
    this.startRadius = startRadius;
  }

  public String getEndRadius() {
    return endRadius;
  }

  public void setEndRadius(String endRadius) {
    this.endRadius = endRadius;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getPathType() {
    return pathType;
  }

  public void setPathType(String pathType) {
    this.pathType = pathType;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getTrafficDistance() {
    return trafficDistance;
  }

  public void setTrafficDistance(String trafficDistance) {
    this.trafficDistance = trafficDistance;
  }

  public String getTotalWalk() {
    return totalWalk;
  }

  public void setTotalWalk(String totalWalk) {
    this.totalWalk = totalWalk;
  }

  public String getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(String totalTime) {
    this.totalTime = totalTime;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public String getBusTransitCount() {
    return busTransitCount;
  }

  public void setBusTransitCount(String busTransitCount) {
    this.busTransitCount = busTransitCount;
  }

  public String getSubwayTransitCount() {
    return subwayTransitCount;
  }

  public void setSubwayTransitCount(String subwayTransitCount) {
    this.subwayTransitCount = subwayTransitCount;
  }

  public String getMapObj() {
    return mapObj;
  }

  public void setMapObj(String mapObj) {
    this.mapObj = mapObj;
  }

  public String getFirstStartStation() {
    return firstStartStation;
  }

  public void setFirstStartStation(String firstStartStation) {
    this.firstStartStation = firstStartStation;
  }

  public String getLastEndStation() {
    return lastEndStation;
  }

  public void setLastEndStation(String lastEndStation) {
    this.lastEndStation = lastEndStation;
  }

  public String getTotalStationCount() {
    return totalStationCount;
  }

  public void setTotalStationCount(String totalStationCount) {
    this.totalStationCount = totalStationCount;
  }

  public String getBusStationCount() {
    return busStationCount;
  }

  public void setBusStationCount(String busStationCount) {
    this.busStationCount = busStationCount;
  }

  public String getSubwayStationCount() {
    return subwayStationCount;
  }

  public void setSubwayStationCount(String subwayStationCount) {
    this.subwayStationCount = subwayStationCount;
  }

  public String getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(String totalDistance) {
    this.totalDistance = totalDistance;
  }

  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }

  public String getTrafficType() {
    return trafficType;
  }

  public void setTrafficType(String trafficType) {
    this.trafficType = trafficType;
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public String getSectionTime() {
    return sectionTime;
  }

  public void setSectionTime(String sectionTime) {
    this.sectionTime = sectionTime;
  }

  public String getStationCount() {
    return stationCount;
  }

  public void setStationCount(String stationCount) {
    this.stationCount = stationCount;
  }

  public String getLane() {
    return lane;
  }

  public void setLane(String lane) {
    this.lane = lane;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBusNo() {
    return busNo;
  }

  public void setBusNo(String busNo) {
    this.busNo = busNo;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBusId() {
    return busId;
  }

  public void setBusId(String busId) {
    this.busId = busId;
  }

  public String getSubwayCode() {
    return subwayCode;
  }

  public void setSubwayCode(String subwayCode) {
    this.subwayCode = subwayCode;
  }

  public String getSubwayCityCode() {
    return subwayCityCode;
  }

  public void setSubwayCityCode(String subwayCityCode) {
    this.subwayCityCode = subwayCityCode;
  }

  public String getStartName() {
    return startName;
  }

  public void setStartName(String startName) {
    this.startName = startName;
  }

  public String getStartX() {
    return startX;
  }

  public void setStartX(String startX) {
    this.startX = startX;
  }

  public String getStartY() {
    return startY;
  }

  public void setStartY(String startY) {
    this.startY = startY;
  }

  public String getEndName() {
    return endName;
  }

  public void setEndName(String endName) {
    this.endName = endName;
  }

  public String getEndX() {
    return endX;
  }

  public void setEndX(String endX) {
    this.endX = endX;
  }

  public String getEndY() {
    return endY;
  }

  public void setEndY(String endY) {
    this.endY = endY;
  }

  public String getWay() {
    return way;
  }

  public void setWay(String way) {
    this.way = way;
  }

  public String getWayCode() {
    return wayCode;
  }

  public void setWayCode(String wayCode) {
    this.wayCode = wayCode;
  }

  public String getDoor() {
    return door;
  }

  public void setDoor(String door) {
    this.door = door;
  }

  public String getStartID() {
    return startID;
  }

  public void setStartID(String startID) {
    this.startID = startID;
  }

  public String getEndID() {
    return endID;
  }

  public void setEndID(String endID) {
    this.endID = endID;
  }

  public String getStartExitNo() {
    return startExitNo;
  }

  public void setStartExitNo(String startExitNo) {
    this.startExitNo = startExitNo;
  }

  public String getStartExitX() {
    return startExitX;
  }

  public void setStartExitX(String startExitX) {
    this.startExitX = startExitX;
  }

  public String getStartExitY() {
    return startExitY;
  }

  public void setStartExitY(String startExitY) {
    this.startExitY = startExitY;
  }

  public String getEndExitNo() {
    return endExitNo;
  }

  public void setEndExitNo(String endExitNo) {
    this.endExitNo = endExitNo;
  }

  public String getEndExitX() {
    return endExitX;
  }

  public void setEndExitX(String endExitX) {
    this.endExitX = endExitX;
  }

  public String getEndExitY() {
    return endExitY;
  }

  public void setEndExitY(String endExitY) {
    this.endExitY = endExitY;
  }

  public String getPassStopList() {
    return passStopList;
  }

  public void setPassStopList(String passStopList) {
    this.passStopList = passStopList;
  }

  public String getStations() {
    return stations;
  }

  public void setStations(String stations) {
    this.stations = stations;
  }

  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public String getStationID() {
    return stationID;
  }

  public void setStationID(String stationID) {
    this.stationID = stationID;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "PathDTO{" +
        "result='" + result + '\'' +
        ", searchType='" + searchType + '\'' +
        ", outTrafficCheck='" + outTrafficCheck + '\'' +
        ", busCount='" + busCount + '\'' +
        ", subwayCount='" + subwayCount + '\'' +
        ", pointDistance='" + pointDistance + '\'' +
        ", startRadius='" + startRadius + '\'' +
        ", endRadius='" + endRadius + '\'' +
        ", path='" + path + '\'' +
        ", pathType='" + pathType + '\'' +
        ", info='" + info + '\'' +
        ", trafficDistance='" + trafficDistance + '\'' +
        ", totalWalk='" + totalWalk + '\'' +
        ", totalTime='" + totalTime + '\'' +
        ", payment='" + payment + '\'' +
        ", busTransitCount='" + busTransitCount + '\'' +
        ", subwayTransitCount='" + subwayTransitCount + '\'' +
        ", mapObj='" + mapObj + '\'' +
        ", firstStartStation='" + firstStartStation + '\'' +
        ", lastEndStation='" + lastEndStation + '\'' +
        ", totalStationCount='" + totalStationCount + '\'' +
        ", busStationCount='" + busStationCount + '\'' +
        ", subwayStationCount='" + subwayStationCount + '\'' +
        ", totalDistance='" + totalDistance + '\'' +
        ", subPath='" + subPath + '\'' +
        ", trafficType='" + trafficType + '\'' +
        ", distance='" + distance + '\'' +
        ", sectionTime='" + sectionTime + '\'' +
        ", stationCount='" + stationCount + '\'' +
        ", lane='" + lane + '\'' +
        ", name='" + name + '\'' +
        ", busNo='" + busNo + '\'' +
        ", type='" + type + '\'' +
        ", busId='" + busId + '\'' +
        ", subwayCode='" + subwayCode + '\'' +
        ", subwayCityCode='" + subwayCityCode + '\'' +
        ", startName='" + startName + '\'' +
        ", startX='" + startX + '\'' +
        ", startY='" + startY + '\'' +
        ", endName='" + endName + '\'' +
        ", endX='" + endX + '\'' +
        ", endY='" + endY + '\'' +
        ", way='" + way + '\'' +
        ", wayCode='" + wayCode + '\'' +
        ", door='" + door + '\'' +
        ", startID='" + startID + '\'' +
        ", endID='" + endID + '\'' +
        ", startExitNo='" + startExitNo + '\'' +
        ", startExitX='" + startExitX + '\'' +
        ", startExitY='" + startExitY + '\'' +
        ", endExitNo='" + endExitNo + '\'' +
        ", endExitX='" + endExitX + '\'' +
        ", endExitY='" + endExitY + '\'' +
        ", passStopList='" + passStopList + '\'' +
        ", stations='" + stations + '\'' +
        ", index='" + index + '\'' +
        ", stationID='" + stationID + '\'' +
        ", stationName='" + stationName + '\'' +
        ", x='" + x + '\'' +
        ", y='" + y + '\'' +
        '}';
  }

}
