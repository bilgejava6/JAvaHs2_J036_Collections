package com.muhammet;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        /**
         * List ->
         * -----> ArrayList
         *  array list gibi listeler ilk çalışma sırasında sabit bir boyut ile başlarlar. yani siz
         *  ilk array i oluşturduğunuzda aslında 10 adet değer alan bir dizi oluşturur.
         *
         */
        List<String> isimListesi = new ArrayList<>(); // DİKKAT boyut yok
        // liste içerisine yeni değer eklemek
        isimListesi.add("Muhammet HOCA"); // 0
        isimListesi.add("Deniz AKŞAM"); // 1
        isimListesi.add("Yağmur TAŞMAZ"); // 2
        // liste içerisinden değer okumak
        System.out.println("ilk değeri yaz.....: "+ isimListesi.getFirst());
        System.out.println("son değeri yaz.....: "+ isimListesi.getLast());
        System.out.println("2. değeri al.......: "+ isimListesi.get(1));
        // araya eleman eklemek için kullanılır.
        isimListesi.add(1,"Kaan TAKAN");
        System.out.println(isimListesi);
        // DİKKAT!! araya ekleme işlemi dizinin boyutuna göre yapılır. dizinin dışında bir index kullanılamaz.
        //isimListesi.add(40, "Hakkı TEKFEN");
        // DİKKAT!! dizinin indexleri dışında bir değeri okumak isterseniz uygulama Runtime da hata verir.
        //System.out.println(isimListesi.get(15));

        // Bir array içerisindeki değerleri sırayla okumak.
        System.out.println("""
                **** for ile diziyi okumak ****
                """);
        for(int i=0;i<isimListesi.size();i++){
            System.out.println(isimListesi.get(i));
        }
        // dizi ya da itere edilebilir değerleri okumak. foreach yapısı
        System.out.println("""
                **** foreach ile diziyi okumak ****
                """);
        for(String isim : isimListesi){
            System.out.println(isim);
        }

        isimListesi.addFirst("Başa Ekle");
        isimListesi.addLast("Sona Ekle");
        System.out.println(isimListesi);
        // index i verilen değeri listeden silmek
        isimListesi.remove(2);
        System.out.println(isimListesi);
        // silinecek objeyi vermelisin. Ancaaaaaaak dikkat et silinmeye bilir :))))
        // TODO: Dİkkat! bunu daha sonra anlatacağız. referans ile aynı olmayan değerler silinmez.
        isimListesi.remove("Yağmur TAŞMAZ");
        System.out.println(isimListesi);
        // Toplu şekilde bir liste içerisine belli bir listeyi eklemek ya da silmek işlemleri
        List<String> digerListe = new ArrayList<>();
        digerListe.add("D01 Kemal");
        digerListe.add("D02 Ayhan");
        digerListe.add("D03 Zeynep");
        isimListesi.addAll(digerListe);
        System.out.println(isimListesi);
        isimListesi.removeAll(digerListe);
        System.out.println(isimListesi);

    }
}
