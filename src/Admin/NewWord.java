package Admin;

import Model.Entity;
import Model.Word;
import Model.wordExample;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="NewWord", urlPatterns={"/Admin/NewWord.do"})
public class NewWord extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        String group = req.getParameter("group");
        Integer result = Integer.valueOf(group);
        String word = req.getParameter("word");
        String meaning = req.getParameter("meaning");
        String example = req.getParameter("example");
        String partsofSpeech = req.getParameter("partsofspeech");
        System.out.println(group);
        System.out.println(word);
        System.out.println(meaning);
        System.out.println(example);
        System.out.println(partsofSpeech);
        Entity obj = new Entity();
        Word obj1 = new Word(word, meaning, partsofSpeech, result);
        obj1.insertWord();
        String[] examples = example.split("\n");
        for(String e: examples) {
            wordExample obj2 = new wordExample(e);
            obj2.insertWordExample();
        }
        
        session.setAttribute("msg", " successfully added new word.");
        res.sendRedirect("NewWord.jsp");
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
