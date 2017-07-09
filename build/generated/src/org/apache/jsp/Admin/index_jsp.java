package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Login - Admin</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"../Resources/js/jquery.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"../Resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        \r\n");
      out.write("        $('.message a').click(function(){\r\n");
      out.write("   $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\r\n");
      out.write("});\r\n");
      out.write("    </script>\r\n");
      out.write("    <style>\r\n");
      out.write("        @import url(https://fonts.googleapis.com/css?family=Roboto:300);\r\n");
      out.write("\r\n");
      out.write(".login-page {\r\n");
      out.write("  width: 360px;\r\n");
      out.write("  padding: 8% 0 0;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write(".form {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  background: #FFFFFF;\r\n");
      out.write("  max-width: 360px;\r\n");
      out.write("  margin: 0 auto 100px;\r\n");
      out.write("  padding: 45px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\r\n");
      out.write("}\r\n");
      out.write(".form input {\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  background: #f2f2f2;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  margin: 0 0 15px;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".form button {\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  background: #4CAF50;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  color: #FFFFFF;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  -webkit-transition: all 0.3 ease;\r\n");
      out.write("  transition: all 0.3 ease;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".form button:hover,.form button:active,.form button:focus {\r\n");
      out.write("  background: #43A047;\r\n");
      out.write("}\r\n");
      out.write(".form .message {\r\n");
      out.write("  margin: 15px 0 0;\r\n");
      out.write("  color: #b3b3b3;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".form .message a {\r\n");
      out.write("  color: #4CAF50;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".form .register-form {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write(".container {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  max-width: 300px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".container:before, .container:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: block;\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write(".container .info {\r\n");
      out.write("  margin: 50px auto;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".container .info h1 {\r\n");
      out.write("  margin: 0 0 15px;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  font-size: 36px;\r\n");
      out.write("  font-weight: 300;\r\n");
      out.write("  color: #1a1a1a;\r\n");
      out.write("}\r\n");
      out.write(".container .info span {\r\n");
      out.write("  color: #4d4d4d;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".container .info span a {\r\n");
      out.write("  color: #000000;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".container .info span .fa {\r\n");
      out.write("  color: #EF3B3A;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("  background: #76b852; /* fallback for old browsers */\r\n");
      out.write("  background: -webkit-linear-gradient(right, #76b852, #8DC26F);\r\n");
      out.write("  background: -moz-linear-gradient(right, #76b852, #8DC26F);\r\n");
      out.write("  background: -o-linear-gradient(right, #76b852, #8DC26F);\r\n");
      out.write("  background: linear-gradient(to left, #76b852, #8DC26F);\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  -webkit-font-smoothing: antialiased;\r\n");
      out.write("  -moz-osx-font-smoothing: grayscale;      \r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    ");

    String msg = (String) session.getAttribute("msg");
    if(msg != null){
        out.print(
                "<div class='alert alert-success'>" + msg +"</div>"
        );
        session.removeAttribute("msg");
    }
    
      out.write("\r\n");
      out.write("<div class=\"login-page\">\r\n");
      out.write("  <div class=\"form\">\r\n");
      out.write("    \r\n");
      out.write("      <form method=\"post\" action=\"Login.do\" class=\"login-form\">\r\n");
      out.write("      <input name=\"userName\" type=\"text\" placeholder=\"username\"/>\r\n");
      out.write("      <input name=\"password\" type=\"password\" placeholder=\"password\"/>\r\n");
      out.write("      <button>login</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
