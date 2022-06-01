package gameLaby.laby;

public class CasePiegee extends Case {
    public static final int DEGAT = 10;
    private Perso perso;

    public CasePiegee(int x, int y, Perso p) {
        super(x, y);
        this.perso = p;
    }

    public void faireEffet() {
        this.perso.perdrePV(DEGAT);
    }
}
