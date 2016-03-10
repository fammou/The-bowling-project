import static org.junit.Assert.*;

/**
 * Created by QYL on 2016/3/10.
 */
public class ScoreTest {
    IScore score=new Score();
    @org.junit.Test
    public void testAddThrow() throws Exception {
        score.addThrow(5);
        assertEquals(1,score.getCurrentThrow());
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