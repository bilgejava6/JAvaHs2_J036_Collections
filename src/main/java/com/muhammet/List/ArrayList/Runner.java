package com.muhammet.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Ogretmen turce = new Ogretmen("Baha","","","",Brans.TurkceOgretmeni);
        Ogretmen tarih = new Ogretmen("Hakkı","","","",Brans.TarihOgretmeni);
        Ogretmen sinif = new Ogretmen("Tahsin","","","",Brans.SinifOgretmeni);
        Ogretmen mat = new Ogretmen("Eylem","","","",Brans.MatematikOgretmeni);


        Ders ders1 = new Ders(DersAdi.TURKCE,turce,50,36,56);
        Ders ders2 = new Ders(DersAdi.INKILAP_TARIHI,tarih,80,76,66);
        Ders ders3 = new Ders(DersAdi.MATEMATIK,mat,88,23,63);

        List<Ders> dersListesi = new ArrayList<Ders>();
        dersListesi.add(ders1);
        dersListesi.add(ders2);
        dersListesi.add(ders3);


        Ogrenci ogrenci = new Ogrenci("OKL001","Ahmet","Deniz","Anakra",dersListesi);



    }
}
