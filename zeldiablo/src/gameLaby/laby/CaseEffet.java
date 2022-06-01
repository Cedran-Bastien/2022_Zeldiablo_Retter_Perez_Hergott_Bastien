package gameLaby.laby;

public abstract class CaseEffet extends Case {

    private Perso pers;

    public CaseEffet (int x, int y, Perso pers) {
        super(x,y);
        this.pers = pers;
    }

    public abstract void faireEffet();

}
