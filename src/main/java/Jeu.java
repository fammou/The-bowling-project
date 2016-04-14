/**
 * Created by sow2cinq on 02/03/1six.
 */
public class Jeu {

    /**
     * Main: Exécute le projet.
     * @param args argument
     */
    private static void main(final String[] args) {

        final int taille = 11;
        final int un = 1;
        final int trois = 3;
        final int quatre = 4;
        final int cinq = 5;
        final int six = 6;
        final int sept = 7;
        final int neuf = 9;
        final int dix = 10;

        int[] scores = {dix, six, six, six, quatre, sept, cinq, cinq, cinq,
                quatre, cinq, dix, dix, dix, dix, dix, dix, neuf, un, dix,
                six, quatre, dix, dix, dix, dix, dix, dix, dix};

        int[] scores2 = {six, quatre, sept, sept, trois, sept, cinq, cinq,
                cinq, quatre, quatre, dix, dix, dix, dix, un, sept, quatre,
                cinq, six, quatre, dix, dix, dix, dix, dix, dix, dix};

        Joueur g = new Joueur();
        Joueur g2 = new Joueur();

        for (int i = 0; i < scores.length; i++) {
            g.add(scores[i]);
        }


        for (int i = 0; i < scores2.length; i++) {
            g2.add(scores2[i]);
        }

        for (int j = 1; j < taille; j++) {
            System.out.println("Joueur1: ==> score au lancé " + j + " est: "
                    + g.scoreForFrame(j));
            System.out.println("Joueur2: ==> score au lancé " + j + " est: "
                    + g2.scoreForFrame(j));
        }

    }
}
