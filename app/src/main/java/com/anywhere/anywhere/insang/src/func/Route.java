package com.anywhere.anywhere.insang.src.func;


import android.content.Context;

import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.models.dto.PathDTO;
import com.anywhere.anywhere.insang.models.dto.PlaceDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.odsay.odsayandroidsdk.API;
import com.odsay.odsayandroidsdk.ODsayData;
import com.odsay.odsayandroidsdk.ODsayService;
import com.odsay.odsayandroidsdk.OnResultCallbackListener;

public class Route {

  //region # Member

  //결과 옵션
  public static final int OPT_SHORTEST = 0; //최단경로
  public static final int OPT_SORTBYTYPE = 1; //타입별 정렬
  private ODsayService ods;
  private String sX; //출발지 경도
  private String sY; //출발지 위도
  private String eX; //도착지 경도
  private String eY; //도착지 위도
  private String opt; //경로검색결과 정렬방식 (0: 최단거리, 1: 타입별 정렬)
  private String searchType = "0"; //0: 도시간 이동, 1:도시내 이동
  private String searchPathType = "0"; //도시내 경로수단 지정 (0: 모두, 1: 지하철, 2: 버스)

  //endregion

  //region # 생성자, 길찾기 라이브러리 init
  protected Route(Context context) {
    if (ods == null) {
      ods = ODsayService.init(context, context.getString(R.string.odsay_key));
    }
    if (opt == null || opt.equals("")) {
      opt = "0";
    }
  }


  //endregion

  protected PathDTO getPath(PlaceDTO start, PlaceDTO end, int option) {
    final PathDTO[] result = new PathDTO[1];
    sX = start.getGpsX();
    sY = start.getGpsY();
    eX = end.getGpsX();
    eY = end.getGpsY();
    opt = String.valueOf(option);

    ods.requestSearchPubTransPath(sX, sY, eX, eY, opt, searchType, searchPathType, new OnResultCallbackListener() {
      @Override
      public void onSuccess(ODsayData oDsayData, API api) {
        result[0] = jsonToPathDTO(oDsayData.getJson().toString(), PathDTO.class);
      }

      @Override
      public void onError(int i, String s, API api) {
        //에러시 api접속불가 밖에없을껀데에에 어떻게처리해야할지 생각해보자
      }
    });

    return result[0];
  }

  //경로 결과 객체로 변환
  private <T> T jsonToPathDTO(String json, Class<T> dto) {
    Gson gson = new GsonBuilder().create();
    return gson.fromJson(json, dto);
  }

}
