package gameLaby.laby;

public class CasePiegee extends CaseEffet {
    //attributs
    private int degat;
    private char type;
    private Perso pers;

    /**
     * Constructeur de CasePiegee
     * @param x
     * @param y
     * @param p
     * @param deg
     * @param typ
     */
    public CasePiegee(int x, int y,char typ, Perso p,int deg) {
        super(x, y, typ);
        this.pers = p;
        this.type=typ;
    }

    @Override
    public void faireEffet() {
        if ( !this.pers.etreMort()){
            this.pers.subirDegats(this.degat);
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
