package com.muhammet.Set;

import com.muhammet.Queue.PriorityQueue.entity.Hasta;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * SET Nedir?
         * İçerisinde tekrarlı eleman bulundurmayan (unique element) liste türüdür. Genel kullanım alanlar
         * arama, ekleme ve silme işlemleri için tercih edilir.
         * - HashSet
         * - LinkedHashSet
         * - TreeSet
         * 3 farklı sınıf tarafınfa implementasyonu yapılmıştır.
         *
         * add: Ekleme
         * addAll: bir liste eklemek için
         * remove: bir element silmek için
         * clear: listeyi boşaltmak için
         * isEmpty: boş mu kontrol için
         * size: boyut almak için
         * contains: bir öğenin listede olup olmadığını kontrol için
         */


        Set<String> isimListesi = new HashSet<>();

        isimListesi.add("Ahmet");
        isimListesi.add("Demet");
        isimListesi.add("Eylül");
        isimListesi.add("Hatice");
        isimListesi.add("Ayşe");
        isimListesi.add("Naz");
        isimListesi.add("Temel");
        isimListesi.add("Ahmet");
        isimListesi.add("Naz");
        System.out.println("""
                ******* İsimler *******
                """);
        for(String isim: isimListesi) {
            System.out.println(isim);
        }

        /**
         * bağlı liste
         */
        Set<String> mevyeListesi = new LinkedHashSet<>();
        mevyeListesi.add("Elma");
        mevyeListesi.add("Zeytin");
        mevyeListesi.add("Ayva");
        mevyeListesi.add("İncir");
        mevyeListesi.add("Kayısı");
        mevyeListesi.add("Portakal");
        mevyeListesi.add("İncir");
        mevyeListesi.add("Elma");
        System.out.println("""
                *** Meyve Listesi ***
                """);
        for(String mevye: mevyeListesi) {
            System.out.println(mevye);
        }
        /**
         * TreeSet, öğeleri doğal sıralamasına göre listeler.
         *
         */
        Set<String> kelimeListesi = new TreeSet<>();
        kelimeListesi.add("Okul");
        kelimeListesi.add("Zeytinlik");
        kelimeListesi.add("Ayna");
        kelimeListesi.add("Bavul");
        kelimeListesi.add("Tarak");
        kelimeListesi.add("Makas");
        kelimeListesi.add("Iğne");
        System.out.println("""
                **** Kelime Listesi ***
                """);
        for(String kelime: kelimeListesi) {
            System.out.println(kelime);
        }


        SortedSet<String> siraliSet = new TreeSet<>();
        siraliSet.add("Okul");
        siraliSet.add("Zeytinlik");
        siraliSet.add("Ayna");
        siraliSet.add("Bavul");
        siraliSet.add("Tarak");
        siraliSet.add("Makas");
        siraliSet.add("Iğne");
        System.out.println("""
                **** Sorted Kelime Listesi ***
                """);
        for(String kelime: siraliSet.reversed()) {
            System.out.println(kelime);
        }

    }
}
