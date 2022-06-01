package gameLaby.laby;

public class CaseDeclencheur extends Case {

    public CaseDeclencheur(int x, int y) {
        super(x, y);
    }

    @Override
    public void faireEffet() {
        System.out.println("Case déclenchée");
    }
}
