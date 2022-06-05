package gameLaby.laby.NiveauMonstre;

import gameLaby.laby.Labyrinthe;
import gameLaby.laby.Perso;
import gameLaby.laby.caseEffet.Case;

public class Monstre extends Case {

    /**
     * attribut representant les degats a enlever au personnage
     */
    private int PointsAttaque;

    /**
     * constructeur Monstre
     * @param x
     * @param y
     * @param ptsAtt
     */
    public Monstre(int x, int y, int ptsAtt) {
        super(x,y);
        this.PointsAttaque = ptsAtt;
    }

    /**
     * retire les points d attaque au personnage lorsque celui ci active l'effet
     */
    public void faireEffet(Perso p) {
        if ( !p.etreMort()){
            p.subirDegats(this.PointsAttaque);
        }
        System.out.println(p.getPv());
    }

    @Override
    public char getType() {
        return (Labyrinthe.MONSTRE);
    }





}
