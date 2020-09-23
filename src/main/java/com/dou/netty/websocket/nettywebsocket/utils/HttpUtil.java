package com.dou.netty.websocket.nettywebsocket.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flying
 * @date 2020/8/19 16:34
 */
public class HttpUtil {

    /**
     * 从请求uri中获取指定的参数
     *
     * @param url      源URL
     * @param paramKey 参数名
     * @return java.lang.String
     */
    public static String getParamFromUri(String url, String paramKey) {
        Map<String, String> map = new HashMap<>(16);
        url = url.replace("?", ";");
        if (!url.contains(";")) {
            return "";
        }
        if (url.split(";").length > 0) {
            String[] arr = url.split(";")[1].split("&");
            for (String s : arr) {
                String key = s.split("=")[0];
                String value = s.split("=")[1];
                map.put(key, value);
            }
            return map.get(paramKey);
        } else {
            return "";
        }

    }


    /**
     * 从请求uri中获取指定的参数
     *
     * @param url 源URL
     * @return java.lang.String
     */
    public static JSONObject getParamFromUri(String url) {
        JSONObject param = new JSONObject();
        url = url.replace("?", ";");
        if (!url.contains(";")) {
            return param;
        }
        if (url.split(";").length > 0) {
            String[] arr = url.split(";")[1].split("&");
            for (String s : arr) {
                String key = s.split("=")[0];
                String value = s.split("=")[1];
                param.put(key, value);
            }
        }
        return param;

    }


}
