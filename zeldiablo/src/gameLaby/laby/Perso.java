package gameLaby.laby;


import gameLaby.laby.caseEffet.Position;

/**
 * gere un personnage situe en x,y
 */
public class Perso extends Position {

    /**
     * point de vie du personnage
     */
    private int pv;

    /**
     * constructeur
     *
     * @param dx position selon x
     * @param dy position selon y
     */
    public Perso(int dx, int dy, int pdv) {
        super(dx,dy);
        this.pv = pdv;
    }

    /**
     * permet de retirer au point de vie du personnage des degats donnees
     */
    public void subirDegats(int deg) {
        int vie = this.pv;
        vie -= deg;
        if (vie <= 0) {
            this.pv = 0;
        } else {
            this.pv = vie;
        }
    }

    // ############################################
    // GETTER
    // ############################################

    /**
     * informe l'utilisateur si le personnage n'a plus de pv
     */
    public boolean etreMort() {
        return (this.pv == 0);
    }

    /**
     * renvoie les points de vie du personnage
     */
    public int getPv() {
        return (this.pv);
    }
}
