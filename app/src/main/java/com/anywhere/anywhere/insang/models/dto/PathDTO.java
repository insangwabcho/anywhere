package com.anywhere.anywhere.insang.models.dto;

import java.util.List;

public class PathDTO extends ObjectDTO {


  //region # superclass

  private ResultBean result;

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

  //endregion

  //region # Member

  public void setScheduleTime(int scheduleTime) {
    super.setScheduleTime(scheduleTime);
  }

  public ResultBean getResult() {
    return result;
  }

  public void setResult(ResultBean result) {
    this.result = result;
  }

  public class ResultBean {

    private int searchType;
    private int startRadius;
    private int endRadius;
    private int subwayCount;
    private int busCount;
    private int subwayBusCount;
    private int pointDistance;
    private int outTrafficCheck;
    private List<PathBean> path;

    public int getSearchType() {
      return searchType;
    }

    public void setSearchType(int searchType) {
      this.searchType = searchType;
    }

    public int getStartRadius() {
      return startRadius;
    }

    public void setStartRadius(int startRadius) {
      this.startRadius = startRadius;
    }

    public int getEndRadius() {
      return endRadius;
    }

    public void setEndRadius(int endRadius) {
      this.endRadius = endRadius;
    }

    public int getSubwayCount() {
      return subwayCount;
    }

    public void setSubwayCount(int subwayCount) {
      this.subwayCount = subwayCount;
    }

    public int getBusCount() {
      return busCount;
    }

    public void setBusCount(int busCount) {
      this.busCount = busCount;
    }

    public int getSubwayBusCount() {
      return subwayBusCount;
    }

    public void setSubwayBusCount(int subwayBusCount) {
      this.subwayBusCount = subwayBusCount;
    }

    public int getPointDistance() {
      return pointDistance;
    }

    public void setPointDistance(int pointDistance) {
      this.pointDistance = pointDistance;
    }

    public int getOutTrafficCheck() {
      return outTrafficCheck;
    }

    public void setOutTrafficCheck(int outTrafficCheck) {
      this.outTrafficCheck = outTrafficCheck;
    }

    public List<PathBean> getPath() {
      return path;
    }

    public void setPath(List<PathBean> path) {
      this.path = path;
    }

    public class PathBean {

      private int pathType;
      private InfoBean info;
      private List<SubPathBean> subPath;

      public int getPathType() {
        return pathType;
      }

      public void setPathType(int pathType) {
        this.pathType = pathType;
      }

      public InfoBean getInfo() {
        return info;
      }

      public void setInfo(InfoBean info) {
        this.info = info;
      }

      public List<SubPathBean> getSubPath() {
        return subPath;
      }

      public void setSubPath(List<SubPathBean> subPath) {
        this.subPath = subPath;
      }

      public class InfoBean {

        private String mapObj;
        private int payment;
        private int busTransitCount;
        private int subwayTransitCount;
        private int busStationCount;
        private int subwayStationCount;
        private int totalStationCount;
        private int totalTime;
        private int totalWalk;
        private int trafficDistance;
        private int totalDistance;
        private String firstStartStation;
        private String lastEndStation;
        private int totalWalkTime;

        public String getMapObj() {
          return mapObj;
        }

        public void setMapObj(String mapObj) {
          this.mapObj = mapObj;
        }

        public int getPayment() {
          return payment;
        }

        public void setPayment(int payment) {
          this.payment = payment;
        }

        public int getBusTransitCount() {
          return busTransitCount;
        }

        public void setBusTransitCount(int busTransitCount) {
          this.busTransitCount = busTransitCount;
        }

        public int getSubwayTransitCount() {
          return subwayTransitCount;
        }

        public void setSubwayTransitCount(int subwayTransitCount) {
          this.subwayTransitCount = subwayTransitCount;
        }

        public int getBusStationCount() {
          return busStationCount;
        }

        public void setBusStationCount(int busStationCount) {
          this.busStationCount = busStationCount;
        }

        public int getSubwayStationCount() {
          return subwayStationCount;
        }

        public void setSubwayStationCount(int subwayStationCount) {
          this.subwayStationCount = subwayStationCount;
        }

        public int getTotalStationCount() {
          return totalStationCount;
        }

        public void setTotalStationCount(int totalStationCount) {
          this.totalStationCount = totalStationCount;
        }

        public int getTotalTime() {
          return totalTime;
        }

        public void setTotalTime(int totalTime) {
          this.totalTime = totalTime;
        }

        public int getTotalWalk() {
          return totalWalk;
        }

        public void setTotalWalk(int totalWalk) {
          this.totalWalk = totalWalk;
        }

        public int getTrafficDistance() {
          return trafficDistance;
        }

        public void setTrafficDistance(int trafficDistance) {
          this.trafficDistance = trafficDistance;
        }

        public int getTotalDistance() {
          return totalDistance;
        }

        public void setTotalDistance(int totalDistance) {
          this.totalDistance = totalDistance;
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

        public int getTotalWalkTime() {
          return totalWalkTime;
        }

        public void setTotalWalkTime(int totalWalkTime) {
          this.totalWalkTime = totalWalkTime;
        }
      }

