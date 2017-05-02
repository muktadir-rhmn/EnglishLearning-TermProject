package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Practice.JumbledSentence;
import Model.MdlJumbledSentence;

public final class JumbledSentence_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Jumbled Sentence - English Learning</title>\r\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <<!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        /********************************Dragging Circle*****************************/\r\n");
      out.write("        /*Reference: http://www.createjs.com/tutorials/Mouse%20Interaction/ */\r\n");
      out.write("        //var text = [ \"world\", \"hello\"]\r\n");
      out.write("        ");

        JumbledSentence js = MdlJumbledSentence.getRandomSentence();
        ;
        
      out.write("\r\n");
      out.write("        var text = [ ");
      out.print(js.sentence);
      out.write("] //the words to be showed in the canvas\r\n");
      out.write("        var correctOrder = [ ");
      out.print(js.correctOrderStr);
      out.write("];//the currect order of the words for being a valid sentence\r\n");
      out.write("        var currentOrder = [");
      out.print(js.correctOrderStr);
      out.write("]; //x co-ordinate of the words currently showing in the canvas\r\n");
      out.write("\r\n");
      out.write("        var nextWordPosition = 5;\r\n");
      out.write("        var tmp;\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         This function need to be called when the webpage loads. This is initialize the canvas.\r\n");
      out.write("         */\r\n");
      out.write("        var stage;\r\n");
      out.write("        function init() {\r\n");
      out.write("            stage = new createjs.Stage(\"demoCanvas\");\r\n");
      out.write("\r\n");
      out.write("            // this lets our drag continue to track the mouse even when it leaves the canvas:\r\n");
      out.write("            // play with commenting this out to see the difference.\r\n");
      out.write("            stage.mouseMoveOutside = true;\r\n");
      out.write("            drawText();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function drawText() {\r\n");
      out.write("            for (var i = 0; i < text.length ; i++) {\r\n");
      out.write("\r\n");
      out.write("                //created the text\r\n");
      out.write("                var label = new createjs.Text(text[i], \"bold 20px Arial\", \"#0000\");\r\n");
      out.write("                label.x = 0;\r\n");
      out.write("                label.y = 0;\r\n");
      out.write("\r\n");
      out.write("                //created a rectangle\r\n");
      out.write("                var rect = new createjs.Shape();\r\n");
      out.write("                rect.x = label.x\r\n");
      out.write("                rect.y = label.y\r\n");
      out.write("                rect.graphics.clear().beginFill(\"rgb(82, 142, 254)\").drawRect(-5, -5, label.getMeasuredWidth() + 10, 36);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                //grouped the label and the circle into container. All the elements's co-ordinate\r\n");
      out.write("                //is with respect to the container, not absolute position.\r\n");
      out.write("                var dragger = new createjs.Container();\r\n");
      out.write("                dragger.x = nextWordPosition\r\n");
      out.write("                dragger.y = 10;\r\n");
      out.write("                dragger.id = i\r\n");
      out.write("                dragger.addChild( rect, label);\r\n");
      out.write("\r\n");
      out.write("                stage.addChild(dragger);\r\n");
      out.write("\r\n");
      out.write("                dragger.on(\"pressmove\", function(evt){\r\n");
      out.write("                    // currentTarget will be the container that the event listener was added to:\r\n");
      out.write("                    currentOrder[evt.currentTarget.id] = evt.currentTarget.x = evt.stageX;\r\n");
      out.write("                    evt.currentTarget.y = evt.stageY;\r\n");
      out.write("                    // make sure to redraw the stage to show the change:\r\n");
      out.write("                    stage.update();\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                stage.update();\r\n");
      out.write("\r\n");
      out.write("                //update nextWordPosition\r\n");
      out.write("                currentOrder[i] = nextWordPosition;\r\n");
      out.write("                nextWordPosition += label.getMeasuredWidth() + 30;\r\n");
      out.write("\r\n");
      out.write("            };\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showResult() {\r\n");
      out.write("            for (var i = correctOrder.length - 1; i > 0; i--) {\r\n");
      out.write("                if(!(currentOrder[correctOrder[i]] > currentOrder[correctOrder[i-1]] )){\r\n");
      out.write("                    alert(\"Wrong answer...\");\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            alert(\"Correct :) ...\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        canvas{\r\n");
      out.write("            border:1px solid #000000;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"init();\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("    <div id=\"banner\">\r\n");
      out.write("        <h1>English Learning</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"navcontainer\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#about\">About</a></li>\r\n");
      out.write("                    <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"list-group\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Jumbled Sentence</a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("        <canvas id=\"demoCanvas\" width=\"500\" height=\"200\" ></canvas>\r\n");
      out.write("        <br>\r\n");
      out.write("        <button onclick=\"location.reload();\"  class=\"btn btn-danger\">Try Another</button>\r\n");
      out.write("        <button onclick=\"showResult();\" class=\"btn btn-danger\">Show Result</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
