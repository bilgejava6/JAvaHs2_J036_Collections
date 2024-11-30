package com.muhammet.Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue<String> kuyruk = new LinkedList<>();
        // Kuyruğa eleman eklemek
        kuyruk.add("Ahmet");
        kuyruk.add("Demet");
        kuyruk.add("Taha");
        kuyruk.add("Zeliha");
        System.out.println(kuyruk);

        kuyruk.offer("Canan");
        kuyruk.offer("Murat");
        System.out.println(kuyruk);

        // kuyrukta ki ilk kaydı okumak.
        System.out.println("kuyruktan ilk okunan kayıt..: "+kuyruk.peek()); // ilk değeri okur yerinde bırakır.
        System.out.println(kuyruk);

        // kuyruktan ilk kaydı okuyup silmek
        String removeElement = kuyruk.poll();
        System.out.println("Okunup Silinen eleman....: "+removeElement);
        System.out.println(kuyruk);

    }
}
