package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import Model.Practice;
import javafx.util.Pair;

public final class PrepostionPractise_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Preposition Practice - English Learning</title>\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\n");
      out.write("    <script>  \n");
      out.write("    function showResult() {\n");
      out.write("        alert(S);\n");
      out.write("            /*for (var i = correctOrder.length - 1; i > 0; i--) {\n");
      out.write("                if(!(currentOrder[correctOrder[i]] > currentOrder[correctOrder[i-1]] )){\n");
      out.write("                    alert(\"Wrong answer...\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            alert(\"Correct :) ...\");*/\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                    <li ><a href=\"#contact\">Grammar</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"PrepositionPractice.jsp\">Practice</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"sidebar\">\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Preposition Practice</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content\">\n");
      out.write("        ");

            
            String problem, options;
            Pair<String, String[]> practices[] = Practice.getFourPrepositionPractises();
            for(int i = 0; i < 1; i++){
                Pair<String, String[]> temp = practices[i]; 
                problem = temp.getKey();
        
      out.write("\n");
      out.write("            <option value=");
      out.print(i);
      out.write('>');
      out.print(problem);
      out.write("</option>\n");
      out.write("            \n");
      out.write("        ");

                Random rand = new Random();
                int idx = Math.abs(rand.nextInt() % 3);
                boolean[] visited = new boolean[3];
                for(int k = 0; k < 3; k++){
                    visited[k] = false;
                }
                int cnt = 0;
                while(true){
                    if(visited[idx]==false){
                        options = temp.getValue()[idx];
                        visited[idx] = true;
                        
      out.write("\n");
      out.write("                        <input type=\"checkbox\" value=");
      out.print(options);
      out.write(" name=\"Select\">\n");
      out.write("                        ");
      out.print(options);
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        ");

                        cnt++;
                    }
                    idx = Math.abs(rand.nextInt() % 3);
                    if(cnt==3)break;
                }
            }
        
      out.write("\n");
      out.write("        <button onclick=\"location.reload()\"  class=\"btn btn-danger\">Try Another</button>\n");
      out.write("        <button  onclick=\"showResult()\" class=\"btn btn-danger\">Show Result</button>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
