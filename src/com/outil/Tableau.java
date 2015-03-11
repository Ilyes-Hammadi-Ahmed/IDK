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


}
