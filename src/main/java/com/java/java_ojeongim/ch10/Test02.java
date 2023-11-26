package com.java.java_ojeongim.ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        for(int i =0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("===================");

        // List, Set 계열의 모든 컬렉션에서 사용 가능
        // hasNext : 현재 커서 다음에 데이터가 존재하는지 판단(true, false)
        // next : 커서 다음의 데이터를 반환하고 커서를 다음 데이터로 이동
        // Iterator는 모든 데이터를 순차적으로 접근하여 사용할 수 있도록 해주는 헬퍼 객체
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
