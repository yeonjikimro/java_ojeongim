package com.java.java_ojeongim.ch10;

import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        HashMap<String, String> aicon = new HashMap<String, String>();

        aicon.put("메가커피", "커피");
        aicon.put("커피빈", "커피");
        aicon.put("빽다방", "커피");
        aicon.put("맘모스", "커피");
        aicon.put("소백산", "식당");
        aicon.put("빨강다람쥐", "식당");
        aicon.put("도토리편백집", "식당");

        System.out.println("aicon : "+  aicon);

        //Collection<String> values = aicon.values();
        Set<String> set = new HashSet<>(aicon.values());

        System.out.println("set " + set);
    }


}
