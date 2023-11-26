package com.java.java_ojeongim.ch10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {

    public static void main(String[] args) {
        LinkedList<String>  list = new LinkedList<String>();

        list.add("서울");
        list.add("북경");
        list.add("상해");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"\t");
        }

        list.add(1, "LA");  print(1, list);
        list.addFirst("런던");    print(2, list);
        list.addLast("서울");     print(3, list);


        // offer메소드는 위에 add 메소드와 동일하게 동작
        // 다만, add 메서드는 데이터 추가시 문제 발생이 되면 프로그램에서 오류 발생
        // offer메소드는 올바르게 추가되면 true, 그렇지 않으면 false 반환
        list.offer("파리");       print(4, list);
        list.offerFirst("로마");      print(5, list);
        list.offerLast("베른");       print(6, list);

        // peek() : 데이터 추출
        // peek , peekFirst : 첫 번째 데이터 추출
        // peekLast : 마지막 데이터 추출
        System.out.println("7 : " + list.peek());
        System.out.println("8 : " + list.peekFirst());
        System.out.println("9 : " + list.peekLast());

        // peek 메서드처럼 데이터를 추출
        // peek 메서드는 추출하는 데이터를 삭제하지 않지만, poll 메서드는 추출하는 데이터를 리스트에서 삭제
        list.poll();        print(10, list);
        list.pollFirst();   print(11, list);
        list.pollFirst();   print(12, list);

        // push : 첫 번째 위치에 데이터 추가
        // pop : 첫 번째 위치에 데이터 추출
        list.push("제주");    print(13, list);
        System.out.println("14 : " + list.pop());


        System.out.println("15 : " + list.get(3));
        System.out.println("16 : " + list.getFirst());
        System.out.println("17 : " + list.getLast());

        System.out.println("18 : " + list.indexOf("서울"));
        System.out.println("19 : " + list.lastIndexOf("서울"));

        list.removeFirst();     print(20, list);
        list.removeLast();      print(21, list);
        list.remove();          print(22, list);
        list.remove("LA");   print(23, list);

        List<String> list2 = Arrays.asList("북경", "상해");
        list.addAll(list2);

        // toArray : List객체를 Object타입의 일반 배열로 변환하여 반환
        Object obj[] = list.toArray();
        System.out.println("24 : " + Arrays.toString(obj));

        // toArray : 인자로 특정 타입ㅇ의 배열을 전달하면 해당 타입의 배열로 List를 변환하여 반환
        String cities[] = new String[0];
        cities = list.toArray(cities);
        System.out.println("25 : " + Arrays.toString(cities));

        list.removeAll(list2); print(26, list);

    }

    private static void print(int n, List<String> list) {
        System.out.println(n+" : " + list);
    }
}
