package gameLaby.laby.caseEffet;

public class Position {
    private int x,y;

    /**
     * constructeur position
     * @param dx
     * @param dy
     */
    public Position(int dx,int dy){
        this.x=dx;
        this.y=dy;
    }

    /**
     * permet de savoir si deux objet sont a une meme position
     * @param p
     * @return
     *      true si la position en parametre et la position this sont au meme endroit
     */
    public boolean etrePresent(Position p ){
        return (this.x == p.getX() && this.y == p.getY());
    }

    /**
     * Getter de x
     * @return la position x
     */
    public int getX() {
        return x;
    }

    /**
     * Getter de y
     * @return la position y
     */
    public int getY() {
        return y;
    }

    /**
     * setter de x
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * setter de y
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
}