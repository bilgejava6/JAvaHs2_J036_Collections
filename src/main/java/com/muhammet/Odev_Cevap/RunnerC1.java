package com.muhammet.Odev_Cevap;

import java.util.LinkedList;

public class RunnerC1 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> siprarisListesi = new LinkedList<>();
        Thread.sleep(3000L);
        // yeni sipariş
        siprarisListesi.add("Pizza");
        siprarisListesi.add("Adana");
        siprarisListesi.add("Döner");
        siprarisListesi.add("Çorba");
        // siparişleri görüntüle
        System.out.println("sipariş listesi.....: "+ siprarisListesi);
        Thread.sleep(2000L);
        // ilk siparişi tamamla
        String tamalanan = siprarisListesi.removeFirst();
        System.out.println("tamalanan sipariş: " + tamalanan);
        Thread.sleep(1000L);
        // siprişimi iptal et.
        siprarisListesi.remove("Döner");
        // son görünüm
        System.out.println("sipariş listsi güncel....: "+ siprarisListesi);

    }
}
