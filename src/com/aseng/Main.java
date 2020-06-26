package com.aseng;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array_Angka = {0,1,2,3,4,5,6,7,8,9};
        int[] OPERASI = new int[10];

        double avg,  x = 0;

        for (int i = 0; i < array_Angka.length ; i++) {
            x = x + array_Angka[i];
        }

        avg = x / array_Angka.length;

        for (int i = 0; i < array_Angka.length; i++) {
            OPERASI[i] = array_Angka[i] - ((int) Math.round(avg));
        }

        System.out.println(Arrays.toString(OPERASI));
    }
}
