package Practice;

import javafx.util.Pair;

import java.util.Random;

/**
 * Created by MUKTADIR on 5/9/2017.
 */
public class PracticeGenerator {
    private static String[] prepositions = {"to", "from", "aboard", "about", "above", "across", "after", "against", "along", "amid", "among", "anti", "around", "as", "at", "before", "behind", "below", "beneath", "beside", "besides", "between", "beyond", "but", "by", "concerning", "considering", "despite", "down", "during", "except", "excepting", "excluding", "following", "for", "from", "in", "inside", "into", "like", "minus", "near", "of", "off", "on", "onto", "opposite", "outside", "over", "past", "per", "plus", "regarding", "round", "save", "since", "than", "through", "to", "toward", "towards", "under", "underneath", "unlike", "until", "up", "upon", "versus", "via", "with", "within", "without" };
    private static String[] articles = {"a", "an", "the"};

    public static Pair<String, String[] > fillPreposition(String sentence){
        for (String prep: prepositions){
            int i = sentence.indexOf(prep);
            if(i == -1) continue;

            //check whether middle of a word
            if(i > 0 && sentence.charAt(i - 1) != ' ') continue;
            int nextCharIndx = i + prep.length();
            if(nextCharIndx < sentence.length() && sentence.charAt(nextCharIndx) != ' ' )continue;

            String problem = sentence.replaceFirst(prep, " ____ ");
            int length = prepositions.length;
            System.out.print(length);
            Random rand = new Random();
            int index = (rand.nextInt()%length);
            index = (index>=0)?index:(-1*index);
            System.out.println("index : " + index);
            while(prepositions[index]==prep) {
                rand = new Random();
                index = (rand.nextInt() % length);
                index = (index>=0)?index:(-1*index);
            }
            Random rand1 = new Random();
            int index1 = (rand1.nextInt() % length);
            index1 = (index1>=0)?index1:(-1*index1);
            System.out.println("index : " + index1);
            System.out.println("index1 : "+ index1);
            System.out.println(prepositions[index1]);
            while(prepositions[index1]==prep||index==index1){
                rand1 = new Random();
                index1 = (rand1.nextInt() % length);
                index1 = (index1>=0)?index1:(-1*index1);
            }
            System.out.println("index : " + index);
            System.out.println("index1 : " + index1);
            System.out.print(prepositions[index]);
            System.out.print(prepositions[index1]);
            String[] temp = new String[5];
            temp[0] = prep;
            temp[1] = prepositions[index];
            temp[2] = prepositions[index1];
            /*Random rand2 = new Random();
            int idx = rand2.nextInt() % 3;
            idx = (idx>0)?idx:((-1)*idx);
            temp[idx] = prepositions[index];
            Random rand3 = new Random();
            int idx1 = rand3.nextInt() % 3;
            idx1 = (idx1>0)?idx1:((-1)*idx1);
            while(idx==idx1){
                idx1 = rand3.nextInt()%3;
                idx1 = (idx1>0)?idx1:((-1)*idx1);
            }
            temp[idx1] = prepositions[index1];
            Random rand4 = new Random();
            int idx2 = rand4.nextInt() % 3;
            idx2 = (idx2>0)?idx2:((-1)*idx2);
            while(idx==idx2||idx1==idx2){
                idx2 = rand4.nextInt() % 3;
                idx2 = (idx2>0)?idx2:((-1)*idx2);
            }
            temp[idx2] = prep;
            System.out.println("idx : " + idx);
            System.out.println("idx1 : " + idx1);
            System.out.println("idx2 : " + idx2);
            System.out.println(problem);
            for(String a:temp) {
                System.out.println(a);
            }
            temp[4] = prep;*/
            return new Pair<>(problem, temp);
        }
        String[] temp = new String[5];
        for(int i = 0; i < 4; i++)temp[i] = "";
        return new Pair<>("",temp);
    }
    
    public static Pair<String ,String[]> fillArticle(String sentence){
        for (String article: articles){
            int i = sentence.indexOf(article);
            if(i == -1) continue;

            //check whether middle of a word
            if(i > 0 && sentence.charAt(i - 1) != ' ') continue;
            int nextCharIndx = i + article.length();
            if(nextCharIndx < sentence.length() && sentence.charAt(nextCharIndx) != ' ' )continue;

            String problem = sentence.replaceFirst(article, " ____ ");
            int length = articles.length;
            System.out.print(length);
            Random rand = new Random();
            int index = (rand.nextInt()%length);
            index = (index>=0)?index:(-1*index);
            System.out.println("index : " + index);
            while(articles[index]==article) {
                rand = new Random();
                index = (rand.nextInt() % length);
                index = (index>=0)?index:(-1*index);
            }
            Random rand1 = new Random();
            int index1 = (rand1.nextInt() % length);
            index1 = (index1>=0)?index1:(-1*index1);
            System.out.println("index : " + index1);
            System.out.println("index1 : "+ index1);
            System.out.println(articles[index1]);
            while(articles[index1]==article||index==index1){
                rand1 = new Random();
                index1 = (rand1.nextInt() % length);
                index1 = (index1>=0)?index1:(-1*index1);
            }
            System.out.println("index : " + index);
            System.out.println("index1 : " + index1);
            System.out.print(articles[index]);
            System.out.print(articles[index1]);
            String[] temp = new String[5];
            Random rand2 = new Random();
            temp[0] = article;
            temp[1] = articles[index];
            temp[2] = articles[index1];
            /*int idx = rand2.nextInt() % 3;
            idx = (idx>0)?idx:((-1)*idx);
            temp[idx] = articles[index];
            Random rand3 = new Random();
            int idx1 = rand3.nextInt() % 3;
            idx1 = (idx1>0)?idx1:((-1)*idx1);
            while(idx==idx1){
                idx1 = rand3.nextInt()%3;
                idx1 = (idx1>0)?idx1:((-1)*idx1);
            }
            temp[idx1] = articles[index1];
            Random rand4 = new Random();
            int idx2 = rand4.nextInt() % 3;
            idx2 = (idx2>0)?idx2:((-1)*idx2);
            while(idx==idx2||idx1==idx2){
                idx2 = rand4.nextInt() % 3;
                idx2 = (idx2>0)?idx2:((-1)*idx2);
            }
            temp[idx2] = article;
            System.out.println("idx : " + idx);
            System.out.println("idx1 : " + idx1);
            System.out.println("idx2 : " + idx2);
            System.out.println(problem);
            for(String a:temp) {
                System.out.println(a);
            }
            temp[4] = article;*/
            return new Pair<>(problem, temp);
        }
        String[] temp = new String[5];
        for(int i = 0; i < 4; i++)temp[i] = "";
        return new Pair<>("",temp);
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
