package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import Model.Lesson;
import Model.Practice;
import javafx.util.Pair;

public final class showLessonList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lesson - English Learning</title>\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body>\n");
      out.write("        <body onload=\"init();\">\n");
      out.write("<div id=\"container\">\n");
      out.write("    <div id=\"banner\">\n");
      out.write("        <h1>English Learning</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"navcontainer\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"#\">Home</a></li>\n");
      out.write("                    <li ><a href=\"#about\">Vocabulary</a></li>\n");
      out.write("                    <li ><a href=\"#contact\">Practice</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"ArticlePractise.jsp\">Grammar</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"sidebar\">\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("            ");

                Lesson obj1 = new Lesson();
                Set<Pair<String,Integer> >list = obj1.getLessonLevel();
                Iterator<Pair<String,Integer> > itr = list.iterator();
                while(itr.hasNext()){
                    Pair<String, Integer> tmp = itr.next();
                    String temp = tmp.getKey();
                    Integer no = tmp.getValue();
            
      out.write("\n");
      out.write("            <a href=\"showLessonList.jsp?levelID=");
      out.print(no);
      out.write("\" class=\"list-group-item\">");
      out.print(temp);
      out.write("</a>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("            ");

                int level_id = Integer.valueOf(request.getParameter("levelID"));
                Lesson object = new Lesson();
                ArrayList<Pair<String,String> > List = object.getLesson(level_id);
                String size = Integer.toString(List.size());
                out.println(size);
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
