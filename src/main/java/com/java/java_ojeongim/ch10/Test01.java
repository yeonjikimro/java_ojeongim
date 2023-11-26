package com.java.java_ojeongim.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        // void add(int index, E element)
        list.add(1, "LA");
        print(2, list);

        // int indexOf(Object o) / int lastIndexOf(Object o)
        // indedxOf : o의 위치 앞에서 찾기
        // lastIndexOf : o의 위치를 뒤에서부터 검색하여 찾기
        System.out.println("3 : " + list.indexOf("서울"));
        System.out.println("4 : " + list.lastIndexOf("서울"));

        // boolean remove(Object o)
        list.remove("LA");
        print(5, list);

        // E remove(int index)
        list.remove(2);
        print(6, list);

        // boolean contains(Object o)
        System.out.println("7 : " + list.contains("LA"));

        // Object[] toArray()
        Object obj[] = list.toArray();
        System.out.println("8 : " + Arrays.toString(obj));

        // <T> T[] toArray(T[] a)
        // 객체를 일반 배열로 변환할 때 'toArray()' 메서드 사용 시 Object 타입의 배열 반환
        // 원하는 타입의 배열잉 필요할 때는 인자값으로 특정 타입의 배열 전
        String cities[] = new String[0];
        cities = list.toArray(cities);
        System.out.println("9 : " + Arrays.toString(cities));

        // void clear()
        list.clear();
        print(10, list);

        // boolean isEmpty()
        System.out.println("11 : " + list.isEmpty());

        list.add("파리");
        list.add("방콕");
        list.add("LA");

        // Arrays 클래스의 static <T> List<T> asList(T... a)
        //asList : 인자로 전달한 데이터를 가지는 List 객체를 생성하여 반환
        List<String> list2 = Arrays.asList("서울", "뉴욕","상해");
        print(2, list2);

        // boolean addAll(Collection<? extends E> c)
        list.addAll(list2);
        print(13, list);

        // boolean containsAll(Collection<?> c)
        System.out.println("14: " + list.containsAll(list2));

        // boolean retainAll(Collection<?> c)
        list.retainAll(list2);
        print(15, list);

        // boolean removeAll(Collection<?> c)
        list.removeAll(list2);
        print(16, list);
    }

    private static void print(int n, List<String> list) {
        System.out.println(n+" : " + list);
    }
}
