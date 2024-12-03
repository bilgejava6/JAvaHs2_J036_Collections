package com.muhammet.Odev_Cevap;

import java.util.PriorityQueue;

public class RunnerC4 {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<TeknikDestek> destek = new PriorityQueue<>();
        // yeni iş aç
        destek.add(new TeknikDestek("Bilgisayarım yazıcıyı görmüyor.",SupportPriority.Medium));
        destek.add(new TeknikDestek("Sisteme giriş yapamıyorum.",SupportPriority.High));
        destek.add(new TeknikDestek("Farem ters yöne hareket ediyor",SupportPriority.Low));
        destek.add(new TeknikDestek("Monitörüm çizgi çizgi oldu.",SupportPriority.Medium));
        destek.add(new TeknikDestek("İnternete bağlanamıyorum.",SupportPriority.Low));
        destek.add(new TeknikDestek("Tüm kağıtlar simsiyah çıkıyor.",SupportPriority.High));

        while (!destek.isEmpty()){
            System.out.println(destek.poll()+ " işlem çözüldü.");
            Thread.sleep(2000L);
        }
    }
}

class TeknikDestek implements Comparable<TeknikDestek>{
    String istek;
    SupportPriority priority;
    public TeknikDestek(String istek, SupportPriority priority){
        this.istek = istek;
        this.priority = priority;
    }
    public String toString(){
        return "istek...: "+ istek+ " - öncelik....: "+priority;
    }
    public int compareTo(TeknikDestek other) {
        if(this.priority == SupportPriority.High) return -1;
        if(this.priority == SupportPriority.Medium && other.priority == SupportPriority.Low) return -1;
        if(this.priority.equals(other.priority)) return 0;
        return 1;
    }
}

enum SupportPriority{
    High, Medium, Low
}