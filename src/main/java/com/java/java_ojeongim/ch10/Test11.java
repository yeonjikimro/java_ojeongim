package com.java.java_ojeongim.ch10;


import org.springframework.core.annotation.Order;

import java.util.HashSet;
import java.util.Iterator;

class User {
    String ssn; // 주민번호
    String name; // 이름

    User(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
    @Override
    public String toString() {
        return ssn + ":" + name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(ssn);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        User u = (User) obj;
        if(this.ssn.equals(u.ssn))
            result = true;
        return result;
    }
}
public class Test11 {

    public static void main(String[] args) {

        User u1 = new User("123", "김푸름");
        User u2 = new User("123", "김푸름");

        HashSet<User> users = new HashSet<User>();

        // 데이터의 내용은 같아도 u1과 u2의 해시코드 값은 다르게 부여되기 때문에 다른 객체로 처리
        users.add(u1);
        users.add(u2);

        Iterator<User> iter = users.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
