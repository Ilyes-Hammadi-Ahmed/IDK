package com.company;

import com.outil.Tableau;
import javafx.scene.control.Tab;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] tableau = new int[10];
        Tableau.remplisageAleatoire(tableau, 1, 8);
        Tableau.affiche(tableau);
        System.out.println("le max : " + Tableau.maximum(tableau));
        System.out.println("le min : " + Tableau.minimum(tableau));
    }
}
