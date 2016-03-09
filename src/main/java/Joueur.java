/**
 * Created by sow25 on 09/03/16.
 */
public class Joueur {

    private int itsCurrentFrame = 0;//le numero de frame
    private boolean firstThrowInFrame = true;//le jou premier fois sur une frame
    private Score itsScorer = new Score();//le compteur de score

    public Joueur(){
    }


    public int score(){
        return scoreForFrame(itsCurrentFrame);
    }

    public void add(int pins){
        itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }


    private void adjustCurrentFrame(int pins){
    }

    private boolean lastBallInFrame(int pins){

        return true;
    }


    private boolean stricke(int pins){

        return true;
    }


    private void advanceFrame(){
    }

    public int scoreForFrame(int theFrame){

        return 0;
    }

}
