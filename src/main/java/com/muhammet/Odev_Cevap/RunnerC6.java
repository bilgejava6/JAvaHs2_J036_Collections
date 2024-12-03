package com.muhammet.Odev_Cevap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RunnerC6 {
    private static Map<String,String> ulkeListesi = new TreeMap<>();
    public static void main(String[] args) {
        ulkeListesi.put("Türkiye","Ankara");
        ulkeListesi.put("Almanya","Berlin");
        ulkeListesi.put("Fransa","Paris");
        ulkeListesi.put("Yunanistan","Atina");
        ulkeListesi.put("Azarbeycan","Bakü");
        ulkeListesi.put("Kazakistan","Almaata");
        ulkeListesi.put("İtalya","Roma");
        int hak=3, bilinen=0;
        for (Map.Entry<String,String> ulke : ulkeListesi.entrySet()) {
            System.out.println("Ulke adı....: "+ ulke.getKey());
            System.out.print("Başkenti neresidir? ");
            String cevap = new Scanner(System.in).nextLine();
            if(cevap.equalsIgnoreCase(ulke.getValue())) bilinen++;
            else hak--;
            if (hak == 0) break;
        }

        System.out.println("Yarışma bitti bilinen ülke sayısı...: "+ bilinen);
    }
}
