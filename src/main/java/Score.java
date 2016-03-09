/**
 * Created by QYL on 2016/3/9.
 * la creation de la class Score pour calculer les points
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
}
