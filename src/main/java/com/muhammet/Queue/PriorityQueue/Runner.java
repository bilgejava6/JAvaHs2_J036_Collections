package com.muhammet.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        /**
         * Priority Queue Nedir?
         * belli değerlerin doğal önceliklerine göre sırada tutulması ve bu sırayla
         * kullanılmasıdır. Ayrıca özel olarak belirlenen kriterler ile de bu sıralama
         * manipüle edilebilir.
         * 0...9
         * A...Z
         */
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(60);
        queue.offer(5);
        queue.offer(14);
        queue.offer(896);
        /**
         * Kuyruk
         * -> eleman ekleme:  offer
         * -> eleman okumak: poll
         */
        System.out.println("Öncelikli kuyruk.....: "+queue);
        while (!queue.isEmpty())
            System.out.println("okunan...: "+ queue.poll());

    }
}
