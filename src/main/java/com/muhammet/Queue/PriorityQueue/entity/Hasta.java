package com.muhammet.Queue.PriorityQueue.entity;

public class Hasta {
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
}
