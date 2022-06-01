package gameLaby.laby;

public class CaseDeclencheur extends CaseEffet {

    public CaseDeclencheur(int x, int y, char type) {
        super(x, y , type);
    }

    /**
     * affiche si la case a été déclenchée
     */
    public void faireEffet(Perso p) {
        System.out.println("Case déclenchée");
    }
}
