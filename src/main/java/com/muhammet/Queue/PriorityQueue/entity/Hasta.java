package com.muhammet.Queue.PriorityQueue.entity;

import java.util.Objects;

public class Hasta implements Comparable<Hasta>{
    private String ad;
    private int yas;
    private boolean acilMi;

    public Hasta(String ad, int yas, boolean acilMi) {
        this.ad = ad;
        this.yas = yas;
        this.acilMi = acilMi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hasta{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", yas=").append(yas);
        sb.append(", acilMi=").append(acilMi);
        sb.append('}');
        return sb.toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isAcilMi() {
        return acilMi;
    }

    public void setAcilMi(boolean acilMi) {
        this.acilMi = acilMi;
    }

    /**
     * İki değerimiz olsun, bunların ilişkisi ile ilgili ne söylenebilir.
     * 2 Kişi olsun,
     * bu iki kişinin hangisinin büyük olduğunu tespit etmeni istiyorum.
     * KAÇ SONUÇ BULABİLİRSİN?????
     *
     *               1. Kişi     |   2. Kişi
     * 1.Durum(-1)     Büyük         Küçük
     * 2.Durum(1)     Küçük         Büyük
     * 3.Durum(0)     AYNI          AYNI
     * Muhammet, Demet, Cemal, Emel, Canan, Hüseyin
     * this.compareTo(other)
     *
     * @param other the object to be compared.
     * @return
     */
    public int compareTo(Hasta other) {
        if(this.getAd().equalsIgnoreCase("Muhammet") && !other.getAd().equalsIgnoreCase("Muhammet")) return -1;
        if(!this.getAd().equalsIgnoreCase("Muhammet") && other.getAd().equalsIgnoreCase("Muhammet")) return 1;

        // Acil durumuna göre sırala
        // this ACİL true  other ACİL DEĞİL false
        if(this.isAcilMi() && !other.isAcilMi()) return -1;
        // this ACİL DEĞİL false other ACİL true
        if(!this.isAcilMi() && other.isAcilMi()) return 1;

//        boolean sercanAcil = true;
//        boolean muhammetAcil = false;
//        // parantezin içi doğru ise işlemi yap.
//        //    true    ve     false    = false
//        //    true    ve     !false(true)  =  true
//        if(sercanAcil && !muhammetAcil){
//            System.out.println("Sercan Acil");
//        }
//        if(){
//            System.out.println("Muhammet Acil");
//        }
        // yaş önceliği
        // bu sınıf nesnesi öncelikli ise
        if(this.getYas()<7 || this.getYas()>65) return -1;
        // diğer sınıf öncelikli ise
        if(other.getYas()<7 || other.getYas()>65) return 1;

        return 0; // iki değerin karşılaştırılmasında 0 nötr dür.
    }


}
