/**
 * Created by QYL on 2016/3/9.
 * la creation de la class Score pour calculer les points #3
 */
public class Score implements IScore {
    /**
     * sldgjhslfdn.
     */
    static final int PLAN = 31;
    /**
     * tableau des Scores.
     */
    private int[] itsThrows = new int[PLAN];
    /**
     * ten.
     */
    static final int TEN = 10;
    /**
     * le numero du lance.
     */
    private int ball;
    /**
     * le numero du lance en current.
     */
    private int itsCurrentThrow = 0;

    /**
     *
     * @return int length
     */
    public final int getitsThrows() {
        return this.itsThrows.length;
    }
    /**
     *
     * @param theFrame argument
     * @return int sdflkjdaslkf
     */
    public final int scoreForFrame(final int theFrame) {
        ball = 0;
        int score = 0;
        for (int currentFrame = 1; currentFrame <= theFrame; currentFrame++) {
            if (strike()) { //strike
                score += TEN + nextTwoBallsForStrike();
                ball++;
            } else if (spare()) { //spare
                score += TEN + nextBallForSpare();
                ball++;
            } else { //normal
                score += twoBallsInFrame();
                ball += 2;
            }
        }
        return score;
    }

    @Override
    public final int getCurrentThrow() {
        return this.itsCurrentThrow;
    }

    /**
     * rajouter les scores dans la tableau.
     * itsThrows[le numero du lance]=score.
     *
     * @param pins:score
     */
    @Override
    public final void addThrow(final int pins) {
        itsThrows[itsCurrentThrow++] = pins;
    }

    /*
    * strike
    * une methode strike #8.
    * */
    @Override
    public final boolean strike() {
        return itsThrows[ball] == TEN;
    }

    /*
    * deux lances apres strike #8
    * */
    @Override
    public final int nextTwoBallsForStrike() {
        int a = ++ball;
        int b = ++ball;
        return itsThrows[a] + itsThrows[b];
    }

    /*
    * spare
    * une methode spare #7
    * */
    @Override
    public final boolean spare() {
        return (itsThrows[ball] + itsThrows[ball + 1]) == TEN;
    }

    /*
    * un lances apres spare #7
    * */
    @Override
    public final int nextBallForSpare() {
        ball += 2;
        int a = ball;
        return itsThrows[a];
    }

    /*
    * normal
    * une methode normal #9
    * */
    @Override
    public final int twoBallsInFrame() {
        return itsThrows[ball] + itsThrows[ball + 1];
    }
}
