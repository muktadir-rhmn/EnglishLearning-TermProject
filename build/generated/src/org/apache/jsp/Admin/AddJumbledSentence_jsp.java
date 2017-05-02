package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddJumbledSentence_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("New Lesson", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newLessonSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write("\n");
      out.write("<form action=\"AddJumbledSentence.do\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("    <!--sentences text box-->\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"sentences\" class=\"control-label col-sm-2\">Sentences</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <textarea name=\"sentences\" id=\"sentences\" class=\"form-control\" placeholder=\"Write some sentences...\"></textarea>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br/>\n");
      out.write("    <!--/sentences text box-->\n");
      out.write("    <br>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <div class=\"control-label col-sm-2\"></div>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"submit\" value=\"Jumble & Store\" class=\"btn btn-primary\"/>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br/>\n");
      out.write("</form>\n");
      out.write("\n");
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
