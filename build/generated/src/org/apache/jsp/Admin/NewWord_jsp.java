package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Comparator;
import java.util.Collections;
import Model.WordGroup;
import java.util.ArrayList;
import java.util.ArrayList;
import Database.DataAccess;

public final class NewWord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("New Word", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newWordSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-lg-6\">\r\n");
      out.write("        <!-- body of the page-->\r\n");
      out.write("        <form action=\"Admin/NewWord.do\" method=\"get\" class=\"form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("            <!--word group box-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"group\" class=\"control-label col-sm-2\">Group</label>\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <select name=\"group\" id=\"group\" class=\"form-control\">\r\n");
      out.write("                        <!--Arnob: fetch word groups and word levels-->\r\n");
      out.write("                        ");

                        DataAccess db = DataAccess.getDataAccess();
                        ArrayList<WordGroup> levelList = db.getWordLevels();

                        
      out.write("\r\n");
      out.write("                        ");

                        for(WordGroup t : levelList){
                            ArrayList<WordGroup> groups = db.getWordGroups(t.get_entity_id());
                            if(groups.isEmpty()) continue;
                            
                        
      out.write("\r\n");
      out.write("                               <option>");
      out.print(t.get_entity_level_title());
      out.write("</option> \r\n");
      out.write("                        ");

                            for(WordGroup g: groups){
                        
      out.write("\r\n");
      out.write("                            <option value = \"");
      out.print(g.get_word_group_id());
      out.write("\">-----");
      out.print(g.get_word_group_title());
      out.write("</option> \r\n");
      out.write("                        ");
    
                        
                            }
                                                
                        }
                        
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("s                <div class=\"col-sm-2\">\r\n");
      out.write("                    <!-- Trigger the modal with a button -->\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-plus\"></span></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/word group box-->\r\n");
      out.write("\r\n");
      out.write("            <!--word text box-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"word\" class=\"control-label col-sm-2\">Word</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input name=\"word\" id=\"word\" type=\"text\" class=\"form-control\" placeholder=\"Word\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <!--/word text box-->\r\n");
      out.write("\r\n");
      out.write("            <!--meaning text box-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"meaning\" class=\"control-label col-sm-2\">Meaning</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <textarea name=\"meaning\" id=\"meaning\"  class=\"form-control\" placeholder=\"Meaning of the word\"> </textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <!--/meaning text box-->\r\n");
      out.write("\r\n");
      out.write("            <!--example text box-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"examples\" class=\"control-label col-sm-2\">Examples</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <textarea name=\"meaning\" id=\"examples\" class=\"form-control\" placeholder=\"Write an example per line\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <!--/examples text box-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"control-label col-sm-2\"></div>\r\n");
      out.write("        <div class=\"col-sm-10\">\r\n");
      out.write("            <input type=\"submit\" value=\"Add Word\" class=\"btn btn-primary\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal for creating new level-->\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal content-->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">New Group</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <!--Level from-->\r\n");
      out.write("                <form action=\"Admin/NewWordGroup.do\" class=\"form-horizontal\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("\r\n");
      out.write("                        <!--Word levels-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"wordLevel\" class=\"control-label col-sm-4\">Level</label>\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <select name=\"wordLevel\" id=\"wordLevel\" class=\"form-control\">\r\n");
      out.write("                                    <!--Arnob: fetche the word levels from database-->\r\n");
      out.write("                                    ");

                                    DataAccess db1 = DataAccess.getDataAccess();
                                    String tempName1 = "";
                                    int tempID1;
                                    
                                    for(WordGroup t: levelList){
                                    
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(t.get_entity_id());
      out.write('"');
      out.write('>');
      out.print(t.get_entity_level_title());
      out.write("</option> \r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-2\">\r\n");
      out.write("                                <!-- Trigger the modal with a button -->\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#newWordLevel\"><span class=\"glyphicon glyphicon-plus\"></span></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--/word levels box-->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Text input-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=\"groupTitle\">Title</label>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <input id=\"groupTitle\" name=\"groupTitle\" type=\"text\" placeholder=\"title\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /Text input-->\r\n");
      out.write("                        <!-- Button -->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=\"btnNewGroup\"></label>\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Create Group\" id=\"btnNewGroup\" class=\"btn btn-primary\"/>\r\n");
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
      out.write("\r\n");
      out.write("<!-- Modal for creating new level-->\r\n");
      out.write("<div class=\"modal fade\" id=\"newWordLevel\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal content-->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">New Group</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <!--Level from-->\r\n");
      out.write("                <form action=\"Admin/NewWordLevel.do\" class=\"form-horizontal\">\r\n");
      out.write("                    <fieldset>\r\n");
      out.write("                        <!-- Text input-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=\"wordlevel1\">Title</label>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <input id=\"wordlevel1\" name=\"level\" type=\"text\" placeholder=\"Word Level\" class=\"form-control input-md\" required=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /Text input-->\r\n");
      out.write("                        <!-- Button -->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-md-4 control-label\" for=></label>\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Create Level\" class=\"btn btn-primary\"/>\r\n");
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
