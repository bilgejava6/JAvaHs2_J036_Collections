package com.muhammet;

public class Runner_String_Performance {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        String ifade = "Muhammet";
        /**
         * i=0 Muhammet
         * i=1 Muhammet0
         * i=2 Muhammet01
         * ......
         * Muhammet012345678910.........1000000
         */
        for (int i = 0; i < 400_000; i++) {
            ifade = ifade + i;  //String üretme, 400.000 defa nesne yaratıyorsunuz.
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Geçen süre.....: "+(endTime - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(ifade);
        for (int i = 0; i < 400_000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Geçen süre.....: "+(endTime - startTime));

    }
}
