/**
 * Created by sow25 on 09/03/16.
 */
public class Joueur {
    /**
     * sdlkmfjq.
     */
    static final int DIX = 10;

    /**
     * le numero de frame.
     */
    private int itsCurrentFrame = 0;
    /**
     * le jou premier fois sur une frame.
     */
    private boolean firstThrowInFrame = true;
    /**
     * le compteur de score.
     */
    private Score itsScorer = new Score();

    /**
     *
     * @return score le score
     */
    public final int score() {
        return scoreForFrame(itsCurrentFrame);
    }

    /**
     *
     * @param pins param
     */
    public final void add(final int pins) {
        itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    /**
     *
     * @param pins param
     */
    public final void adjustCurrentFrame(final int pins) {
        if (lastBallInFrame(pins)) {
            advanceFrame();
        } else {
            firstThrowInFrame = false;
        }
    }

    /**
     *
     * @param pins param
     * @return boolean dkk
     */
    public final boolean lastBallInFrame(final int pins) {
        return stricke(pins) || !firstThrowInFrame;
    }

    /**
     *
     * @param pins param
     * @return boolean dml
     */
    public final boolean stricke(final int pins) {
        return (firstThrowInFrame && pins == DIX);
    }

    /**
     *msqkjf.
     */
    public final void advanceFrame() {
        itsCurrentFrame = Math.min(DIX, itsCurrentFrame + 1);
    }

    /**
     *
     * @param theFrame param
     * @return int dkjk
     */
    public final int scoreForFrame(final int theFrame) {
        return itsScorer.scoreForFrame(theFrame);
    }

}
