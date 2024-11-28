package com.muhammet.List.ArrayList;

import java.util.List;

public class Ogrenci {
    String okulNo;
    String ad;
    String veli;
    String adres;
    List<Ders> dersListesi;

    public Ogrenci(String okulNo, String ad, String veli, String adres, List<Ders> dersListesi) {
        this.okulNo = okulNo;
        this.ad = ad;
        this.veli = veli;
        this.adres = adres;
        this.dersListesi = dersListesi;
    }
}
