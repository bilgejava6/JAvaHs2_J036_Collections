package com.muhammet.Queue.PriorityQueue;

import com.muhammet.Queue.PriorityQueue.entity.Hasta;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunnerHasta {
    public static void main(String[] args) {
        /**
         * -1 en öncelikli
         * 0 normal
         * 1 sonraki öncelikli
         */
//        Comparator<Hasta> oncelikBelirleme = (h1,h2) ->{
//            if (h1.isAcilMi()) return -1;
//            if (h2.isAcilMi()) return 1;
//            boolean h1oncelik = h1.getYas()<7 || h1.getYas()>65;
//            boolean h2oncelik = h2.getYas()<7 || h2.getYas()>65;
//            if(h1oncelik && !h2oncelik) return -1; // h1 öncelikli
//            if(!h1oncelik && h2oncelik) return 1; // h2 öncelikli
//            return 0;
//        };
//        PriorityQueue<Hasta> doktorSirasi = new PriorityQueue<>(oncelikBelirleme);

        PriorityQueue<Hasta> doktorSirasi = new PriorityQueue<>();
        Hasta hasta1 = new Hasta("Muhammet",40,false);
        Hasta hasta2 = new Hasta("Cemal",4,false);
        Hasta hasta3 = new Hasta("Hakkı",76,false);
        Hasta hasta4 = new Hasta("Demet",23,true);
        Hasta hasta5 = new Hasta("Emel",18,false);
        Hasta hasta6 = new Hasta("Canan",21,false);
        Hasta hasta7 = new Hasta("Hüseyin",39,false);

        doktorSirasi.offer(hasta1);
        doktorSirasi.offer(hasta2);
        doktorSirasi.offer(hasta3);
        doktorSirasi.offer(hasta4);
        doktorSirasi.offer(hasta5);
        doktorSirasi.offer(hasta6);
        doktorSirasi.offer(hasta7);

        System.out.println("doktor sirasi....: "+ doktorSirasi);

        // hastaları liste
        while (!doktorSirasi.isEmpty()) {
            System.out.println(doktorSirasi.poll());
        }
    }
}
