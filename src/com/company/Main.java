package com.company;

import com.outil.Tableau;
import javafx.scene.control.Tab;


public class Main {

    public static void main(String[] args) {
	// write your code here
	// wele hello you
        int[] tableau1 = Tableau.tableauEntier(10);
        int[] tableau2 = Tableau.tableauEntier(5);
        int[] tableau = Tableau.add(tableau1, tableau2);

        Tableau.affiche(tableau1);
        Tableau.affiche(tableau);
    }
}
