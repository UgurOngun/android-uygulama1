package com.example.dev;

import java.util.Locale;
import java.util.Random;

public class randomstring {
    private final String Harfler="abcdefghijklmnopgrstuvwxyz";
    private final String Sayiler="0123456789";
    private final char[] alfabetiksiralama=(Harfler+Sayiler.toUpperCase()+Sayiler).toCharArray();
    private final char[] sayilisiralama=(Sayiler.toUpperCase()+Sayiler).toCharArray();
    private final char[] harflisiralama=(Harfler.toUpperCase()+Harfler).toCharArray();

    public String harflisireuret(int length) {
        StringBuilder sonuc= new StringBuilder();
        for (int i=0; i<length;i++){
            sonuc.append(harflisiralama[new Random().nextInt(harflisiralama.length)]);
        }
        return sonuc.toString();
    }

    public String sayilisiralama(int length) {
        StringBuilder sonuc= new StringBuilder();
        for (int i=0; i<length;i++){
            sonuc.append(sayilisiralama[new Random().nextInt(sayilisiralama.length)]);
        }
        return sonuc.toString();
    }


    public String alfabetiksayiuret(int length){
        StringBuilder sonuc= new StringBuilder();
        for (int i=0; i<length;i++){
            sonuc.append(alfabetiksiralama[new Random().nextInt(alfabetiksiralama.length)]);
        }
        return sonuc.toString();
    }
}
