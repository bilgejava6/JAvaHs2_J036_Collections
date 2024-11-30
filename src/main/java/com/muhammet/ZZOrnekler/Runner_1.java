package com.muhammet.ZZOrnekler;

import java.util.Stack;

public class Runner_1 {
    public static void main(String[] args) {
        /**
         * S1-
         * LinkedList
         * - Elma, Armut, Muz eklenecek
         * - Çilek listenin başına,
         * - Karpuz listenin sonuna eklenecek.
         * Kullanıcı listeden eleman silmek için bir seçim yapacak.
         * *** İŞLEMLER ***
         * MEVCUT LISTE: [Çilek, Elma, Armut, Mus, Karpuz]
         * 1- baştaki elemanı sil (listele komutu çalışır.)
         * 2- sondaki elemanı sil (listele komutu çalışır.)
         * 3- listeyi göster
         * yapacağınız işlem...: 1
         * YENİ LİSTE:  [ Elma, Armut, Mus, Karpuz]
         *
         * S2-
         * LinkedList
         * bir liste içerisine, kullanıcıdan alınan aralıkta ki sayıların 5 ve 5 in katı olanlarını
         * ekliyorsunuz. sonra bu listeyi sırası ile foreach komutunu kullanarak ekrana
         * yazdırıyorsunuz.
         *
         * ZORU 3-
         * Stack
         * şöyle bir yazılım kodu olduğunu düşünün
         * class Deneme{
         *  public void islem(){
         *      if(true){
         *      }   else{
         *      }
         *  }
         *  public int islem(int sayi){
         *      System.out.println();
         *  }
         * }
         * Yukarıda bir programlama sınıfı temsil edilmiştir. Bu tarz yapılarda
         * parantezlerin dengeli olup olmadığının kontrol edilmesi zorunludur. Böyle
         * bir yapı için parantez kontrolü yapmanızı istiyorum. örnek kontrol için
         * ÖRNEK1: {{{}}} - dengeli
         * ÖRNEK2: {{{{}}} - dengesiz
         * bu iki veri programa String olarak verilecek sonuç olarak bu verilerin
         * dengeli olup olmadığı bilgisi çıktılanacaktır.
         * public boolean isBalanced(String item){
         * }
         *
         * S4
         * Queue
         * bir kafe de çalışansınız ve insanlar isimlerini listeye yazdırdı sizde
         * bu sıra ile insanları çağıracaksınız.  5 kişiyi bir kuyruğa ekleyin
         * ve sıra ile çağırın.
         *
         *
         */
        System.out.println("( {{{}}} )Dengeli mi.....: "+ isBalanced("{{{}}}"));
        System.out.println("( {{{}}}} )Dengeli mi.....: "+ isBalanced("{{{}}}}"));
        System.out.println("( Deneme class )Dengeli mi.....: "+ isBalanced("""
                         * class Deneme{
                         *  public void islem(){
                         *      if(true){
                         *      }   else{
                         *      }
                         *  }
                         *  public int islem(int sayi){
                         *      System.out.println();
                         *  }
                         * }
                """));

    }

    public static boolean isBalanced(String item){
        Stack<Character> stack = new Stack<>();
        for(char ch : item.toCharArray()){
            if(ch == '{'){
                stack.push(ch);
            }else if(ch == '}'){
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


}
