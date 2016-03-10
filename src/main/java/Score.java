/**
 * Created by QYL on 2016/3/9.
 * la creation de la class Score pour calculer les points #3
 */
public class Score implements IScore{
    private int[] itsThrows = new int[31];//tableau des Scores
    private int ball;//le numero du lance
    private int itsCurrentThrow =  0;//le numero du lance en current


    public int scoreForFrame(int theFrame){
        return 0;
    }

    @Override
    public int getCurrentThrow(){
        return this.itsCurrentThrow;
    }
    /**
     * rajouter les scores dans la tableau
     * itsThrows[le numero du lance]=score
     * @param pins:score
     */
    @Override
    public void addThrow(int pins){
        itsThrows[itsCurrentThrow++]=pins;
    }
    /*
    * strike
    * une methode strike #8
    * */
    @Override
    public boolean strike(){
        return itsThrows[ball] == 10;
    }

    /*
    * deux lances apres strike #8
    * */
    @Override
    public int nextTwoBallsForStrike(){
        int a=++ball;
        int b=++ball;
        return itsThrows[a]+itsThrows[b];
    }
    /*
    * spare
    * une methode spare #7
    * */
    @Override
    public boolean spare(){
        return (itsThrows[ball] + itsThrows[ball + 1]) == 10;
    }
    /*
    * un lances apres spare #7
    * */
    @Override
    public int nextBallForSpare(){
        ball +=2;
        int a=ball;
        return itsThrows[a];
    }
    /*
    * normal
    * une methode normal #9
    * */
    @Override
    public int twoBallsInFrame(){
        return itsThrows[ball]+itsThrows[ball+1];
    }
}
