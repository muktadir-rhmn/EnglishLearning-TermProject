package Admin;

import Model.MdlJumbledSentence;
import Model.Practice;
import Practice.JumbledSentence;
import Practice.PracticeGenerator;
import Practice.SentenceJumbler;
import Practice.SentenceManager;
import javafx.util.Pair;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="AddJumbledSentence", urlPatterns={"/Admin/AddJumbledSentence.do"})
public class AddJumbledSentence extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();

        //String name = req.getParameter("name");
       String paragraph = req.getParameter("sentences");

        //extract simple sentences
        SentenceManager sm = new SentenceManager(paragraph);
        ArrayList<String> sentences = sm.getSentences();

        //generates jumbled sentences
        LinkedList<JumbledSentence> jumbledSentences = SentenceJumbler.getJumbledSentences(sentences);
        for (JumbledSentence s: jumbledSentences){
            System.out.println(s.sentence);
            MdlJumbledSentence.insert(s.sentence, s.correctOrder);
        }

        for (String s : sentences){
            //generates splitted sentence
            Pair<String , String > p = PracticeGenerator.breakSentence(s);
            System.out.println("sentence matching: " + p.getKey()+ " : " + p.getValue());
            Practice.insert(p);
        }

        session.setAttribute("msg", " successfully added the jumbled word.");
        res.sendRedirect("AddJumbledSentence.jsp");
    } 

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

}
