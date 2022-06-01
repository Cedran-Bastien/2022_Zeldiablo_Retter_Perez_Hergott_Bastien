package gameLaby.laby;

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
     * @param pers
     * @param ptsAtt
     */
    public Monstre(int x, int y, char p, Perso pers, int ptsAtt) {
        super(x,y,p,pers);
        this.PointsAttaque = ptsAtt;
    }

    /**
     * retire les points d attaque au personnage lorsque celui ci active l'effet
     */
    public void faireEffet() {
        if (!this.pers.etreMort()) {
            this.pers.subirDegats(this.PointsAttaque);
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
