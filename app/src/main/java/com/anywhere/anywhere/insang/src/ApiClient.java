package com.anywhere.anywhere.insang.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiClient {

  public final String ServiceKey= "=sFpp%2BcgoD2n33A7ib82KSC0KBdwQF20HXhcmUqOe6F3kLzQLTB3OfU8N6w306XY9ugyig3ufjF1Q%2BpoZ%2Btfpmw%3D%3D";

  // url = "http://ws.bus.go.kr/api/rest/pathinfo/getLocationInfo"

  public void getLocationInfo(String placeName) throws IOException{

    StringBuilder urlBuilder = new StringBuilder();
    int resCode; // responce code
    String result;


    urlBuilder.append("http://ws.bus.go.kr/api/rest/pathinfo/getLocationInfo"); // url
    urlBuilder.append("?" + "ServiceKey=" + ServiceKey); // public key
    urlBuilder.append("&" + URLEncoder.encode("stSrch", "UTF-8") + URLEncoder.encode(placeName, "UTF-8")); // 검색어

    URL url = new URL(urlBuilder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Content-type", "application/json");

    resCode= conn.getResponseCode();

    BufferedReader rd;
    if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
      rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    StringBuilder sb = new StringBuilder();
    String line;
    while ((line = rd.readLine()) != null) {
      sb.append(line);
    }

    rd.close();
    conn.disconnect();

    result= sb.toString();
  }

}
