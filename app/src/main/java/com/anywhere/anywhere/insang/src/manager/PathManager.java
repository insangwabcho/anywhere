package com.anywhere.anywhere.insang.src.manager;

public class PathManager {

  private PathManager instance;

  //region # 싱글톤 작업

  private PathManager(){};

  public PathManager getInstance(){
    if (instance == null){
      instance= new PathManager();
    }
    return instance;
  }

  //endregion

  public void jsonToDTO(String json){

  }



}
