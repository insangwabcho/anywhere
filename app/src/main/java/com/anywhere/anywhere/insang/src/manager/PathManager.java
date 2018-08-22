package com.anywhere.anywhere.insang.src.manager;


import android.content.Context;

import com.anywhere.anywhere.insang.models.dto.PathDTO;
import com.anywhere.anywhere.insang.models.dto.PlaceDTO;
import com.anywhere.anywhere.insang.src.function.Route;

public class PathManager extends Route {

  private static PathManager instance;
  private Context context;

  //region # 싱글톤 작업

  private PathManager(Context context) {
    super(context);
    this.context= context;
  }

  public static PathManager getInstance(Context activity) {
    if (instance == null) {
      instance = new PathManager(activity);
    }
    return instance;
  }

  //endregion

  public void searchForPath(PlaceDTO start, PlaceDTO end, int option) {

    PathDTO path = super.getPath(start, end, option);


  }

}
