package gameLaby.laby.monstre;

import gameLaby.laby.Perso;

public class Monstre extends CaseEffet {

    /**
     * attribut representant les degats a enlever au personnage
     */
    private int PointsAttaque;

    /**
     * constructeur Monstre
     * @param x
     * @param y
     * @param p
     * @param ptsAtt
     */
    public Monstre(int x, int y, char p, int ptsAtt) {
        super(x,y,p);
        this.PointsAttaque = ptsAtt;
    }

    /**
     * retire les points d attaque au personnage lorsque celui ci active l'effet
     */
    public void faireEffet(Perso p) {
        if (!p.etreMort()) {
            p.subirDegats(this.PointsAttaque);
        }
    }

    /**
     * getter de l'attribut PointsAttaque
     * @return
     */
    public int getPointsAttaque() {
        return this.PointsAttaque;
    }




}
