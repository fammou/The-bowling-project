import static org.junit.Assert.*;

/**
 * Created by QYL on 2016/3/9.
 */
public class ScoreTest {
    Score score;
    @org.junit.Before
    public void setUp() throws Exception {
        score=new Score();
    }

    @org.junit.Test
    public void testAddThrow() throws Exception {
        score.addThrow(5);
        assertEquals(1,1);
    }

    @org.junit.Test
    public void testStrike() throws Exception {

    }

    @org.junit.Test
    public void testNextTwoBallsForStrike() throws Exception {

    }

    @org.junit.Test
    public void testSpare() throws Exception {

    }

    @org.junit.Test
    public void testNextBallForSpare() throws Exception {

    }

    @org.junit.Test
    public void testTwoBallsInFrame() throws Exception {

    }
}