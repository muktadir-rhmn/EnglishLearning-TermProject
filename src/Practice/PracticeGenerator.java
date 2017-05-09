package Practice;

import javafx.util.Pair;

/**
 * Created by MUKTADIR on 5/9/2017.
 */
public class PracticeGenerator {
    private static String[] prepositions = {"to", "from", "aboard", "about", "above", "across", "after", "against", "along", "amid", "among", "anti", "around", "as", "at", "before", "behind", "below", "beneath", "beside", "besides", "between", "beyond", "but", "by", "concerning", "considering", "despite", "down", "during", "except", "excepting", "excluding", "following", "for", "from", "in", "inside", "into", "like", "minus", "near", "of", "off", "on", "onto", "opposite", "outside", "over", "past", "per", "plus", "regarding", "round", "save", "since", "than", "through", "to", "toward", "towards", "under", "underneath", "unlike", "until", "up", "upon", "versus", "via", "with", "within", "without" };
    private static String[] articles = {"a", "an", "the"};

    public static Pair<String, String > fillPreposition(String sentence){
        for (String prep: prepositions){
            int i = sentence.indexOf(prep);
            if(i == -1) continue;

            //check whether middle of a word
            if(i > 0 && sentence.charAt(i - 1) != ' ') continue;
            int nextCharIndx = i + prep.length();
            if(nextCharIndx < sentence.length() && sentence.charAt(nextCharIndx) != ' ' )continue;

            String problem = sentence.replaceFirst(prep, " ____ ");
            return new Pair<>(problem, prep);

        }
        return null;
    }
    
    public static Pair<String ,String> fillArticle(String sentence){
        for (String article: articles){
            int i = sentence.indexOf(article);
            if(i == -1) continue;

            //check whether middle of a word
            if(i > 0 && sentence.charAt(i - 1) != ' ') continue;
            int nextCharIndx = i + article.length();
            if(nextCharIndx < sentence.length() && sentence.charAt(nextCharIndx) != ' ' )continue;

            String problem = sentence.replaceFirst(article, " ____ ");
            return new Pair<>(problem, article);
        }
        return null;
    }


    /**
     * assumed at least two words in sentence.
     * @param sentence
     * @return
     */
    public static Pair<String, String> breakSentence(String sentence){
        String[] words = sentence.split(" ");
        int breakinPoint = words.length / 2;
        String s1, s2;
        s1= "";
        s2= "";
        for (int i = 0; i < breakinPoint; i++)s1 += words[i] + " ";
        for (int i = breakinPoint; i < words.length; i++)s2 += words[i] + " ";
        return new Pair<>(s1, s2);
    }
}
