package Test;

import Database.DataAccess;
import Practice.JumbleSentence;
import Practice.Pair;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) throws FileNotFoundException {
       JumbleSentence js = new JumbleSentence();
       LinkedList<Pair> list = js.getJumbledSentences(new File("C:\\Users\\MUKTADIR\\Documents\\NetBeansProjects\\html parsing\\test.txt"));
       for (Pair p : list){
           System.out.println(p.s1 + " => " + p.s2);
       }

    }

    public static void copyToClipBoard(String s){
        StringSelection stringSelection = new StringSelection(s);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);

    public static void main(String[] args){
        System.out.println("hell");
        DataAccess obj = DataAccess.getDataAccess();
    }

    public static String getTextBox(String name){

        return String.format("<!--%s text box-->\n" +
                "<div class=\"form-group\">\n" +
                "    <label for=\"%s\" class=\"control-label col-sm-1\">%s</label>\n" +
                "    <div class=\"col-sm-11\">\n" +
                "        <input name=\"%s\" id=\"%s\" type=\"text\" class=\"form-control\" placeholder=\"%s\">\n" +
                "    </div>\n" +
                "</div>\n" +
                "<!--/%s text box-->", name, name , name, name, name , name, name);

    }
}
