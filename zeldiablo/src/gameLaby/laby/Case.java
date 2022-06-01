package gameLaby.laby;

public abstract class Case {
    int x, y;

    public abstract void faireEffet();

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean etrePresent(int dx, int dy) {

        return (this.x == dx && this.y == dy);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
