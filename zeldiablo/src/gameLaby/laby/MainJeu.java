package gameLaby.laby;

import moteurJeu.MoteurJeu;

import java.io.IOException;

public class MainJeu {
    public static void main(String[] args) throws IOException {
        int pFPS = 20;

        LabyJeu jeu = new LabyJeu();
        LabyDessin dessin = new LabyDessin();

        MoteurJeu.setFPS(pFPS);
        int taille = LabyDessin.TAILLE_RECTANGLE;
        MoteurJeu.setTaille(jeu.getLabi().getLength() * taille, jeu.getLabi().getLengthY() * taille);

        MoteurJeu.launch(jeu, dessin);
    }
}
