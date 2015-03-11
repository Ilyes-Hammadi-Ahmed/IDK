package com.outil;

import java.util.Scanner;

/**
 * Created by Ilyes Hammadi on 12/03/2015.
 */
public class Matrice {

    // calvier pour la lecture depuis la console
    private static Scanner clavier = new Scanner(System.in);

    // affichage d'une matrice d'entier
    private static void affiche(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                // affichage des element d'une ligne
                System.out.print(matrice[i][j]);
            }
            // saut de ligne
            System.out.println();
        }
    }

    // afficage d'une matrice de réel
    private static void affiche(float[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                // affichage des element d'une ligne
                System.out.print(matrice[i][j]);
            }
            // saut de ligne
            System.out.println();
        }
    }

    // remplisage aleatoire d'une matrice d'entier
    private static void remlisageAleatoire(int[][] matrice, int inf, int sup) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (int)(Math.random()*(sup - inf) + inf);
            }
        }
    }

}
