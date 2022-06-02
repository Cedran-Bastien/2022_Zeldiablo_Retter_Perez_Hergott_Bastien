package gameLaby.laby.caseEffet;

import gameLaby.laby.Perso;

public class CaseMur extends Case{

    /**
     * cree une case mur
     *      les personnages ne peuvent pas passer dessus(changement de l'attribut traversable a false)
     * @param x
     *      attribut x de la poisition de la case
     * @param y
     */
    public CaseMur(int x, int y) {
        super(x, y);
        this.changerTraversable();
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
