package gameLaby.laby.caseEffet;

import gameLaby.laby.Perso;

public class CaseVide extends Case{

    /**
     * cree une case vide sans particularité
     * @param x
     *      attribut x de la poisition de la case
     * @param y
     *      attribut y de la poisition de la case
     */
    public CaseVide(int x, int y) {
        super(x, y);
    }

    /**
     * la case vide n'au aucun effet
     * @param p
     *      personnage sur lequel a lieu l'effet de la case
     */
    @Override
    public void faireEffet(Perso p) {
    }
}
