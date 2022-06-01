package gameLaby.laby;

public abstract class CaseEffet extends Case {


    public CaseEffet (int x, int y,char type) {
        super(x,y,type);
    }

    public abstract void faireEffet(Perso p);

}
