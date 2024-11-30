package com.muhammet.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner_Ornek {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Long startTime = System.nanoTime();
        for (int i=0; i<1_000_000;i++)
            arrayList.add("Muhammet"+i);
        arrayList.add("Deniz");
        arrayList.add("Bahar");
        arrayList.add("Eylem");
        arrayList.add("Nur");
        Long endTime = System.nanoTime();
        System.out.println("ArrayList Add geçen süre.....: "+ (endTime - startTime));
        arrayList.add(2,"Baha");

        System.out.println("2. Eleman.....: "+ arrayList.get(1));
        /**
         * ArrayList
         * -> add (3) -> add (3) -> grow (4)
         * LinkedList
         * -> add (2) -> linkLast (5)
         *
         */
        LinkedList<String> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i=0; i<1_000_000;i++)
            linkedList.addLast("Muhammet"+i);
        linkedList.addLast("Deniz");
        linkedList.addLast("Bahar");
        linkedList.addLast("Eylem");
        linkedList.addLast("Nur");
        endTime = System.nanoTime();
        System.out.println("LinkedList Add geçen süre.....: "+ (endTime - startTime));
        linkedList.add(2,"Baha");

        System.out.println("2. Eleman.....: "+ linkedList.get(1));

    }
}
