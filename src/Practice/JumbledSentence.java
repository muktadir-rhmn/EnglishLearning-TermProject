package Practice;

import java.util.ArrayList;

/**
 * Created by MUKTADIR on 4/27/2017.
 */
public class JumbledSentence {


    public String sentence = null;
    public int[] correctOrder = null;
    public String correctOrderStr;

    public JumbledSentence(){};

    public JumbledSentence(String sentence) {
        this.sentence = sentence;
        this.correctOrder = new int[1];
        this.correctOrder[0] = 0;
    }

    public String getSentence() {
        return sentence;
    }

}
