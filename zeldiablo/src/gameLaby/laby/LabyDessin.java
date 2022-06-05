package gameLaby.laby;

import gameLaby.laby.caseEffet.Case;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import moteurJeu.DessinJeu;
import moteurJeu.Jeu;

import java.awt.*;

public class LabyDessin implements DessinJeu {
    public static final int TAILLE_RECTANGLE = 30;

    @Override
    public void dessinerJeu(Jeu jeu, Canvas canvas) {
        //recuperation du labyrinthe
        Labyrinthe labyrinthe = ((LabyJeu) (jeu)).getLabi();
        //taille
        int longueur = labyrinthe.getLength();
        int largeur = labyrinthe.getLengthY();

        //recuperation du pinceau
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        //dessin du labyrinthe
        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < largeur; j++) {
                Case c = labyrinthe.getCase(i, j);
                if (c.getType() == Labyrinthe.MUR) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(i * TAILLE_RECTANGLE, j * TAILLE_RECTANGLE, TAILLE_RECTANGLE, TAILLE_RECTANGLE);
                }
                else if (c.getType() != Labyrinthe.MUR && labyrinthe.getPj().etrePresent(c)) {
                    gc.setFill(Color.YELLOW);
                    gc.fillOval(i * TAILLE_RECTANGLE, j * TAILLE_RECTANGLE, TAILLE_RECTANGLE, TAILLE_RECTANGLE);
                }
                else if (c.getType() == Labyrinthe.CASEDECLENCHEUR){
                    gc.setFill(Color.WHITE);
                    gc.fillRect(i * TAILLE_RECTANGLE, j * TAILLE_RECTANGLE, TAILLE_RECTANGLE, TAILLE_RECTANGLE);
                }
                else if (c.getType() == Labyrinthe.CASEPIEGEE) {
                    gc.setFill(Color.RED);
                    gc.fillRect(i * TAILLE_RECTANGLE, j * TAILLE_RECTANGLE, TAILLE_RECTANGLE, TAILLE_RECTANGLE);
                }
            }
        }
    }
}
