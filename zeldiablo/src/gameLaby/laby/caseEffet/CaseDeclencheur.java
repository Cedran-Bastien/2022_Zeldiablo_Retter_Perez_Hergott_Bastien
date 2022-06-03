package gameLaby.laby.caseEffet;

import gameLaby.laby.Labyrinthe;
import gameLaby.laby.Perso;

public class CaseDeclencheur extends Case {

    /**
     * cree une case declancheur qui est amorcé(active)(changement de l'attribut amorce de la case)
     * @param x
     *      attribut x de la poisition de la case
     * @param y
     *      attribut y de la poisition de la case
     */
    public CaseDeclencheur(int x, int y) {
        super(x, y );
    }

    /**
     * affiche "Case déclenchée" 1 fois quand le perso passe dessus
     * @param p
     *      le perso sur lequel a lieux l'effet
     */
    public void faireEffet(Perso p) {
        System.out.println("Case déclenchée");
    }

    /**
     *
     * @return
     *      'D' caractere correspondant a une case declencheur
     */
    @Override
    public char getType() {
        return Labyrinthe.CASEDECLENCHEUR;
    }
}
