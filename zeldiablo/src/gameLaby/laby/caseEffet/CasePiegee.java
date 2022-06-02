package gameLaby.laby.caseEffet;

import gameLaby.laby.Perso;

public class CasePiegee extends Case {

    //attributs
    private int degat;

    /**
     * Constructeur de CasePiegee
     * @param x
     * @param y
     * @param deg
     * @param typ
     */
    public CasePiegee(int x, int y,char typ,int deg) {
        super(x, y);
        this.degat=deg;
    }

    public void faireEffet(Perso p) {
        if ( !p.etreMort()){
            p.subirDegats(this.degat);
        }
        System.out.println(p.getPv());
    }

    /**
     * permet de savoir les dégâts de la gameLaby.laby.case
     * @return
     */
    public int getDegat() {
        return degat;
    }
}
