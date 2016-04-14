/**
 * Created by sow25 on 02/03/16.
 */
public class Jeu {

    public static void main(String[] args) {

        int scores[] = {10, 6, 6, 6, 4, 7, 5, 5, 5, 4, 5, 10, 10, 10, 10, 10, 10, 9, 1, 10, 6, 4, 10,
                10, 10, 10, 10, 10, 10};

        int scores2[] = {10, 6, 6, 7, 3, 7, 5, 5, 5, 4, 4, 6, 4, 1, 10, 1, 7, 4, 5, 6, 4, 10,
                10, 10, 10, 6, 4, 7};

        Joueur g = new Joueur();
        Joueur g2 = new Joueur();

        for (int i = 0; i < scores.length; i++) {
            g.add(scores[i]);
        }


        for (int i = 0; i < scores2.length; i++) {
            g2.add(scores2[i]);
        }

        for (int j = 1; j < 11; j++) {
            System.out.println("Joueur1: ==> score au lancé " + j + " est: " + g.scoreForFrame(j));
            System.out.println("Joueur2: ==> score au lancé " + j + " est: " + g2.scoreForFrame(j));
        }

    }
}
