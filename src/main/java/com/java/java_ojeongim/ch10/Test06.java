package com.java.java_ojeongim.ch10;

import java.util.HashMap;

public class Test06 {


    public static void main(String[] args) {

        String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
        String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};

        HashMap<String, String> dic = new HashMap<String, String>();

        for(int i = 0; i< word.length; i++) {
            dic.put(word[i], meaning[i]);
        }

        System.out.println(dic);
        System.out.println(dic.size());

        System.out.println(dic.keySet()); // word들의 내용들(key) 컬렉션 형태로 반환
        System.out.println(dic.values()); // meaning들의 니용들(value) 컬렉션 형태로 반환

        System.out.println("HEAVEN : " + dic.get("HEAVEN"));
        dic.replace("HEAVEN", "아주 행복한 감정");
        System.out.println("HEAVEN : " + dic.get("HEAVEN"));
        dic.put("HEAVEN", "이상적인 세상"); // put은 replace와는 다르게 새로 데이터를 추가하는 메서드, 동일한 키의 데이터가 있다면 새로운 값으로 대치
        System.out.println("HEAVEN : " + dic.get("HEAVEN"));

        System.out.println(dic.containsKey("BUMBLEBEE"));
        System.out.println(dic.containsValue("자장가"));

        dic.remove("HEAVEN");
        System.out.println(dic.containsKey("HEAVEN"));

        dic.clear(); // HashMap에 저장된 데이터를 모두 삭제
        System.out.println(dic.isEmpty());
        System.out.println(dic.size());





    }
}
