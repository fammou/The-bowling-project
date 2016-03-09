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
        if (lastBallInFrame(pins))
            advanceFrame();
        else
            firstThrowInFrame = false;
    }

    private boolean lastBallInFrame(int pins){
        return stricke(pins)||!firstThrowInFrame;
    }


    private boolean stricke(int pins){
        return (firstThrowInFrame && pins == 10);
    }


    private void advanceFrame(){
        itsCurrentFrame = Math.min(10, itsCurrentFrame + 1);
    }

    public int scoreForFrame(int theFrame){
        return 0;
    }

}
