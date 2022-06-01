package gameLaby.laby;

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
        super(x, y, typ);
        this.degat=deg;
    }

    public void faireEffet(Perso p) {
        if ( !p.etreMort()){
            p.subirDegats(this.degat);
        }
        System.out.println(p.pv);
    }

    /**
     * permet de savoir les dégâts de la case
     * @return
     */
    public int getDegat() {
        return degat;
    }
}
