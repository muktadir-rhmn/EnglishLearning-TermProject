package Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) throws IOException {
        String[] str = {
                "1111111111111111",
                "1000100010000001",
                "1000100010000001",
                "1000000010001001",
                "1000000010001001",
                "1000100010001001",
                "0000100000001001",
                "0000100000001001",
                "1111111111111001",
                "0000000000001001",
                "0000000000001001",
                "0000010000001001",
                "0000010000001001",
                "0000010000000001",
                "0000010000000001",
                "1111111111111111"
        };
    }

    public static void copyToClipBoard(String s) {
        StringSelection stringSelection = new StringSelection(s);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
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
