package gameLaby.laby;

public abstract class CaseEffet extends Case {

    private Perso pers;

    public CaseEffet (int x, int y,char type, Perso pers) {
        super(x,y,type);
        this.pers = pers;
    }

    public abstract void faireEffet();

}
