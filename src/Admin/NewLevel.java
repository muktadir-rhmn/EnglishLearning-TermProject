package Admin;

import Model.EntityLevel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="NewLevel", urlPatterns={"/Admin/NewLevel.do"})
public class NewLevel extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        
        //String name = req.getParameter("name");
        String levelTitle = req.getParameter("levelTitle");
        String levelNo = req.getParameter("levelNo");
        Integer result = Integer.valueOf(levelNo);
        String levelType = req.getParameter("levelType");
        Integer result1 = Integer.valueOf(levelType);
        EntityLevel obj = new EntityLevel();
        obj.insertLevel(result1, result, levelTitle);
        
        session.setAttribute("msg", " successfully added the new level.");
        res.sendRedirect("NewLesson.jsp");
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
