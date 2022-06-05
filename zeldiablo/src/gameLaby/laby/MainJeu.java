package gameLaby.laby;

import moteurJeu.MoteurJeu;

import java.io.IOException;
import java.util.Scanner;

public class MainJeu {
    public static void main(String[] args) throws IOException {
        int pFPS = 20;
        String nomlaby="";
        boolean nomLabyCorrect = false;

        while(!nomLabyCorrect){
            System.out.println("Veuillez choisir un niveau : \n"+
                    " - 1\n"+
                    " - 2\n"+
                    " - 3\n");
            Scanner sc = new Scanner(System.in);
            nomlaby = sc.next();
            if (nomlaby.equals("1")){
                nomlaby="labySimple/laby0.txt";
            }else{
                if(nomlaby.equals("2")){
                    nomlaby="labySimple/laby1.txt";
                }else{
                    if(nomlaby.equals("3")){
                        nomlaby="labySimple/laby2.txt";
                    }
                }
            }
            if (nomlaby.equals("labySimple/laby0.txt") || nomlaby.equals("labySimple/laby1.txt") || nomlaby.equals("labySimple/laby2.txt")){
                nomLabyCorrect=true;
            }
        }
        LabyJeu jeu = new LabyJeu(nomlaby);
        LabyDessin dessin = new LabyDessin();

        MoteurJeu.setFPS(pFPS);
        int taille = LabyDessin.TAILLE_RECTANGLE;
        MoteurJeu.setTaille(jeu.getLabi().getLength() * taille, jeu.getLabi().getLengthY() * taille);

        MoteurJeu.launch(jeu, dessin);
    }
}
