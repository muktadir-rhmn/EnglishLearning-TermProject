package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Database.DataAccess;

public final class NewLesson_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("New Lesson", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newLessonSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("sectionVocabulary", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collapse", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"NewLesson.do\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("    <!--level selection-->\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-sm-1\">\r\n");
      out.write("             <label for=\"level\" class=\"control-label \">Level</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9\">\r\n");
      out.write("            <select name=\"level\" id=\"level\" class=\"form-control\">\r\n");
      out.write("                <!--To Arnob: Get levels from database and print like the following-->\r\n");
      out.write("                ");

                    DataAccess db = DataAccess.getDataAccess();
                    ArrayList<String> List = db.levelList();
                    for(int i = 0; i < List.size(); i++){
                        String name = List.get(i);
                
      out.write("\r\n");
      out.write("                        <option value=i>");
      out.print(name);
      out.write("</option>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </select>\r\n");
      out.write("            <!-- Trigger the modal with a button -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-2\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-plus\"></span></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/level selection-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--Title text box-->\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"title\" class=\"control-label col-sm-1\">Title</label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <input name=\"title\" id=\"title\" type=\"text\" class=\"form-control\" placeholder=\"Title\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/Title text box-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("    <!--Text Editor-->\r\n");
      out.write("    <div id=\"editor\">\r\n");
      out.write("        <label for=\"edit\" >Lesson</label>\r\n");
      out.write("        <textarea name=\"body\" id=\"edit\"> </textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/Text Editor-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <input type=\"submit\" value=\"Post\" class=\"btn btn-primary btn-lg\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal for creating new level-->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal content-->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">New Level</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <!--Level from-->\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <!-- Text input-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=\"levelTitle\">Title</label>\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <input id=\"levelTitle\" name=\"levelTitle\" type=\"text\" placeholder=\"title\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Button -->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=\"btnNewLevel\"></label>\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <button id=\"btnNewLevel\" name=\"btnNewLevel\" class=\"btn btn-primary\">Create</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </fieldset>\r\n");
      out.write("                </form>\r\n");
      out.write("                <!--/Level from-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  <!-- /Modal Content-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div> <!-- /Modal -->\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/footer/admin_footer.jsp", out, false);
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
