package com.muhammet.List.Stack;

import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        /**
         * Stack Nedir?
         * Belli nesnelerin üst üste yığılması nasıl bir şekil ve kullanım ortaya çıkartıyor ise
         * aynı mantıkla da Stack bunu tanımlar.
         * LIFO - Last-in-First-out  - Son eklenen İlk çıkar.
         * . yazılım kodlarının analizindwe, parantez dengesinin kontrolü
         * . browser(tarayıcı) geçmişinin işlenmesi de yığıt ile kontrol edilebilir.
         * Vektor sınıfından türemiştir. Asenkron işlemlerde başarılıdır.
         *
         */
        Stack<String> stack = new Stack<>();
//        stack.add("Muhammet");
//        stack.add("Deniz");
//        stack.add("Berhan");
//        stack.add(1,"Kamil");
//
//        System.out.println("2. eleman....: "+ stack.get(2));

        // stack içerisine eleman ekleme
        stack.push("Muhammet");
        stack.push("Deniz");
        stack.push("Berhan");

        // stack içerisinden bir elemanı okumak
        // stack bir yığıt olduğu için en üstteki elemanı döner.
        System.out.println(stack.peek());

        // stack içerisindeki son elamana ulaşır ve okuduğu elemanı stack ten çıkartır.
        String removeElement = stack.pop();
        System.out.println("silinen eleman..: "+ removeElement);

        if(stack.empty()){
            // yığıt boşmu diye kontrol eder.
        }

        System.out.println(stack);

    }
}
