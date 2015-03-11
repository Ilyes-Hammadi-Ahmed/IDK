package com.outil;

import java.util.Scanner;

/**
 * Created by Ilyes Hammadi on 11/03/2015.
 */
public class Tableau {

    // Scener
    private static Scanner clavier = new Scanner(System.in);

    // affiche tableau d'entier
    public static void affiche(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }

    // affiche tableau de réel
    public static void affiche(float[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }

    // remlpisage aleatoire d'un tableau d'entier
    public static void remplisageAleatoire(int[] tableau, int inf, int sup) {

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int)(Math.random()*(sup - inf)) + inf;
        }
    }

    // remplisage aleatoire d'un tableau de réel
    public static void remplisageAleatoire(float[] tableau, float inf, float sup) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (float)Math.random() * (sup - inf) + inf;
        }
    }

    // remplisage manuelle d'un tableau de entier
    public static void remplisageManuelle(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = clavier.nextInt();
        }
    }

    // remplisage manuelle d'un tableau de réel
    public static void remplisageManuelle(float[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = clavier.nextFloat();
        }
    }

    // nombre de nombre pair d'un un tableau de entier
    public static int nombreDeNombrePair(int[] tableau) {
        int nombreDeNombrePair = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] % 2 == 0)
                nombreDeNombrePair++;
        }
        return nombreDeNombrePair;
    }

    // nombre de nombre impair d'un tableau de entier
    public static int nombreDeNombreImpair(int[] tableau){
        int nombreDenombreImpair = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] % 2 != 0)
                nombreDenombreImpair++;
        }
        return nombreDenombreImpair;
    }

    // is this elemnt exist in the table
    public static boolean isNumberExist(int[] tableau, int number) {
        boolean exist = false;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] == number)
                exist = true;
        }

        return exist;
    }

    // minimum d'un tableau d'entier
    public static int minimum(int[] tableau) {
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    // minimum d'un tableau de réel
    public static float minimum(float[] tableau) {
        float min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    // maximum d'un tableau d'entier
    public static int maximum(int[] tableau) {
        int max = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    // maximum d'un tableau de réel
    public static float maximum(float[] tableau) {
        float max = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

}
