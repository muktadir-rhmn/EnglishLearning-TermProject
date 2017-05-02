package Admin;

import Model.MdlJumbledSentence;
import Practice.JumbledSentence;
import Practice.SentenceJumbler;

import java.io.IOException;
import java.io.PrintWriter;
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
       String sentences = req.getParameter("sentences");
        LinkedList<JumbledSentence> jumbledSentences = SentenceJumbler.getJumbledSentences(sentences);
        for (JumbledSentence s: jumbledSentences){
            System.out.println(s.sentence);
            MdlJumbledSentence.insert(s.sentence, s.correctOrder);
        }
        
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