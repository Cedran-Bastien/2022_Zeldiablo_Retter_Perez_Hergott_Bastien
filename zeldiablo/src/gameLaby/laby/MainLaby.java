package gameLaby.laby;

import moteurJeu.MoteurJeu;

import java.io.IOException;

public class MainLaby {
    public static void main(String[] args) throws IOException {
        int pFPS = 100;

        // lancement du Jeu
        LabyJeu jeuLaby = new LabyJeu();

        LabyDessin labyDessin = new LabyDessin();
        MoteurJeu.setFPS(pFPS);
        MoteurJeu.launch(jeuLaby, labyDessin);
        MoteurJeu.setTaille(jeuLaby.getLabi().getLength(),jeuLaby.getLabi().getLengthY());
    }
}
