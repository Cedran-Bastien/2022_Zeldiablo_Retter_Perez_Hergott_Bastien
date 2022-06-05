package gameLaby.laby.caseEffet;

import gameLaby.laby.Labyrinthe;
import gameLaby.laby.Perso;

public class CasePiegee extends Case {

    //attributs
    private int degat;

    /**
     * Constructeur de CasePiegee
     * @param x
     * @param y
     * @param deg
     */
    public CasePiegee(int x, int y,int deg) {
        super(x, y);
        this.degat=deg;
    }

    /**
     * Blesse un personnage de l'attribut "degat" PV
     * @param p
     *      le personnage subissane les degats
     */
    public void faireEffet(Perso p) {
        if ( !p.etreMort()){
            p.subirDegats(this.degat);
        }
        System.out.println(p.getPv());
    }

    /**
     *
     * @return
     *      'p' caractere correspondant a une case piegée
     */
    @Override
    public char getType() {
        return Labyrinthe.CASEPIEGEE;
    }
}
