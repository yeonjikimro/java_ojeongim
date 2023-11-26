package com.java.java_ojeongim.ch10;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test03 {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>(20);

        vector.addElement("서울");
        vector.addElement("도쿄");
        vector.addElement("뉴욕");

        // elementAt : 해당 인덱스에 해당하는 데이터 반환
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i)+"\t");
        }

        System.out.println("\n");

        // firstElemt : 첫 번째 데이터를, lastElement 마지막 데이터 추출해 반환
        System.out.println("1 : " + vector.firstElement());
        System.out.println("2 : " + vector.lastElement());

        // insertElementat(a, b) : b번째 인덱스에 a 삽입
        // setElementAt(a, b) : b번째 인덱스에 a 설정
        vector.insertElementAt("파리", 2);
        print(3, vector);
        vector.setElementAt("런던", 1);
        print(4, vector);

        // capacity : 현재 벡터의 크기 추출
        // sieze : 벡터 안에 저장된 데이터 개수 추출
        // trimToSize : 벡터의 크기를 데이터의 크기로 변경해 데이터가 저장되지 않은 공간 삭제
        System.out.println("3 : " + vector.capacity());
        System.out.println("4 : " + vector.size());
        vector.trimToSize();
        System.out.println("5 : " + vector.capacity());


        vector.removeElement("뉴욕");
        print(6, vector);
        vector.removeElementAt(1);
        print(7, vector);
        vector.removeAllElements();
        print(8, vector);

        List<String> list = Arrays.asList("서울", "도쿄", "뉴욕");
        vector.addAll(list);
        print(9, vector);
        vector.setSize(6);
        print(10, vector);



    }

    private static void print(int n, List<String> vector) {
        System.out.println(n+" : " + vector);
    }
}
