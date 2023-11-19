package com.java.java_ojeongim.ch10;

import java.util.HashMap;

public class Test08 {



    public static void main(String[] args) {

        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("고진감래", "고생 끝에 즐거움이 옴");
        dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
        dic.put("권토중래", "실패를 발판삼아 재기함");
        dic.put("교학상자", "가르치고 배우면서 서로 성장함");

        System.out.println(dic);
        System.out.println(dic.keySet());
        System.out.println(dic.values());

        System.out.println(dic.get("고진감래"));
        System.out.println("사필귀정");

        System.out.println(dic.containsKey("분골쇄신"));
        System.out.println(dic.containsValue("고생 끝에 즐거움이 옴"));

        dic.remove("고진감래");
        System.out.println(dic.containsKey("고진감래"));

        dic.clear();
        System.out.println(dic.isEmpty());
        System.out.println(dic.size());


    }



}
