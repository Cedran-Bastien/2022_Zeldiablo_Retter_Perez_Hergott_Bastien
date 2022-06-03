package gameLaby.laby;

import gameLaby.laby.caseEffet.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * classe labyrinthe. represente un labyrinthe avec
 * <ul> des murs </ul>
 * <ul> un personnage (x,y) </ul>
 */
public class Labyrinthe {

    /**
     * Constantes char
     */
    public static final char MUR = 'X';
    public static final char PJ = 'P';
    public static final char VIDE = '.';
    public static final char CASEDECLENCHEUR = 'D';
    public static final char CASEPIEGEE = 'p';
    public static final int DEGAT_CASE_PIEGEE = 1;


    /**
     * constantes actions possibles
     */
    public static final String HAUT = "Haut";
    public static final String BAS = "Bas";
    public static final String GAUCHE = "Gauche";
    public static final String DROITE = "Droite";

    /**
     * constante perso
     */
    public static final int PV_BASE_PERSO = 100;

    /**
     * attribut du personnage
     */
    public Perso pj;


    /**
     * les cases a effet du labirynthe
     */
    private ArrayList<Case> caseEffet;

    /**
     * representation des cases du labyrinthe
     */
    private Case[][] cases;

    /**
     * retourne la gameLaby.laby.case suivante selon une actions
     *
     * @param x      gameLaby.laby.case depart
     * @param y      gameLaby.laby.case depart
     * @param action action effectuee
     * @return gameLaby.laby.case suivante
     */
    static int[] getSuivant(int x, int y, String action) {
        switch (action) {
            case HAUT:
                // on monte une ligne
                y--;
                break;
            case BAS:
                // on descend une ligne
                y++;
                break;
            case DROITE:
                // on augmente colonne
                x++;
                break;
            case GAUCHE:
                // on augmente colonne
                x--;
                break;
            default:
                throw new Error("action inconnue");
        }
        int[] res = {x, y};
        return res;
    }

    /**
     * charge le labyrinthe
     *
     * @param nom nom du fichier de labyrinthe
     * @return labyrinthe cree
     * @throws IOException probleme a la lecture / ouverture
     */
    public Labyrinthe(String nom) throws IOException {
        //cree la liste de case a effet
        caseEffet = new ArrayList<Case>();
        // ouvrir fichier
        FileReader fichier = new FileReader(nom);
        BufferedReader bfRead = new BufferedReader(fichier);

        int nbLignes, nbColonnes;
        // lecture nblignes
        nbLignes = Integer.parseInt(bfRead.readLine());
        // lecture nbcolonnes
        nbColonnes = Integer.parseInt(bfRead.readLine());

        // creation labyrinthe vide
        this.cases = new Case[nbColonnes][nbLignes];
        this.pj = null;

        // lecture des cases
        String ligne = bfRead.readLine();

        // stocke les indices courants
        int numeroLigne = 0;

        // parcours le fichier
        while (ligne != null) {

            // parcours de la ligne
            for (int colonne = 0; colonne < ligne.length(); colonne++) {
                char c = ligne.charAt(colonne);
                switch (c) {
                    case MUR:
                        this.cases[colonne][numeroLigne] = new CaseMur(colonne, numeroLigne) ;
                        break;
                    case VIDE:
                        this.cases[colonne][numeroLigne] = new CaseVide(colonne, numeroLigne);
                        break;
                    case PJ:
                        // pas de mur
                        this.cases[colonne][numeroLigne] = new CaseVide(colonne, numeroLigne);
                        // ajoute PJ
                        this.pj = new Perso(colonne, numeroLigne, Labyrinthe.PV_BASE_PERSO);
                        break;
                    case CASEDECLENCHEUR:
                        CaseDeclencheur caseDeclencheur = new CaseDeclencheur(colonne, numeroLigne);
                        this.cases[colonne][numeroLigne] = caseDeclencheur;
                        this.caseEffet.add(caseDeclencheur);
                        break;
                    case CASEPIEGEE:
                        CasePiegee casePiegee = new CasePiegee(colonne, numeroLigne, Labyrinthe.DEGAT_CASE_PIEGEE);
                        this.cases[colonne][numeroLigne] = casePiegee;
                        this.caseEffet.add(casePiegee);
                        break;

                    default:
                        throw new Error("caractere inconnu : " + c);
                }
            }

            // lecture
            ligne = bfRead.readLine();
            numeroLigne++;
        }

        // ferme fichier
        bfRead.close();
    }


    /**
     * deplace le personnage en fonction de l'action.
     * gere la collision avec les murs
     *
     * @param action une des actions possibles
     */
    public void deplacerPerso(String action) {
        // case courante
        int[] courante = {this.pj.getX(), this.pj.getY()};

        // calcule case suivante
        int[] suivante = getSuivant(courante[0], courante[1], action);

        // si la case est traversable (pas un mur), on effectue le deplacement
        if (this.cases[suivante[0]][suivante[1]].isTraversable()) {
            // on met a jour personnage
            this.pj.setX(suivante[0]);
            this.pj.setY(suivante[1]);
        }
    }


    /**
     * jamais fini
     *
     * @return fin du jeu
     */
    public boolean etreFini() {
        return false;
    }

    // ##################################
    // GETTER
    // ##################################

    /**
     * return taille selon Y
     *
     * @return
     */
    public int getLengthY() {
        return cases[0].length;
    }

    /**
     * return taille selon X
     *
     * @return
     */
    public int getLength() {
        return cases.length;
    }

    /**
     * return mur en (i,j)
     *
     * @param x
     * @param y
     * @return
     */
    public Case getCase(int x, int y) {
        // utilise le tableau de boolean
        return this.cases[x][y];
    }

    /**
     *
     * @return
     *      le personnage du labirynthe
     */
    public Perso getPj() {
        return pj;
    }

    /**
     *
     * @return
     *      la repreentation du labirynthe
     */
    public Case[][] getCases() {
        return cases;
    }

    /**
     *
     * @return
     *      la liste de case a effet
     */
    public ArrayList<Case> getCaseEffet() {
        return caseEffet;
    }
}
