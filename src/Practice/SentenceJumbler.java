package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by MUKTADIR on 4/26/2017.
 */
public class SentenceJumbler {
    public static void main(String[] args) {
        SentenceJumbler s = new SentenceJumbler();
        String str =  "";
        //s.getJumbledSentences(str);
    }


    private static Random rand = new Random();

    public static LinkedList<JumbledSentence> getJumbledSentences(ArrayList<String> sentences){

        LinkedList<JumbledSentence> list = new LinkedList<>();
        for (String sentence: sentences){
            JumbledSentence t = jumbleSentence(sentence);
            System.out.println(t.sentence);
            for (int i = 0; i < t.correctOrder.length; i++) {
                System.out.print(t.correctOrder[i] + " ");
            }
            System.out.println();

           list.add(t);

        }
        return list;
    }


    public static  JumbledSentence jumbleSentence(String sentence){
        String[] words = sentence.split(" ");

        JumbledSentence p = null;
        do{
            System.out.println("Inside jumblesentence non-recursive");
            String[] tmp = words.clone();
            p = jumbleSentence(tmp, tmp.length);
        }while (p.sentence.equals(sentence));

        //change the order. The correct order of the words of the current sentences.
        int[] t = p.correctOrder.clone();
        for (int i = 0; i < t.length; i++) {
            p.correctOrder[t[i]] = i;
        }
        return p;
    }

    private static JumbledSentence jumbleSentence(String[] words, int len){
        System.out.println("jumblesentence recursive");
        if(len == 1) return new JumbledSentence("\"" + words[0] + "\"");

        JumbledSentence ret = new JumbledSentence();
        ret.correctOrder = new int[len];

        int r = Math.abs(rand.nextInt() % len); //this word will taken to first position in the jumble word
        ret.sentence = "\"" + words[r] + "\"";
        ret.correctOrder[0] = r;

        for (int i = r + 1; i < len ; i++)  words[i - 1] = words[i]; //shift the elements after word[r] by one position to the left

        JumbledSentence t = jumbleSentence(words, len - 1);
        ret.sentence = ret.sentence+ ", " + t.sentence;


        for (int i = 0; i < len - 1 ; i++) {
            if(t.correctOrder[i] >= r)ret.correctOrder[i + 1] = t.correctOrder[i] + 1;
            else ret.correctOrder[i + 1] = t.correctOrder[i];
        }

        return ret;
    }
}
