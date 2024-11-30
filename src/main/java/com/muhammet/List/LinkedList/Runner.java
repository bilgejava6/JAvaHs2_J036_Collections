package com.muhammet.List.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        /**
         * LikedList - bir birine bağlı şekilde tasarlanmış listeler demektir.
         * -----
         * Avantajları
         * - Dinamik bellek yapısını kullanır.
         * - Boş kayıt barındırmaz.
         * - İhtiyaç duyduğu kadar bellek alanını kullanır.
         * - Başa ya da sona ekleme işlemi O(1) dir.
         * DEZAVANTAJLARI
         * - rastgele, random erişim yoktur.
         * - araya ekleme işlemi diğer listelere göre zordur.
         */
        String[] isimListesi = {"Ahmet","Deniz","Bahar","Eylem","Hatice","Zeynep","Kenan"};
        //isimListesi[7] = "Muhammet";
        String[] yeniDizi = isimListesi; // önce yedekle
        isimListesi = new String[8]; // sonra yeniden boyutlandır
        for(int i=0; i< yeniDizi.length;i++)
            isimListesi[i] = yeniDizi[i]; // eski verileri geri aktar
        isimListesi[7] = "Muhammet"; // yeni değeri ekle
        new ArrayList<>();
        List<String> isimListeleri =List.of("Ahmet","Deniz","Bahar","Eylem","Hatice","Zeynep","Kenan");
        isimListeleri.add("Muhammet");
    }
}
