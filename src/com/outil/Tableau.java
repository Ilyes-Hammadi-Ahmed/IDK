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

    // somme d'un tableau d'entier
    public static int somme(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    // somme d'un tableau de réel
    public static float somme(float[] tableau) {
        float somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    // somme de deux tableau d'entier
    public static int[] add(int[] tableau1, int[] tableau2) {

        int[] tableau;
        if (tableau1.length > tableau2.length) {
            tableau = tableau1.clone();
            for (int i = 0; i < tableau2.length; i++) {
                tableau[i] += tableau2[i];
            }
        } else {
            tableau = tableau2.clone();
            for (int i = 0; i < tableau1.length; i++) {
                tableau[i] += tableau1[i];
            }
        }
        return tableau;
    }

    // somme de deux tableau de réel
    public static float[] add(float[] tableau1, float[] tableau2) {

        float[] tableau;
        if (tableau1.length > tableau2.length) {
            tableau = tableau1.clone();
            for (int i = 0; i < tableau2.length; i++) {
                tableau[i] += tableau2[i];
            }
        } else {
            tableau = tableau2.clone();
            for (int i = 0; i < tableau1.length; i++) {
                tableau[i] += tableau1[i];
            }
        }
        return tableau;
    }

    // methode qui renvoie un tableau d'entier de 0 a n
    public static int[] tableauEntier(int length) {
        int[] tableau = new int[length];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i;
        }
        return tableau;
    }

    // methode qui renvoie un tableau de nombre pair
    public static int[] tableauNombrePair(int length) {
        int[] tableau = new int[length];
        for (int j = 2, i = 0; i < tableau.length; j++) {
            if (j % 2 == 0) {
                tableau[i] = j;
                i++;
            }
        }
        return tableau;
    }

    // methode qui envoie un tableau de nombre impar
    public static int[] tableauNombreImpair(int length) {
        int[] tableau = new int[length];
        for (int j = 1, i = 0; i < tableau.length; j++) {
            if (j % 2 != 0) {
                tableau[i] = j;
                i++;
            }
        }
        return tableau;
    }

    // methode qui renvoie la suite de fibonnaci
    public static int[] tableauFibonacci(int premierTerme, int deusiemeTerme, int length) {
        int[] tableau = new int[length];
        tableau[0] = premierTerme;
        tableau[1] = deusiemeTerme;
        for (int i = 2; i < tableau.length; i++) {
            tableau[i] = tableau[i-1] + tableau[i-2];
        }
        return tableau;
    }

    // methode qui test si un tableau est trie dans un ordre croissant
    public static boolean isSortedCroissant(int[] tableau) {
        int i;
        for (i = 1; i < tableau.length && tableau[i - 1] < tableau[i]; i++) {

        }
        if(i >= tableau.length)
            return true;
        else
            return false;
    }

    // methode qui test si un tableau est trier dans un ordre decroissant
    public static boolean isSortedDecroissant(int[] tableau) {
        int i;
        for (i = 1; i < tableau.length && tableau[i - 1] > tableau[i]; i++) {

        }
        if(i >= tableau.length)
            return true;
        else
            return false;
    }

}




























