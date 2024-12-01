package com.muhammet.ZZOrnekler;

import java.util.HashSet;
import java.util.List;

public class Runner_2 {
    public static void main(String[] args) {
        /**
         * Soru1- SET ile çözülecek
         * Öğrenci adlarının olduğu bir listemiz olsun. Bu liste içerisinde mükerrer- tekrar eden
         * adların olması kaçınuılmazdır. Ancak şöyle bir istekle bize gelinmiştir.
         * Okul müdürü kendi okulunda bulunan öğrenci isimlerinin neler olduğunu bilmek istemektedir.
         * yani tekrar etmeyen bir listeye ihtiyacı vardır?
         * - Benzersiz öğrenci isimleri nelerdir
         * - kaç farklı öğrenci adı vardır?
         *
         * Soru2- Bir Okulda 6. sınıfa giden öğrenciler 2 sınıfta toplanmıştır. Öğretmen iki sınıfta ta
         * aynı olan isimleri bulmak istemektedir. Hem 6A hemde 6B de aynı ad da olan öğrencileri bulunuzç
         *
         * Soru3- SET
         * Bir forum uygulaması geliştirilmiş, bunun içerisinde uygunsuz ifadeler içeren postların belirlenmesi
         * isteniyor. Bunu yapmak için uygun olmadığı düşünülen anahatar kelimeler veriliyor. Buna göre
         * girilen bir yorumun uygun olup olmadığını analiz eden kodu yazınız.
         *
         * Soru4- MAP
         * Bir sınıfta öğretmen öğrencilerinin aldıkları notları bir map içerisinde uttarak daha hızlı işlem
         * yapabileceğini düşünmektedir. Bir HashMap oluşturarak, öğrencilerini adlarını Key ve öğrencilerin
         * not ortalamalarını Value olarak  kullanın ve map içerisine eklyin. sonra da kullanıcıdan
         * hangi öğrencinin notunu öğrenmek istediğini sorarak öğrencinin notunu gösteriniz.
         */
        /**
         * Notlar elle girilecek. Ancak öğrenci listesi map içindeki Key listesini ekrana yazdıracaksınız.
         * sonra öğrenci seçmek için Scanner ile öğrenci adını alacaksınız.
         *
         *
         * Soru5- Map
         * Bir cümle içerisinde geçen kelimelerin listelenmesi ve her kelimenin kaç defa geçtiğinin
         * bulunarak map içerisine eklenmesini istiyoruz. Bu işlemden sonra Key,VAlue değer çiftlerini
         * ekrana yazdırınız.
         *
         *
         * Soru6- Map
         * Bir satış mağazasında ürünler ve stok bilgileri tutulmaktadır. Ürün Adı ve Stok adedi şeklinde
         * bir map oluşturun.Map<ÜRÜNADI,STOKADEDİ> 5 farklı ürün için ekelem yapınız.
         * String soldItem = "Apple Phone";
         * iligili ürün satıldı diyelim. bunun için öncelikle bu ürün adının key olarak varlığını sorgulayın
         * ayrıca bu ürün var ise stok bilgisini kontrol edin(0 dan büyük mü).
         * eğer herşey yolunda ise ürün satın ve stok durumun güncelleyin.
         * eğer ürün stokda yok ise "Ürün Stoğu Bulunmamaktadır" çıktı verin.
         * Uygulamaya ilk girildiğinde map i ekrana yazdırın, satış işleminden sonrada ekrana yazdırın.
         */


        String ifade = "Java ile Java öğrenmek eğlenceli, Java da Colleciton framework ile yeni şeyler öğrendik";
        // Çıktı: Java=3, ile=2, öğrenmek: 1 ....




        List<String> words = List.of("kötü","şiddet","küfür");
        HashSet<String> forbidenWords = new HashSet<>(words);

        String kullaniciYorumu = "Bugün havaların iyi olmadığını düşünüyorum. küfür kelimesi ile ifade ediyorum";







        List<String> S_6A = List.of("Ayhan", "Ayşe", "Aynur","Bekir", "Deniz", "Emel", "Ferhat", "Zeynep");
        List<String> S_6B = List.of("Turgut", "Burhan", "Aynur","Vakkas", "Durmuş", "Eymen", "Ferhat", "Tuana", "Naz");

        HashSet<String> class6A = new HashSet<>(S_6A);
        HashSet<String> class6B = new HashSet<>(S_6B);







        List<String> ogrenciAdlari = List.of(
                "Jedd"
                , "Susana"
                , "Lonny"
                , "Noelyn"
                , "Arie"
                , "Dierdre"
                , "Romonda"
                , "Jordana"
                , "Blair"
                , "Melva"
                , "Daffie"
                , "Pauly"
                , "Currey"
                , "Harriett"
                , "Phedra"
                , "James"
                , "Rosalind"
                , "Jonathon"
                , "Christoffer"
                , "Eadie"
                , "Bronny"
                , "Ali"
                , "Merla"
                , "Courtnay"
                , "Maury"
                , "Lacie"
                , "Aurelea"
                , "Lorry"
                , "Ferdinanda"
                , "Friedrick"
                , "Cammi"
                , "Tony"
                , "Melesa"
                , "Clarence"
                , "Zarah"
                , "Nikolia"
                , "Granville"
                , "Danya"
                , "Inglebert"
                , "Amandy"
                , "Meredith"
                , "Jesus"
                , "Jefferey"
                , "Lynett"
                , "Laura"
                , "Batholomew"
                , "Heidi"
                , "Nell"
                , "Marabel"
                , "Melany"
                , "Dody"
                , "Clemens"
                , "Jessa"
                , "Sigmund"
                , "Leonora"
                , "Prescott"
                , "Kristan"
                , "Brandtr"
                , "Winnifred"
                , "Edita"
                , "Tish"
                , "Aleksandr"
                , "Gretel"
                , "Donalt"
                , "Gertrudis"
                , "Alexina"
                , "Marcy"
                , "Jerad"
                , "Amalie"
                , "Cecil"
                , "Celina"
                , "Timmie"
                , "Estele"
                , "Hollyanne"
                , "Lenna"
                , "Waylan"
                , "Colette"
                , "Marcille"
                , "Larissa"
                , "Angelica"
                , "Brandtr"
                , "Winnifred"
                , "Edita"
                , "Tish"
                , "Aleksandr"
                , "Gretel"
                , "Donalt"
                , "Gertrudis"
                , "Alexina"
                , "Marcy"
                , "Romonda"
                , "Jordana"
                , "Blair"
                , "Melva"
                , "Daffie"
        );

    }
}
