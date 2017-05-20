package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EnterPractices_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("New Lesson Practices", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newLessonSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

    String lessonId = request.getParameter("lessonId");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Question-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"question\" class=\"control-label col-sm-2\">Question</label>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("        <input name=\"question\" id=\"question\" type=\"text\" class=\"form-control\" placeholder=\"Enter a Question...\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<!--option1-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"option1\" class=\"control-label col-sm-2\">Option 1</label>\r\n");
      out.write("    <div class=\"col-sm-6\">\r\n");
      out.write("        <input name=\"option1\" id=\"option1\" type=\"text\" class=\"form-control\" placeholder=\"Enter Option 1...\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<!--ooption2-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"option2\" class=\"control-label col-sm-2\">Option 1</label>\r\n");
      out.write("    <div class=\"col-sm-6\">\r\n");
      out.write("        <input name=\"option2\" id=\"option2\" type=\"text\" class=\"form-control\" placeholder=\"Enter Option 1...\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<!--option3-->\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"option3\" class=\"control-label col-sm-2\">Option 3</label>\r\n");
      out.write("    <div class=\"col-sm-6\">\r\n");
      out.write("        <input name=\"option3\" id=\"option3\" type=\"text\" class=\"form-control\" placeholder=\"Enter Option 3...\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("    <label for=\"option3\" class=\"control-label col-sm-2\"></label>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("        <input type=\"button\" value=\"Add\" onclick=\"addPractice()\" class=\"btn btn-primary\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<hr/>\r\n");
      out.write("\r\n");
      out.write("<!-- added Question list-->\r\n");
      out.write("<ul id=\"questionList\" style=\"font-size: large;\">\r\n");
      out.write("    <li>\r\n");
      out.write("        What is your name? <a href=\"#\" class=\"btn btn-default btn-sm\"><span class=\"glyphicon glyphicon-trash\"></span></a>\r\n");
      out.write("\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>Muktadir</li>\r\n");
      out.write("            <li>rahman</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    <br/>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
