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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lesson - English Learning</title><link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.structure.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.theme.min.css\" rel=\"stylesheet\"> \n");
      out.write("    \n");
      out.write("    <script src=\"../Resources/js/jquery.js\" ></script>\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\n");
      out.write("    <script src=\"../Resources/js/jqueryUI/jquery-ui.min.js\"></script>\n");
      out.write("    \n");
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<form action=\"wordgroup.do\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("   \n");
      out.write("       \n");
      out.write("    \n");
      out.write("    <div id=\"content\">    \n");
      out.write("        ");

            Word object = new Word();
            ArrayList<Word> res = object.getAllWord();
        
      out.write("\n");
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
            
        
      out.write("\n");
      out.write("        ");

            for(int i = 0; i < wordLength; i++){
                if(visited[i]==false){
        
      out.write("\n");
      out.write("        <b style=\"color:rgb(4,139,132)\" ><font size=\"6\">");
      out.print(word.charAt(i));
      out.write("</font></b>\n");
      out.write("        ");
}
        if(visited[i]==true){
        
      out.write("\n");
      out.write("            <input name=\"");
      out.print(i);
      out.write("\" type=\"text\" style=\"width:40px;\"/>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    \n");
      out.write("        <br/>\n");
      out.write("        <button onclick=\"location.reload()\"  class=\"btn btn-danger\">Try Another</button>\n");
      out.write("        <button name=\"showresult\" onclick=\"showResult()\"  class=\"btn btn-danger\" value=\"hhh\">Show Result</button>\n");
      out.write("    </div>    \n");
      out.write("    </div>\n");
      out.write("    </form>\n");
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
