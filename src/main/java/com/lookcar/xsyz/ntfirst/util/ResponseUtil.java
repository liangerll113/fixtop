package com.lookcar.xsyz.ntfirst.util;

import com.alibaba.fastjson.JSONObject;
import com.lookcar.xsyz.ntfirst.enumresponse.ResponseEnum;

public class ResponseUtil {

    public static JSONObject getSuccessResult() {
        return buildResponse(ResponseEnum.SUCCESS, null);
    }

    public static JSONObject getSuccessResult(Object data) {
        return buildResponse(ResponseEnum.SUCCESS, data);
    }

    public static JSONObject getResponseData(ResponseEnum responseEnum) {
        return buildResponse(responseEnum, null);
    }

    public static JSONObject getResponseData(ResponseEnum responseEnum, Object data) {
        return buildResponse(responseEnum, data);
    }

    private static JSONObject buildResponse(ResponseEnum responseEnum, Object data) {
        JSONObject result = new JSONObject();
        result.put("code", responseEnum.getCode());
        result.put("msg", responseEnum.getMsg());
        if (data != null) {
            result.put("data", data);
        }
        return result;
    }
}
