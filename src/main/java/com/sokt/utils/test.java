package com.sokt.utils;

import com.sokt.utils.SoktApiConect;
import com.sokt.utils.Argument;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


class test {
  public static void main(String[] args){
    SoktApiConect connect = new SoktApiConect("Team rahul-telfmz", "jQAxxdRZUPeiU6yipZcy");
    Map<String, Argument> body = new HashMap<String, Argument>();

    body.put("num1", new Argument("data", "tefdsafsdafasdfsadstse"));
    body.put("num2", new Argument("data","vipin"));

    try{
      Map<String, Object> response = connect.callSocket("mNzYZ8uChKwxHda2VgC5", "team-rahul-testforgithub", body);

      if(response.get("success") != null){
        System.out.println("success: " + response.get("success"));
        System.out.println("invocation_id: " + response.get("invocation_id"));
        System.out.println("response_url: " + response.get("response_url"));
      }else{
        System.out.println("error: " + response.get("error"));
      }
    }catch(Exception e){
      System.out.println("Error: " + e);
    }

  }
}
