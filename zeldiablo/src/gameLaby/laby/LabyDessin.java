package gameLaby.laby;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import moteurJeu.DessinJeu;
import moteurJeu.Jeu;

public class LabyDessin implements DessinJeu {
    public static final int TAILLE_RECTANGLE = 30;

    @Override
    public void dessinerJeu(Jeu jeu, Canvas canvas) {
        //recuperation du labyrinthe
        Labyrinthe labyrinthe = ((LabyJeu)(jeu)).getLabi();
        //taille
        int longueur = labyrinthe.getLength();
        int largeur = labyrinthe.getLengthY();

        //recuperation du pinceau
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //dessin du labyrinthe
        for (int i = 0; i<longueur;i++){
            for (int j = 0; j<largeur;i++){
                boolean mur = labyrinthe.getMur(i,j);
                if (mur){
                    gc.setFill(Color.BLACK);
                    gc.fillRect(j*10,i*10,TAILLE_RECTANGLE, TAILLE_RECTANGLE);
                }
                else if (!mur && labyrinthe.getPj().getX()==i && labyrinthe.getPj().getY()==j){
                    gc.setFill(Color.RED);
                    gc.fillOval(j*10,i*10,TAILLE_RECTANGLE/2, TAILLE_RECTANGLE/2);
                }
            }
        }
    }
}
