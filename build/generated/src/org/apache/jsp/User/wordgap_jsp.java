package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import Model.Word;
import java.util.Set;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import Model.Lesson;
import Model.Practice;
import javafx.util.Pair;

public final class wordgap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Vocabulary - English Learning</title>\r\n");
      out.write("        <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <<!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.structure.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.theme.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"../Resources/js/jquery.js\" ></script>\r\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/js/jqueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("      <script>\r\n");
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
    
      out.write("\r\n");
      out.write("  $( function() {\r\n");
      out.write("    \r\n");
      out.write("    var availableTags = ");
      out.print(arr);
      out.write(";\r\n");
      out.write("    $( \"#searchWord\" ).autocomplete({\r\n");
      out.write("      source: availableTags\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("    <div id=\"banner\">\r\n");
      out.write("        <h1>English Learning</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"navcontainer\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li ><a href=\"home.jsp\">Home</a></li><li ><a href=\"word.jsp\">Vocabulary</a></li>\r\n");
      out.write("                    <li ><a href=\"Lesson.jsp\">Grammar</a></li>\r\n");
      out.write("                    <li class=\"active\"><a href=\"practice.jsp\">Practice</a></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                    <form action=\"showSearchWord.jsp\" method=\"get\" class=\"navbar-form\" role=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input id=\"searchWord\" type=\"text\" class=\"form-control\" placeholder=\"Search Word\" name=\"word\">\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebarPractice.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("wordgap", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("background: rgb(234,242,200);", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    <div id=\"content\">    \r\n");
      out.write("        ");

            Word object = new Word();
            ArrayList<Word> res = object.getAllWord();
        
      out.write("\r\n");
      out.write("        ");

            Random rand = new Random();
            int length = res.size();
            int idx = Math.abs(rand.nextInt() % length);
            String word = res.get(idx).getWord();
            int wordLength = word.length();
            while(wordLength<=2){
                idx = Math.abs(rand.nextInt() % length);
                word = res.get(idx).getWord();
                wordLength = word.length();
            }
            int blank_no = Math.abs(rand.nextInt() % 3);
            while(blank_no==0){
                blank_no = Math.abs(rand.nextInt() % 3);
            }
            boolean[] visited = new boolean[wordLength];
            for(int i = 0; i < wordLength; i++){
                visited[i] = false;
            }
            while(blank_no!=0){
                int index = Math.abs(rand.nextInt() % wordLength);
                if(visited[index]==false){
                    visited[index] = true;
                    blank_no--;
                }
            }
            
        
      out.write("\r\n");
      out.write("        ");

            int cGaps = 0;
            char [] gapLatter = new char[100];
            for(int i = 0; i < wordLength; i++){
                if(visited[i]==false){
        
      out.write("\r\n");
      out.write("        <b style=\"color:rgb(4,139,132)\" ><font size=\"6\">");
      out.print(word.charAt(i));
      out.write("</font></b>\r\n");
      out.write("        ");
}
        if(visited[i]==true){
           
        
      out.write("\r\n");
      out.write("        <input name=\"gap");
      out.print(cGaps);
      out.write("\" id=\"gap");
      out.print(cGaps);
      out.write("\" type=\"text\" style=\"width:40px;\"/>\r\n");
      out.write("        ");

            gapLatter[cGaps] = word.toLowerCase().charAt(i);
            cGaps++;
        }
        
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <br/>\r\n");
      out.write("        <button onclick=\"location.reload()\"  class=\"btn btn-danger\">Try Another</button>\r\n");
      out.write("        <button name=\"showresult\" onclick=\"showResult()\"  class=\"btn btn-danger\" >Show Result</button>\r\n");
      out.write("    </div>    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("            var cGaps = ");
      out.print(cGaps);
      out.write(";\r\n");
      out.write("            var corGap = [\r\n");
      out.write("                ");
for(int i = 0; i < cGaps ; i++){
                    out.print("\""+gapLatter[i] + "\",");
                }
                
      out.write("\r\n");
      out.write("            ];\r\n");
      out.write("            \r\n");
      out.write("            function showResult(){\r\n");
      out.write("             \r\n");
      out.write("                var result = 1;\r\n");
      out.write("                for(var i = 0 ; i < cGaps; i++){\r\n");
      out.write("                    var gap = $(\"#gap\" + i).val();\r\n");
      out.write("                    var corG = corGap[i];\r\n");
      out.write("                    if(gap != corG){\r\n");
      out.write("                        result = 0;\r\n");
      out.write("                        break;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                if(result == 1){\r\n");
      out.write("                    alert(\"Correct... :)\")\r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("                else{\r\n");
      out.write("                    alert(\"wrong answer... :(\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
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
