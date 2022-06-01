package gameLaby.laby;


import javax.swing.text.Position;

/**
 * gere un personnage situe en x,y
 */
public class Perso extends Position {


    /**
     * point de vie du personnage
     */
    int pv;

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
     * permet de savoir si le personnage est en x,y
     *
     * @param dx position testee
     * @param dy position testee
     * @return true si le personnage est bien en (dx,dy)
     */
    public boolean etrePresent(int dx, int dy) {

        return (this.x == dx && this.y == dy);
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
        return this.pv == 0;
    }

    /**
     * renvoie les points de vie du personnage
     */
    public int getPv() {
        return this.pv;
    }
}
