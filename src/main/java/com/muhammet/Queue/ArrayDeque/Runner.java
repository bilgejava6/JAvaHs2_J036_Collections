package com.muhammet.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Runner {
    public static void main(String[] args) {
        /**
         * bir kuyruk sisteminde normalde ekleme işlemleri sona eklenerek
         * devam eder. Ancak ArrayDeque da listenin hem başına hemde
         * sonuna ekleme yapılabilir. aynı şekilde çıkartma da yapabilir.
         * Yani çift taraflı bir kuyruk yapısıdır.
         */
        Deque<String> yazilimDilleri = new ArrayDeque<>();

        yazilimDilleri.offer("Java");
        yazilimDilleri.offer("Python");
        yazilimDilleri.offer("C#");
        System.out.println(yazilimDilleri);

        yazilimDilleri.addFirst("Algoritma");
        yazilimDilleri.addLast("Microservice");

        System.out.println(yazilimDilleri);

        yazilimDilleri.pollFirst();
        yazilimDilleri.pollLast();

        // Kazak - Kazak
    }
}
