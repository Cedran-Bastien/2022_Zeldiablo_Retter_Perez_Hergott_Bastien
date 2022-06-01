package gameLaby.laby;

public class CasePiegee extends CaseEffet {

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
        this.type=typ;
    }

    public void faireEffet(Perso p) {
        if ( !p.etreMort()){
            p.subirDegats(this.degat);
        }
    }

    /**
     * permet de savoir les dégâts de la case
     * @return
     */
    public int getDegat() {
        return degat;
    }
}
