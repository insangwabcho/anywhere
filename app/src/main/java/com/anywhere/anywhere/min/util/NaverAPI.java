package com.anywhere.anywhere.min.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by ken13 on 2018-08-29.
 */

public class NaverAPI {

    private  String clientId = "R1koPQDoDfQlsjt0owWA";//애플리케이션 클라이언트 아이디값";
    private  String clientSecret = "rG5yOdm5Av";//애플리케이션 클라이언트 시크릿값";
    String address;
    public  void test(final String address){


        new Thread(new Runnable() {


            @Override
            public void run() {
                try {


                    String addr = URLEncoder.encode("청파로 378", "UTF-8");
                    String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
                    //String apiURL = "https://openapi.naver.com/v1/map/geocode.xml?query=" + addr; // xml
                    URL url = new URL(apiURL);
                    HttpURLConnection con = (HttpURLConnection)url.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("X-Naver-Client-Id", clientId);
                    con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
                    int responseCode = con.getResponseCode();
                    BufferedReader br;
                    if(responseCode==200) { // 정상 호출
                        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    } else {  // 에러 발생
                        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                    }
                    String inputLine;
                    StringBuffer response = new StringBuffer();
                    while ((inputLine = br.readLine()) != null) {
                        response.append(inputLine);
                    }
                    br.close();
                    System.out.println(response.toString());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }).start();

    }
}
