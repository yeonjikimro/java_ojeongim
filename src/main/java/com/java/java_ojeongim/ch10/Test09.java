package com.java.java_ojeongim.ch10;

import java.util.Map;
import java.util.TreeMap;

import static ch.qos.logback.core.util.StatusPrinter.print;

public class Test09 {

    /**
     * TreeMap 트리구조
     * @param args
     */
    public static void main(String[] args) {

        TreeMap<String, String> users = new TreeMap<String, String>();

        users.put("20080319", "김푸름");
        users.put("220070620", "김하늘");
        users.put("20050817", "오정임");
        users.put("20120728", "김유빈");
        users.put("20120924", "김용빈");

        System.out.println(users);

        Map.Entry<String, String> entry = null;

        entry = users.firstEntry();
        print("입사일자가 가장 빠른 사람 ", entry);

        entry = users.lastEntry();
        print("입사일자가 가장 늦은 사람", entry);

        entry = users.lowerEntry("20121231"); // 지정된 키보다 작은 값 중 가장 큰 키값 반환
        print("2012년도에 가장 늦게 입사한 사람", entry);

        entry = users.higherEntry("20120101");
        print("2012년도에 가장 빠르게 입사한 사람", entry);

        while(!users.isEmpty()) {
            entry = users.pollFirstEntry(); // 현재 맵의 가장 작은 키값의 Entry를 반환 후 삭제
            print("퇴직한 사람", entry);
            System.out.println("남아있는 직원 수 : " + users.size());
        }

    }

    private static void print(String s, Map.Entry<String, String> entry) {
        System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
    }
}
