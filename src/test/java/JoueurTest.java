import static org.junit.Assert.*;

/**
 * Created by sow25 on 09/03/16.
 */
public class JoueurTest {

    Joueur joueur;

    @org.junit.Before
    public void setUp() throws Exception {
        joueur = new Joueur();
        System.out.println();
    }

    @org.junit.Test
    public void testScore() throws Exception {
        System.out.println(joueur.score());
    }

    @org.junit.Test
    public void testAdd() throws Exception {

    }

    @org.junit.Test
    public void testScoreForFrame() throws Exception {

    }
}