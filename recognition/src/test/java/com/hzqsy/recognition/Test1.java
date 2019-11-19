package com.hzqsy.recognition;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.hzqsy.recognition.pojo.CPlusMotorVehicle;

/**
 * Created By admin on 2019.11.12
 */
public class Test1 {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONObject query = new JSONObject();
        JSONObject query_string = new JSONObject();
        query_string.put("query","PASSTIME:[20191014000000 TO 20191015000000]");
        query.put("query_string",query_string);
        jsonObject.put("query",query);
        System.out.println(jsonObject.toJSONString());
    }

}
