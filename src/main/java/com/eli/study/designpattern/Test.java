package com.eli.study.designpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author eli
 * @description: test
 */
public class Test {
    public static Map<String,String> putYourName(String name,Map<String,String> map){
        map.put("n",name);
        return map;
    }
    public static void main(String[] args){
        String name = "jingjingwang";
        Map<String,String> tMap = new HashMap<String, String>();
        tMap.put("age","12");
        tMap = putYourName(name,tMap);
        System.out.println(tMap.get("n"));
    }
}
