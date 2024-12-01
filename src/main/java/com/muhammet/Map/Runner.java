package com.muhammet.Map;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        /**
         * MAP
         * Key-Value (Anahtar - Değer) verileri depolar
         * ÖZellikle aram işlemlerinde hızlı ve O(1) arama yapmak için ideal dir.
         * -----------------
         * ArrayList -> id arama işlemi  < O(n)
         * Map<Key,Value>
         * - HashMap - anahtar değerleri sırasız ekler ve null değer kabul eder.
         * - TreeMap - anahtar değeri sıralı ekler.
         * - HashTable - eski bir java sınıfı. null değleri kabul etmez.
         * - LinkedHashMap - anahatar değerlerini eklenme sırasına göre depolar.
         * put(key, value) -> ekleme yapar
         * get(key) -> anahatarı verilen değeri döner, Eğer anhatar yok ise null döner
         * remove() - değer silmek için
         * containsKey -> anahtar bilgisi verilen değerin var olup olmadığını döner
         * containsValue -> diğer değerin var olup olmadığını döner.
         * size -> boyutu verir.
         * clear -> map i temizler
         * entrySet -> map içindeki Key,Value değer çiftlerini döner, foreach için kullanılabilir.
         * keySet -> map içindeki anahatar değerleri Set listesi olarak döner.
         */
        Map<Integer,String> map = new HashMap<>();
        // Anahtar-Değer çiftini ekleme
        map.put(1, "Ahmet");
        map.put(2, "Deniz");
        map.put(89, "Hakan");
        map.put(4,"Bayram");

        map.put(3,"Ahmet");


        // Değer Okumak
        System.out.println(map.get(4));
        System.out.println(map.get(2000)); // DİKKAT!! var olmayan key ile gelen değer null dur.

        // map içindeki isimleri büyük harfe çevirin.
        for(int i=1;i<100;i++){ // 100 defa çalıştı 4 sonuç buldu.
            String isim = map.get(i);
            if(isim != null)
                System.out.println("okunan değer....: "+ isim.toUpperCase());
        }

        // foreach ile tüm collection listelerini dönebilirsiniz.
        /**
         * Elimizde bir anahtar kutusu olsun içinden her seferinde bir öğre çıkartırsanız.
         * her seferinde anahtar çıkar.
         * Aynı mantıkla, bir map listesinden elinizi her çıkarttığınızda Key,Value değer çiftlerini
         * çekersiniz
         */
        for(Map.Entry<Integer,String> item: map.entrySet()){
            System.out.println(item.getKey()+ "  - " + item.getValue());
        }

    }
}
