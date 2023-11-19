package com.java.java_ojeongim.ch10;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        lotto_generator(5);
    }

    private static void lotto_generator(int n) {
        Random number = new Random();
        HashSet<Integer> lotto = null;
        for(int i = 0; i < n; i++) {

            lotto = new HashSet<Integer>();

            for(int j = 0; lotto.size() <= 6; j++) {
                lotto.add(number.nextInt(45)+1);
            }

            List<Integer> L = new ArrayList<Integer>(lotto);
            Collections.sort(L);
            System.out.println(L);
        }
    }
}
