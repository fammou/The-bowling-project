/**
 * Created by QYL on 2016/3/9.
 */
public interface IScore {
    /**
     * rajouter les scores dans la tableau
     * itsThrows[le numero du lance]=score
     * @param pins:score
     */
    public void addThrow(int pins);
    /*
    * strike
    * une methode strike #8
    * */
    public boolean strike();
    /*
    * deux lances apres strike #8
    * */
    public int nextTwoBallsForStrike();
    /*
    * spare
    * une methode spare #7
    * */
    public boolean spare();
    /*
    * un lances apres spare #7
    * */
    public int nextBallForSpare();
    /*
    * normal
    * une methode normal #9
    * */
    public int twoBallsInFrame();
}
