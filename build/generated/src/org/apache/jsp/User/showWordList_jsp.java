package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Word;
import java.util.Set;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import Model.Lesson;
import Model.Practice;
import javafx.util.Pair;

public final class showWordList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Lesson - English Learning</title>\r\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <<!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.structure.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.theme.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"../Resources/js/jquery.js\" ></script>\r\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\r\n");
      out.write("    <script src=\"../Resources/js/jqueryUI/jquery-ui.min.js\"></script>\r\n");
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
      out.write("  } );\r\n");
      out.write("  </script>    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <body>\r\n");
      out.write("        <body onload=\"init();\">\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("    <div id=\"banner\">\r\n");
      out.write("        <h1>English Learning</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"navcontainer\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li ><a href=\"#\">Home</a></li>\r\n");
      out.write("                    <li class=\"active\"><a href=\"showWordList.jsp\">Vocabulary</a></li>\r\n");
      out.write("                    <li ><a href=\"practice.jsp\">Practice</a></li>\r\n");
      out.write("                    <li><a href=\"Lesson.jsp\">Grammar</a></li>\r\n");
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
      out.write("    <div id=\"sidebar\">\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("            ");

                Word obj1 = new Word();
                Set<Pair<String,Integer> >list = obj1.getWordLevel();
                Iterator<Pair<String,Integer> > itr = list.iterator();
                while(itr.hasNext()){
                    Pair<String, Integer> tmp = itr.next();
                    String temp = tmp.getKey();
                    Integer no = tmp.getValue();
            
      out.write("\r\n");
      out.write("            <a href=\"showWordGroup.jsp?levelID=");
      out.print(no);
      out.write("\" class=\"list-group-item\">");
      out.print(temp);
      out.write("</a>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("            <div id=\"content\">    \r\n");
      out.write("            ");

                int level_id = Integer.valueOf(request.getParameter("content"));
                //out.println(level_id);
                Word object = new Word();
                ArrayList<Word> List = object.getWord(level_id);
                for(int i = 0; i < List.size(); i++){
                    String word = List.get(i).getWord();
                    String meaning = List.get(i).getMeaning();
                    String partsofSpeech = List.get(i).getPartsofSpeech();
                    int entity_id = List.get(i).getEntityID();
            
      out.write("\r\n");
      out.write("                <a href=\"showWord.jsp?word=");
      out.print(word);
      out.write("&meaning=");
      out.print(meaning);
      out.write("&partsofSpeech=");
      out.print(partsofSpeech);
      out.write("&entity_id=");
      out.print(entity_id);
      out.write("\" class=\"list-group-item\">");
      out.print(word);
      out.write("</a>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
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
