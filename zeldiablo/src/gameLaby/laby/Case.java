package gameLaby.laby;

import javax.swing.text.Position;

public abstract class Case extends Position {

    char type;

    public Case(int x, int y, char t) {
        super(x,y);
        this.type = t;
    }

    /**
     *
     * @return type de la case
     */
    public char getType() {
        return this.type;
    }


}