      public class SubPathBean {

        private int trafficType;
        private int distance;
        private int sectionTime;
        private int stationCount;
        private PassStopListBean passStopList;
        private String way;
        private int wayCode;
        private String door;
        private double startX;
        private double startY;
        private int startID;
        private String startName;
        private String startExitNo;
        private double startExitX;
        private double startExitY;
        private double endX;
        private double endY;
        private int endID;
        private String endName;
        private String endExitNo;
        private double endExitX;
        private double endExitY;
        private List<LaneBean> lane;

        public int getTrafficType() {
          return trafficType;
        }

        public void setTrafficType(int trafficType) {
          this.trafficType = trafficType;
        }

        public int getDistance() {
          return distance;
        }

        public void setDistance(int distance) {
          this.distance = distance;
        }

        public int getSectionTime() {
          return sectionTime;
        }

        public void setSectionTime(int sectionTime) {
          this.sectionTime = sectionTime;
        }

        public int getStationCount() {
          return stationCount;
        }

        public void setStationCount(int stationCount) {
          this.stationCount = stationCount;
        }

        public PassStopListBean getPassStopList() {
          return passStopList;
        }

        public void setPassStopList(PassStopListBean passStopList) {
          this.passStopList = passStopList;
        }

        public String getWay() {
          return way;
        }

        public void setWay(String way) {
          this.way = way;
        }

        public int getWayCode() {
          return wayCode;
        }

        public void setWayCode(int wayCode) {
          this.wayCode = wayCode;
        }

        public String getDoor() {
          return door;
        }

        public void setDoor(String door) {
          this.door = door;
        }

        public double getStartX() {
          return startX;
        }

        public void setStartX(double startX) {
          this.startX = startX;
        }

        public double getStartY() {
          return startY;
        }

        public void setStartY(double startY) {
          this.startY = startY;
        }

        public int getStartID() {
          return startID;
        }

        public void setStartID(int startID) {
          this.startID = startID;
        }

        public String getStartName() {
          return startName;
        }

        public void setStartName(String startName) {
          this.startName = startName;
        }

        public String getStartExitNo() {
          return startExitNo;
        }

        public void setStartExitNo(String startExitNo) {
          this.startExitNo = startExitNo;
        }

        public double getStartExitX() {
          return startExitX;
        }

        public void setStartExitX(double startExitX) {
          this.startExitX = startExitX;
        }

        public double getStartExitY() {
          return startExitY;
        }

        public void setStartExitY(double startExitY) {
          this.startExitY = startExitY;
        }

        public double getEndX() {
          return endX;
        }

        public void setEndX(double endX) {
          this.endX = endX;
        }

        public double getEndY() {
          return endY;
        }

        public void setEndY(double endY) {
          this.endY = endY;
        }

        public int getEndID() {
          return endID;
        }

        public void setEndID(int endID) {
          this.endID = endID;
        }

        public String getEndName() {
          return endName;
        }

        public void setEndName(String endName) {
          this.endName = endName;
        }

        public String getEndExitNo() {
          return endExitNo;
        }

        public void setEndExitNo(String endExitNo) {
          this.endExitNo = endExitNo;
        }

        public double getEndExitX() {
          return endExitX;
        }

        public void setEndExitX(double endExitX) {
          this.endExitX = endExitX;
        }

        public double getEndExitY() {
          return endExitY;
        }

        public void setEndExitY(double endExitY) {
          this.endExitY = endExitY;
        }

        public List<LaneBean> getLane() {
          return lane;
        }

        public void setLane(List<LaneBean> lane) {
          this.lane = lane;
        }

        public class PassStopListBean {
          private List<StationsBean> stations;

          public List<StationsBean> getStations() {
            return stations;
          }

          public void setStations(List<StationsBean> stations) {
            this.stations = stations;
          }

          public class StationsBean {

            private int index;
            private String stationName;
            private int stationID;
            private String x;
            private String y;

            public int getIndex() {
              return index;
            }

            public void setIndex(int index) {
              this.index = index;
            }

            public String getStationName() {
              return stationName;
            }

            public void setStationName(String stationName) {
              this.stationName = stationName;
            }

            public int getStationID() {
              return stationID;
            }

            public void setStationID(int stationID) {
              this.stationID = stationID;
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
          }
        }

        public class LaneBean {

          private String name;
          private int subwayCode;
          private int subwayCityCode;

          public String getName() {
            return name;
          }

          public void setName(String name) {
            this.name = name;
          }

          public int getSubwayCode() {
            return subwayCode;
          }

          public void setSubwayCode(int subwayCode) {
            this.subwayCode = subwayCode;
          }

          public int getSubwayCityCode() {
            return subwayCityCode;
          }

          public void setSubwayCityCode(int subwayCityCode) {
            this.subwayCityCode = subwayCityCode;
          }
        }
      }
    }
  }

  //endregion

}
