package gameLaby.laby;

public class CaseDeclencheur extends Case {

    public CaseDeclencheur(int x, int y) {
        super(x, y);
    }

    /**
     * affiche si la case a été déclenchée
     */
    public void faireEffet() {
        System.out.println("Case déclenchée");
    }
}
