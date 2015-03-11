package com.outil;

/**
 * Created by Ilyes Hammadi on 11/03/2015.
 */
public class Outil {

    // minimum de deux nombre
    public static float min(float a, float b) {
        if(a > b)
            return b;
        else
            return a;
    }

    // maxumum de deux nombre
    public static float max(float a, float b) {
        if(a > b)
            return a;
        else
            return b;
    }

    // factorielle d'un entier
    public static int factorielle(int number) {
        int fct = 1;
        for (int i = 2; i <= number; i++) {
            fct *= i;
        }
        return fct;
    }

    // deux a la puissance 2^n
    public static int deuxPuissance(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= 2;
        }
        return result;
    }



}
