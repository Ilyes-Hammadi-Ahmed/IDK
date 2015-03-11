package com.company;

import com.outil.Tableau;
import javafx.scene.control.Tab;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float[] tableau = new float[10];
        Tableau.remplisageAleatoire(tableau, 1.2f, 8.5f);
        Tableau.affiche(tableau);
    }
}
