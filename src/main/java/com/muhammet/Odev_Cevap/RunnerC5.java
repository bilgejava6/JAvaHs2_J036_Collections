package com.muhammet.Odev_Cevap;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RunnerC5 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new TreeSet<>();
        while (set.size() < 100){
            int sayi = random.nextInt(100,250);
            set.add(sayi);
        }

        for (Integer sayi : set){
            if (sayi%2==0) System.out.println("çift...: "+ sayi);
            else System.out.println("tek...: "+ sayi);
        }

        System.out.println("sayılar.......: "+ set);
        System.out.println("sayı adedi....: "+ set.size());

    }
}
