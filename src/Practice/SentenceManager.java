package Practice;

import java.util.ArrayList;

/**
 * Created by MUKTADIR on 5/9/2017.
 */
public class SentenceManager {
    public static void main(String[] args) {
        String str = "I am going to the market today";
        System.out.println(PracticeGenerator.fillArticle(str));
        //SentenceManager s = new SentenceManager(str);

    }

    private ArrayList<String> list = new ArrayList<>();

    public SentenceManager(String paragraph){
        String[] sentences = makeSentence(paragraph);
        for (String sentence: sentences){

            sentence = beautify(sentence);
            //System.out.println(sentence);
            if(isSimple(sentence)){
                System.out.println(sentence);
                list.add(sentence);
            }
        }
    }

    public ArrayList<String> getSentences(){return list;}

    private String[] makeSentence(String paragraph){
        String[] ret = paragraph.split("[.?!]");
        return ret;
    }

    private String beautify(String sentence){
        String ret = sentence.trim().replaceAll("[ \n\t]+", " ");
   //     if (ret.length() > 1 && ret.charAt(0) == '"') ret = ret.substring(2);
//        if (ret.charAt(ret.length() - 1) == '"') ret = ret.substring(0, ret.length());
        return ret;
    }

    private static boolean isSimple(String sentence){
        int len = sentence.length();

        if(len < 1 || len > 50) return false; //too much lengthy
        if(!sentence.contains(" ")) return false; //single word

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(!(ch == ' ' ||(ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){ //some punctuation mark
                return false;
            }
        }
        return true;
    }
}
