package gameLaby.laby;

public class CaseDeclencheur extends CaseEffet {

    public CaseDeclencheur(int x, int y, char type, Perso p) {
        super(x, y , type , p);
    }

    public void faireEffet() {
        System.out.println("Case déclenchée");
    }
}
