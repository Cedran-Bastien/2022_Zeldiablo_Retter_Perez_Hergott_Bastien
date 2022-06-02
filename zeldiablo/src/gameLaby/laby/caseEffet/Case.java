package gameLaby.laby.caseEffet;

import gameLaby.laby.Perso;

public abstract class Case extends Position {
    /**
     * attribut de l'etat(le perso pezut aller dessus ou non) de la case
     */
    private boolean traversable;

    /**
     * attribut de l'etat (amorcé ou non) de la case
     */
    private boolean amorce;

    /**
     * cree une case traversable et desamorcé
     * @param x
     *      attribut x de la position de la case
     * @param y
     *      attribut y de la position de la case
     */
    public Case(int x, int y) {
        super(x,y);
        this.traversable = true;
        this.amorce = false;
    }

    /**
     * effet de la case
     * @param p
     *      personnage qui subit l'effet
     */
    public abstract void faireEffet(Perso p);

    /**
     *
     * @return
     *      si la case est traversable ou non
     */
    public boolean isTraversable(){
        return (this.traversable);
    }

    /**
     *
     * @return
     *      si la case est amorce(active) ou non
     */
    public boolean isAmorce(){
        return (this.amorce);
    }


    public void changerTraversable(){
        this.traversable = !this.traversable;
    }

    /**
     * inverse l'etat d'amorcage de la case
     */
    public void changerAmorce(){
        this.amorce = !this.amorce;
    }

}
