package com.java.java_ojeongim.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test01 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("1 : " + list.toString());
    }
}
