package gameLaby.laby;

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
     * permet de savoir si un objet est à une position donnée
     * @param dx
     * @param dy
     * @return
     */
    public boolean etrePresent(int dx,int dy){
        return (this.x == dx && this.y == dy);
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}