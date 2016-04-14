/**
 * Created by QYL on 2016/3/9.
 */
public interface IScore {
    /**
     *
     * @return le retor
     */
    int getCurrentThrow();

    /**
     * @param pins argument
     */
    void addThrow(int pins);

    /**
     * @return le retor
     */
    boolean strike();

    /**
     * @return le retor
     */
    int nextTwoBallsForStrike();

    /**
     * @return le retor
     */
    boolean spare();

    /**
     * @return le retor
     */
    int nextBallForSpare();

    /**
     * @return le retor
     */
    int twoBallsInFrame();

}
