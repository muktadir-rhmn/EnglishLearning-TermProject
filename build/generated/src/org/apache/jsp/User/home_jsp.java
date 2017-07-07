package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Word;
import java.util.Random;
import Model.Practice;
import javafx.util.Pair;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>");
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
      out.write("        <title>Jumbled Sentence - English Learning</title>\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.structure.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.theme.min.css\" rel=\"stylesheet\"> \n");
      out.write("    \n");
      out.write("    <script src=\"../Resources/js/jquery.js\" ></script>\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\n");
      out.write("    <script src=\"../Resources/js/jqueryUI/jquery-ui.min.js\"></script>\n");
      out.write("      <script>\n");
      out.write("          ");

    Word obj = new Word();
    ArrayList<Word> array = obj.getAllWord();
    ArrayList<String> array1 = new ArrayList<String>();
    for(int i = 0; i < array.size(); i++){
        array1.add(array.get(i).getWord());
    }
    ;
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    for(int i=0; i<array1.size(); i++){
        sb.append("\"").append(array1.get(i)).append("\"");
        if(i+1 < array1.size()){
            sb.append(",");
        }
    }
    sb.append("]");
    String arr = sb.toString();
    
      out.write("\n");
      out.write("  $( function() {\n");
      out.write("    \n");
      out.write("    var availableTags = ");
      out.print(arr);
      out.write(";\n");
      out.write("    $( \"#searchWord\" ).autocomplete({\n");
      out.write("      source: availableTags\n");
      out.write("    });\n");
      out.write("  } );\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body onload=\"init();\">\n");
      out.write("<div id=\"container\">\n");
      out.write("    <div id=\"banner\">\n");
      out.write("        <h1>English Learning</h1>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"navcontainer\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"#\">Home</a></li>\n");
      out.write("                    <li ><a href=\"word.jsp\">Vocabulary</a></li>\n");
      out.write("                    <li ><a href=\"Lesson.jsp\">Grammar</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"ArticlePractice.jsp\">Practice</a></li>\n");
      out.write("                    <li>\n");
      out.write("                    <form action=\"showSearchWord.jsp\" method=\"get\" class=\"navbar-form\" role=\"search\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"searchWord\" type=\"text\" class=\"form-control\" placeholder=\"Search Word\" name=\"word\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"main_block\">\n");
      out.write("\n");
      out.write("    <div class=\"inner_block\">\n");
      out.write("        <h2>Home</h2>\n");
      out.write("    <a href=\"home.jsp\">\n");
      out.write("    <img src=\"../Resources/images/user/home-icon.png\" >\n");
      out.write("    </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"inner_block\">\n");
      out.write("        <h2>Vocabulary</h2>\n");
      out.write("    <a href=\"word.jsp\">\n");
      out.write("    <img src=\"../Resources/images/user/vocabulary.png\" alt=\"Mountain View\" >\n");
      out.write("    </a>\n");
      out.write("    </div>    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"main_block\">\n");
      out.write("\n");
      out.write("    <div class=\"inner_block\">\n");
      out.write("        <h2>Practice</h2>\n");
      out.write("    <a href=\"practice.jsp\">\n");
      out.write("    <img src=\"../Resources/images/user/practice.png\" >\n");
      out.write("    </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"inner_block\">\n");
      out.write("        <h2>Vocabulary</h2>\n");
      out.write("    <a href=\"Lesson.jsp\">\n");
      out.write("    <img src=\"../Resources/images/user/grammer.png\" alt=\"Mountain View\" >\n");
      out.write("    </a>\n");
      out.write("    </div>    \n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
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
