package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("New Word", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newWordSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-lg-6\">\r\n");
      out.write("        <!-- body of the page-->\r\n");
      out.write("        <form action=\"Admin/NewWord.do\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("            <!--word group box-->\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-sm-1\">\r\n");
      out.write("                    <label for=\"group\" class=\"control-label \">group</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-9\">\r\n");
      out.write("                    <select name=\"group\" id=\"group\" class=\"form-control\">\r\n");
      out.write("                        <!--To Arnob: Get groups from database and print like the following-->\r\n");
      out.write("                        <option value=\"1\">Basic</option>\r\n");
      out.write("                        <option value=\"1\">------Basic</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <!-- Trigger the modal with a button -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-2\">\r\n");
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
      out.write("            <br>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"control-label col-sm-2\"></div>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Add Word\" class=\"btn btn-primary\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- /.container-fluid -->\r\n");
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
