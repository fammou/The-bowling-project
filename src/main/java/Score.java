/**
 * Created by QYL on 2016/3/9.
 * la creation de la class Score pour calculer les points #3
 */
public class Score {
    private int[] itsThrows = new int[31];//tableau des Scores
    private int ball;//le numero du lance
    private int itsCurrentThrow =  0;//le numero du lance en current

    /**
     * rajouter les scores dans la tableau
     * itsThrows[le numero du lance]=score
     * @param pins:score
     */
    public void addThrow(int pins){
        itsThrows[itsCurrentThrow++]=pins;
    }
    /*
    * strike
    * une methode strike #8
    * */
    private boolean strike(){
        return itsThrows[ball] == 10;
    }

    /*
    * deux lances apres strike #8
    * */
    private int nextTwoBallsForStrike(){
        int a=++ball;
        int b=++ball;
        return itsThrows[a]+itsThrows[b];
    }
    /*
    * spare
    * une methode spare #7
    * */
    private boolean spare(){
        return (itsThrows[ball] + itsThrows[ball + 1]) == 10;
    }
    /*
    * un lances apres spare #7
    * */
    private int nextBallForSpare(){
        ball +=2;
        int a=ball;
        return itsThrows[a];
    }
    /*
    * normal
    * une methode normal #9
    * */
    private int twoBallsInFrame(){
        return itsThrows[ball]+itsThrows[ball+1];
    }
}
