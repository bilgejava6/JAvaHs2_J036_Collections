package com.muhammet.Odev_Cevap;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Runner_C3 {
    private static List<Musteri> musteriListesi = List.of(
            new Musteri("Muhammet",MusteriType.Para_Cekme), new Musteri("Deniz",MusteriType.Para_Yatitma),
            new Musteri("Bahar",MusteriType.Kredi), new Musteri("Emel",MusteriType.Kredi),
            new Musteri("Canan",MusteriType.Para_Cekme), new Musteri("Zeynep",MusteriType.Kredi)
    );
    public static void main(String[] args) throws InterruptedException {
        Queue<Musteri> musteriSirasi = new LinkedList<>();
        // Müşteriler sırayla sisteme giriş yaptılar.
        musteriSirasi.add(musteriListesi.get(1));
        musteriSirasi.add(musteriListesi.get(0));
        musteriSirasi.add(musteriListesi.get(5));
        musteriSirasi.add(musteriListesi.get(3));
        musteriSirasi.add(musteriListesi.get(4));
        musteriSirasi.add(musteriListesi.get(2));
        // kuyruk boş olmadığı müddetçe döngüye devam et.
        while (!musteriSirasi.isEmpty()){
            Musteri musteri = musteriSirasi.poll(); // sıradaki müşteriyi bize verir ve sıradan çıkartır.
            System.out.println(musteri.ad+" isimli müşteri işlemdedir.");
            Thread.sleep(2000L);
        }

        System.out.println("Tüm müşteri işlemleri tamamanlmıştır.");

    }
}

class Musteri{
    String ad;
    MusteriType type;
    public Musteri(String ad, MusteriType type) {
        this.ad = ad;
        this.type = type;
    }
}

enum MusteriType{
    Para_Cekme,
    Para_Yatitma,
    Kredi
}