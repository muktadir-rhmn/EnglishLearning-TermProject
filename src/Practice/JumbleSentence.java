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
public class JumbleSentence {


    private Random rand = new Random();
    private Scanner sc;
    ArrayList<String >str = new ArrayList<>();


    public LinkedList<Pair> getJumbledSentences(File file) throws FileNotFoundException {
        sc = new Scanner(file);
        LinkedList<Pair> list = new LinkedList<>();
        while (true){
            String sentence = getNextSentence();
            if(sentence.equals("")) break; //no more sentence
            list.add(new Pair(sentence, jumbleSentence(sentence)));
        }

        return list;
    }

    private String getNextSentence(){

        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()){
            String word = sc.next();
            if (word.charAt(word.length() - 1) == '.') {
                list.add( word.substring(0, word.length() - 1) );
                break;
            }
            list.add( word.substring(0, word.length()) );
        }

        String sentence = "";
        for (String word: list){
            sentence = sentence  + word + " ";
        }
        sentence.trim();
        return sentence;
    }

    private void loadBuffer(){

    }

    public  String jumbleSentence(String sentence){
        String[] words = sentence.split(" ");

        String jumbled = null;
        do{
            jumbled = jumbleSentence(words, words.length);
        }while (jumbled.equals(sentence));
        return jumbled;
    }

    private String jumbleSentence(String[] words, int len){
        if(len == 0) return "";
        String ret = null;

        int r = Math.abs(rand.nextInt() % len);
        ret = words[r];
        for (int i = r + 1; i < len ; i++){
            words[i- 1] = words[i];
        }
        return ret + " " + jumbleSentence(words, len -1);
    }
}
