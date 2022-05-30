package gameLaby.laby;

import moteurJeu.Clavier;
import moteurJeu.Jeu;

import java.io.IOException;

/**
 * represente un jeu de labirynthe
 */
public class LabyJeu implements Jeu {

    /**
     * labirynthe
     */
    private Labyrinthe laby;

    public LabyJeu() throws IOException {
        this.laby = new Labyrinthe("labySimple/laby1.txt");
    }

    /**
     * mets a jour l'etat du jeu
     * @param secondes temps ecoule depuis la derniere mise a jour
     * @param clavier objet contenant l'état du clavier'
     */
    @Override
    public void update(double secondes, Clavier clavier) {

        //deplacé le personnage en fonction des touches
        if (clavier.droite){
            laby.deplacerPerso(Labyrinthe.DROITE);
        }
        if (clavier.gauche){
            laby.deplacerPerso(Labyrinthe.GAUCHE);
        }
        if (clavier.haut){
            laby.deplacerPerso(Labyrinthe.HAUT);
        }
        if (clavier.bas){
            laby.deplacerPerso(Labyrinthe.BAS);
        }
    }


    @Override
    public void init() {
    //pas d'initialisation particuliere
    }

    @Override
    public boolean etreFini() {
        return (this.etreFini());
    }


    //######################
    //      GETTER
    //######################


    public Labyrinthe getLabi() {
        return laby;
    }
}
