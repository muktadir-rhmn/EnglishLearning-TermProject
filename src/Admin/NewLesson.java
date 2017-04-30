package Admin;

import Database.DataAccess;
import Model.Entity;
import Model.EntityLevel;
import Model.Lesson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="NewLesson", urlPatterns={"/Admin/NewLesson.do"})
public class NewLesson extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        
        String level = req.getParameter("level");
        Integer result = Integer.valueOf(level);
        String title = req.getParameter("title");
        String body = req.getParameter("body");
        Entity obj = new Entity();
        if(result == 0){
            Lesson obj2 = new Lesson(title, body, 0, 1);
            obj2.insertLesson();
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
