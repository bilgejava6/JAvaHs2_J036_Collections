package com.muhammet.Queue;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Queue Nedir?
         * Adından da anlaşılacağı gibi, bir sıra ifade eder. Günlük hayatta karşılaştığımız
         * kuyrukların bire bir benzeridir. Ekmek Kuyruğu, Kahve Kuyruğu, Mağaza Kuyruğu v.s.
         * (FIFO)First-in-First-out - İlk giren ilk çıkar.
         *
         */
        Queue<String> queueLinked = new LinkedList<>();
        Queue<String> queueDeque = new ArrayDeque<>();
        Queue<String> queuePriority = new PriorityQueue<>();

        List<String> listArray = new ArrayList<>();
        List<String> listVektor = new Vector<>();
        List<String> listSctack = new Stack<>();
        List<String> listLinked = new LinkedList<>();
        // interface ler new lenemez, nesne yaratılamaz.
       // Queue<String> kuyruk = new Queue<String>();
    }
}
