package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddFillUpArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Resources/header/admin_header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Add Article Practise", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("newLessonSideBar", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding()), out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

    String msg = (String) session.getAttribute("msg");
    if(msg != null){
        out.print(
                "<div class='alert alert-success'>" + msg +"</div>"
        );
        session.removeAttribute("msg");
    }

      out.write("\r\n");
      out.write("<form action=\"AddFillUpArticle.do\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("    <!--sentences text box-->\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"sentences\" class=\"control-label col-sm-2\">Sentences</label>\r\n");
      out.write("        <div class=\"col-sm-10\">\r\n");
      out.write("            <textarea name=\"sentences\" id=\"sentences\" class=\"form-control\" placeholder=\"Write some sentences...\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <!--/sentences text box-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"control-label col-sm-2\"></div>\r\n");
      out.write("        <div class=\"col-sm-10\">\r\n");
      out.write("            <input type=\"submit\" value=\"Make Fill In the Blanks & Store\" class=\"btn btn-primary\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br/>\r\n");
      out.write("</form>\r\n");
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
