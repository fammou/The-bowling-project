/**
 * Created by sow25 on 09/03/16.
 */
public class Joueur {

    private int itsCurrentFrame = 0;//le numero de frame
    private boolean firstThrowInFrame = true;//le jou premier fois sur une frame
    private Scorer itsScorer = new Scorer();//le compteur score

    public Joueur(){
    }


    public int score(){
        return 0;
    }

    public void add(int pins){
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
