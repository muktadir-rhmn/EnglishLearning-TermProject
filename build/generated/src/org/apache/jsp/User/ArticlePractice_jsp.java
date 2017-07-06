package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Practice;
import javafx.util.Pair;

public final class ArticlePractice_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Jumbled Sentence - English Learning</title>\r\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <<!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <body onload=\"init();\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("    <div id=\"banner\">\r\n");
      out.write("        <h1>English Learning</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"navcontainer\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li ><a href=\"#\">Home</a></li>\r\n");
      out.write("                    <li ><a href=\"#about\">Vocabulary</a></li>\r\n");
      out.write("                    <li ><a href=\"#contact\">Grammar</a></li>\r\n");
      out.write("                    <li class=\"active\"><a href=\"ArticlePractise.jsp\">Practice</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"sidebar\">\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Article Practice</a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("        ");

            String problem, options;
            Pair<String, String[]> practices[] = Practice.getFourArticlePractises();
            for(int i = 0; i < 1; i++){
                Pair<String, String[]> temp = practices[i];
                problem = temp.getKey();
        
      out.write("\r\n");
      out.write("            <option value=");
      out.print(i);
      out.write('>');
      out.print(problem);
      out.write("</option>\r\n");
      out.write("            \r\n");
      out.write("        ");

                for(int j = 0; j < 3; j++){
                    options = temp.getValue()[j];
        
      out.write("\r\n");
      out.write("            <input type=\"checkbox\" value=");
      out.print(options);
      out.write(" name=\"Select\">\r\n");
      out.write("            ");
      out.print(options);
      out.write("\r\n");
      out.write("            <br>        \r\n");
      out.write("        ");

                }
            }
        
      out.write("\r\n");
      out.write("        <button onclick=\"location.reload()\"  class=\"btn btn-danger\">Try Another</button>\r\n");
      out.write("        <button class=\"btn btn-danger\">Show Result</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
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
