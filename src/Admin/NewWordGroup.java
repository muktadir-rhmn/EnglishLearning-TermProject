package Admin;


import Model.WordGroup;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns={"/Admin/NewWordGroup.do"})
public class NewWordGroup extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        
        String title = req.getParameter("groupTitle");
        String wordLevel = req.getParameter("wordLevel");
        Integer result = Integer.valueOf(wordLevel);
        System.out.print("wordLevel: "+result);
        System.out.print("title: "+title);
        //String name = req.getParameter("name");
        //Arnob: insert the groups into database
        WordGroup obj = new WordGroup(title, result);
        obj.insertWordGroup();
        
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
