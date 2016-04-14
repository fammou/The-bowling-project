import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sow25 on 09/03/16.
 */
public class JoueurTest {

    Joueur joueur;

    @org.junit.Before
    public void setUp() throws Exception {
        joueur = new Joueur();
    }

    @org.junit.Test
    public void testScore() throws Exception {
        assertEquals(0, joueur.score());
    }

    @Test
    public void testadvanceFrame() throws Exception{
        joueur.advanceFrame();
        assertEquals(joueur.score(), 0);
    }

    @Test
    public void tetstricke() throws Exception{
        assertEquals(joueur.stricke(10), true);
    }

    @Test
    public void testlastBallInFrame() throws Exception{
        assertEquals(joueur.lastBallInFrame(10), true);
    }

    @Test
    public void testadjustCurrentFrame() throws Exception{
        joueur.adjustCurrentFrame(9);
        assertEquals(joueur.score(), 0);
    }

    @Test
    public void testadjustCurrentFrameElse() throws Exception{
        joueur.adjustCurrentFrame(1);
        assertEquals(joueur.score(), 0);
    }

    @org.junit.Test
    public void testAdd() throws Exception {
        joueur.add(10);
        assertEquals(joueur.score(), 10);
    }

    @org.junit.Test
    public void testScoreForFrame() throws Exception {
        joueur.scoreForFrame(10);
        assertEquals(joueur.score(), 0);
    }
}