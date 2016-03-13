import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QYL on 2016/3/13.
 */
public class ScoreTest {
    Score score;
    @Before
    public void setUp() throws Exception {
        score = new Score();
    }

    @Test
    public void testScoreForFrame() throws Exception {
        assertEquals(0,score.scoreForFrame(0));
    }

    @Test
    public void testGetCurrentThrow() throws Exception {
        assertEquals(0,score.getCurrentThrow());
    }

    @Test
    public void testStrike() throws Exception {
        assertEquals(false,score.strike());
    }

    @Test
    public void testNextTwoBallsForStrike() throws Exception {
        assertEquals(0,score.nextTwoBallsForStrike());
    }

    @Test
    public void testSpare() throws Exception {
        assertEquals(false,score.spare());
    }

    @Test
    public void testNextBallForSpare() throws Exception {
        assertEquals(0,score.nextBallForSpare());
    }

    @Test
    public void testTwoBallsInFrame() throws Exception {
        assertEquals(0,score.twoBallsInFrame());
    }
}