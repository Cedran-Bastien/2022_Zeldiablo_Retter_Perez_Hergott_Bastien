package gameLaby.laby;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SOFT_LIGHTPeer;
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
        this.laby = new Labyrinthe("labySimple/laby2.txt");
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
            if (!laby.getCase(laby.getPj().getX(),laby.getPj().getY()).isTraversable()){
                laby.deplacerPerso(Labyrinthe.GAUCHE);
            }
        }
        if (clavier.gauche){
            laby.deplacerPerso(Labyrinthe.GAUCHE);
            if (!laby.getCase(laby.getPj().getX(),laby.getPj().getY()).isTraversable()){
                laby.deplacerPerso(Labyrinthe.DROITE);
            }
        }
        if (clavier.haut){
            laby.deplacerPerso(Labyrinthe.HAUT);
            if (!laby.getCase(laby.getPj().getX(),laby.getPj().getY()).isTraversable()){
                laby.deplacerPerso(Labyrinthe.BAS);
            }
        }
        if (clavier.bas){
            laby.deplacerPerso(Labyrinthe.BAS);
            if (!laby.getCase(laby.getPj().getX(),laby.getPj().getY()).isTraversable()){
                laby.deplacerPerso(Labyrinthe.HAUT);
            }
        }
        if (this.laby.getCase(this.laby.pj.getX(),this.laby.pj.getY()).isAmorce()){
            this.laby.getCase(this.laby.pj.getX(),this.laby.pj.getY()).faireEffet(this.laby.pj);
        }
        if (true){
            System.out.println("if" );
            for (int i=0; i>this.laby.getCaseEffet().size();i++){
                System.out.println("boucle");
                if ((!this.laby.getCaseEffet().get(i).isAmorce()) && this.laby.getCaseEffet().get(i).etrePresent(this.laby.getPj())){
                    this.laby.getCaseEffet().get(i).changerAmorce();
                    System.out.println("changement amorce");
                }
            }
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
