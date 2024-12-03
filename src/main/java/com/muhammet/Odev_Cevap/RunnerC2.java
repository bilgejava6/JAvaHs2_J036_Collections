package com.muhammet.Odev_Cevap;

import java.util.Stack;

public class RunnerC2 {
    public static void main(String[] args) {
        Stack<String> back = new Stack<>();
        Stack<String> forward = new Stack<>();

        // Sayfalar arasında gezinme başlat
        back.push("Hepsiburada-HomePage");
        back.push("Teknoloji Ürünleri");
        back.push("Laptop");
        back.push("Asus Laptop");
        // şuan neredeyim?
        System.out.println("Şuan neredeyim....: "+ back.peek());
        // buradan geri git.
        String geriGidilenSayfa = back.pop();
        forward.push(geriGidilenSayfa);
        System.out.println("şuanki sayfa....: "+ back.peek());
        // ileri git
        back.push(forward.pop());
        System.out.println("şuanki sayfa....: "+ back.peek());

    }
}
