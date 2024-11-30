package com.muhammet.List.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Runner_Ornek {
    public static void main(String[] args) {
        /**
         * kullanıcıdan adını alıp tersten yazdırmak istiyoruz. Bunun için
         * stack yapısını kullanın
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen ad ve soyadınızı giriniz...: ");
        String adSoyad = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        // foreach
        for(char harf : adSoyad.toCharArray())  // String karakter dizi olarak tanımlanır ve foreach ile okunur
            stack.push(harf); // harfler yığıt içerisine dizilir.
        String tersAd = "";
        while(!stack.isEmpty()) {
            tersAd += stack.pop();
        }
        System.out.println("ters ad....: "+ tersAd);

        SpecialStack<String> specialStack = new SpecialStack<>();
        stack = specialStack.convertStackFromString(adSoyad);
    }
}
