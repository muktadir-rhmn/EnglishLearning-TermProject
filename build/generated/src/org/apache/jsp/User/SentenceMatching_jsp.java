package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Word;
import Model.Word;
import Model.Practice;
import javafx.util.Pair;
import java.util.Random;

public final class SentenceMatching_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Pair<String ,String > practices[] = Practice.getFourSentences();
    System.out.println("len: " +practices.length);
    String[] secondColumn = new String[4];
    int [] correctMach = new int[4];
    Random rand = new Random();

    for (int i = 0; i < 4; i++){

        while (true){
            int r = Math.abs(rand.nextInt() % 4);
            System.out.println(r);
            if(r != i && secondColumn[r] == null){

                secondColumn[r] = practices[i].getValue();
                System.out.println(i);
                correctMach[i] = r;
                break;
            }
        }
    }

    String s1 = "";
    String s2 = "";
    String strCorrectMatch = "";
    for (int i = 0; i < 4; i++) {
        s1 += "\"" + practices[i].getKey() + "\",";
        s2 += "\"" + secondColumn[i] + "\",";
        strCorrectMatch += "\"" + correctMach[i] + "\",";
    }


      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Jumbled Sentence - English Learning</title>\n");
      out.write("    <link href=\"../Resources/css/user/style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <<!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("     <link href=\"../Resources/js/jqueryUI/jquery-ui.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.structure.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"../Resources/js/jqueryUI/jquery-ui.theme.min.css\" rel=\"stylesheet\"> \n");
      out.write("    \n");
      out.write("    <script src=\"../Resources/js/jquery.js\" ></script>\n");
      out.write("    <script src=\"../Resources/js/canvasFramework/easeljs-0.8.2.min.js\"></script>\n");
      out.write("    <script src=\"../Resources/js/jqueryUI/jquery-ui.min.js\"></script>\n");
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
      out.write("    <script>\n");
      out.write("      \n");
      out.write("      function SentenceMatcher () {\n");
      out.write("        //parameters:to be filled by server\n");
      out.write("/*\n");
      out.write("        this.text = [ //the words to be showed in the canvas\n");
      out.write("\n");
      out.write("          [ \"My name is\" ,  \"I live \", \"Buet is\", \"how are\" ],  //first column\n");
      out.write("          [\"in Dhaka\", \"best university ever\", \"you going on with studies?\", \"Muktadir rahman\"  ] //second column.\n");
      out.write("        ];\n");
      out.write("        this.correctMatch = [3, 0, 1, 2];\n");
      out.write("\n");
      out.write("*/\n");
      out.write("          this.text = [ //the words to be showed in the canvas\n");
      out.write("\n");
      out.write("              [ ");
      out.print(s1);
      out.write(" ],  //first column\n");
      out.write("              [ ");
      out.print(s2);
      out.write(" ] //second column.\n");
      out.write("          ];\n");
      out.write("          this.correctMatch = [");
      out.print(strCorrectMatch);
      out.write("];\n");
      out.write("        this.currentMatch = [0, 0, 0, 0]; //current order selected by the user.\n");
      out.write("\n");
      out.write("        this.addMatch = function (columnNoOfM, m, n) {\n");
      out.write("          //alert(m + \" \" + n)\n");
      out.write("          if(columnNoOfM == 0) this.currentMatch[m] = n;\n");
      out.write("          else this.currentMatch[n] = m;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        this.checkValidity = function  () {\n");
      out.write("          for (var i = 0; i < this.correctMatch.length; i++) {\n");
      out.write("            if(this.correctMatch[i] != this.currentMatch[i]) return false;\n");
      out.write("          };\n");
      out.write("          return true;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        this.getNumRows = function  () {\n");
      out.write("          return this.text[0].length;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        this.reset = function  () {\n");
      out.write("          for (var i = 0; i < this.currentMatch.length; i++) {\n");
      out.write("            this.currentMatch[i] = -1;//so that if the user match correctly, and then \n");
      out.write("          //clicks reset, it will not show correct answer\n");
      out.write("          };\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      //colors\n");
      out.write("      columnColor = [\"#A1FB7B\", \"#EFB2E2\"];\n");
      out.write("      //Line color\n");
      out.write("      lineColor =  [\"#EDE15A\", \"#71F765\", \"#CDF5AC\", \"#93F7C7\", \"#93F1F7\", \"#7F81F7\", \"#E35FE3\", \"#F58D76\"];\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      var matcher = new SentenceMatcher();\n");
      out.write("\n");
      out.write("      var firstColumnSize = 180; //first column starts at x = 0;\n");
      out.write("      var middleFreeSpace = 100;\n");
      out.write("      var marginTop = 35;\n");
      out.write("\n");
      out.write("      var stage;\n");
      out.write("      var isDrawingLine = false;\n");
      out.write("      var source;\n");
      out.write("      var sourceColumn;\n");
      out.write("      var sourceX;\n");
      out.write("      var sourceY;\n");
      out.write("      var currentColor;\n");
      out.write("      var line = [];\n");
      out.write("      function getCurrentLine () {\n");
      out.write("        //if drawing, then what is the reference of current line\n");
      out.write("        if(!isDrawingLine) return;\n");
      out.write("        return line[source];\n");
      out.write("      }\n");
      out.write("      function init() {\n");
      out.write("        /*\n");
      out.write("        We need to create a stage object at first. This is the root of all objects. \n");
      out.write("        In a word, this stage represents the whole canvas.\n");
      out.write("        */\n");
      out.write("        stage = new createjs.Stage(\"demoCanvas\");\n");
      out.write("        for (var i = 0; i < matcher.getNumRows(); i++) {\n");
      out.write("          //one line for each correct match.\n");
      out.write("          var t = new createjs.Shape();\n");
      out.write("          t.id = i; //index in line[] in which this shape resides.\n");
      out.write("          line.push(t); //insert at the end of the array.\n");
      out.write("          stage.addChild(t);\n");
      out.write("          \n");
      out.write("        };\n");
      out.write("\n");
      out.write("        for (var i = 0; i < 2 ; i++) {\n");
      out.write("          for(var j = 0; j < matcher.text[i].length; j++){\n");
      out.write("            var textBox;\n");
      out.write("            if(i == 0) textBox = generateTextBox(j, matcher.text[i][j], columnColor[i], firstColumnSize, j * 60 + marginTop, true);\n");
      out.write("            else textBox = generateTextBox(j, matcher.text[i][j], columnColor[i], firstColumnSize + middleFreeSpace, j * 60 + marginTop);\n");
      out.write("\n");
      out.write("            textBox.on(\"click\", function (evt) {\n");
      out.write("\n");
      out.write("              var textBox = evt.currentTarget;\n");
      out.write("\n");
      out.write("              if(isDrawingLine){ //clicked on destination\n");
      out.write("                var curLine = getCurrentLine();\n");
      out.write("                isDrawingLine = false;\n");
      out.write("\n");
      out.write("                //updates the matcher.\n");
      out.write("                destColumn = textBox.x > 250 ? 1 : 0;\n");
      out.write("                //alert(destColumn + \" \" + sourceColumn);\n");
      out.write("                if(sourceColumn == destColumn){ //source and destination in the same column.\n");
      out.write("                  curLine.graphics.clear();\n");
      out.write("                  stage.update();\n");
      out.write("                  matcher.addMatch(sourceColumn, source, -1); //so that if the correct choice were made previously, still it will give wrong answer\n");
      out.write("                  return;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                matcher.addMatch(sourceColumn, source, textBox.id);\n");
      out.write("\n");
      out.write("              }\n");
      out.write("              else{//clicked on source\n");
      out.write("                  sourceColumn = textBox.x > 250 ? 1 : 0;\n");
      out.write("                  if(sourceColumn == 1) return;\n");
      out.write("                  source = textBox.id;\n");
      out.write("                  sourceX = evt.stageX;\n");
      out.write("                  sourceY = evt.stageY;\n");
      out.write("                  currentColor = parseInt(Math.random() * lineColor.length);\n");
      out.write("\n");
      out.write("                  isDrawingLine = true;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            stage.addChild(textBox);\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        stage.on(\"stagemousemove\", function  (evt) {\n");
      out.write("          if(isDrawingLine){\n");
      out.write("            \n");
      out.write("            getCurrentLine().graphics.clear()\n");
      out.write("                  .beginStroke(lineColor[currentColor])\n");
      out.write("                  .setStrokeStyle(3, \"round\")\n");
      out.write("                  .moveTo(sourceX, sourceY)\n");
      out.write("                  .lineTo(evt.stageX, evt.stageY);\n");
      out.write("            stage.update();\n");
      out.write("          }\n");
      out.write("        })\n");
      out.write("\n");
      out.write("        stage.on(\"dblclick\", function  (evt) {\n");
      out.write("          /*Graphics object of shape class works like a layer in photoshop. \n");
      out.write("          if we clear the layer, the content will be deleted from the stage. \n");
      out.write("          */\n");
      out.write("          if(isDrawingLine) {\n");
      out.write("            matcher.addMatch(sourceColumn, source, -1); //so that if the correct choice were made previously, still it will give wrong answer\n");
      out.write("            getCurrentLine().graphics.clear();\n");
      out.write("            isDrawingLine = false;\n");
      out.write("            stage.update()\n");
      out.write("          } \n");
      out.write("        })\n");
      out.write("        stage.update(); //update the canvas\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function generateTextBox (id, text, color, x, y, paddLeft = false){\n");
      out.write("        /**\n");
      out.write("        if paddLeft = false, then x = total lenth.\n");
      out.write("        */\n");
      out.write("\n");
      out.write("        //created the text\n");
      out.write("        var label = new createjs.Text(text, \"bold 16px Arial\", \"#0000\");\n");
      out.write("        label.x = 0;\n");
      out.write("        label.y = 0;\n");
      out.write("\n");
      out.write("        //created a rectangle\n");
      out.write("        var rect = new createjs.Shape();\n");
      out.write("        rect.x = label.x\n");
      out.write("        rect.y = label.y\n");
      out.write("        rect.graphics.clear().beginFill(color).drawRect(-5, -5, label.getMeasuredWidth() + 10, 30);\n");
      out.write("        \n");
      out.write("        //grouped the label and the circle into container. All the elements's co-ordinate \n");
      out.write("        //is with respect to the container, not absolute position.\n");
      out.write("        var textBox = new createjs.Container();\n");
      out.write("        textBox.id = id;\n");
      out.write("        \n");
      out.write("        if(paddLeft) textBox.x = x - label.getMeasuredWidth();\n");
      out.write("        else textBox.x = x;\n");
      out.write("\n");
      out.write("        textBox.y = y;\n");
      out.write("        textBox.addChild(rect, label);\n");
      out.write("        return textBox;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function reset () {\n");
      out.write("        for (var i = 0; i < line.length; i++) {\n");
      out.write("          line[i].graphics.clear();\n");
      out.write("        };\n");
      out.write("        matcher.reset();\n");
      out.write("        stage.update();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function showResult () {\n");
      out.write("        if(matcher.checkValidity()) alert(\"Correct :)\");\n");
      out.write("        else alert(\"Wrong\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        canvas{\n");
      out.write("            border:1px solid #000000;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body onload=\"init();\">\n");
      out.write("<div id=\"container\">\n");
      out.write("    <div id=\"banner\">\n");
      out.write("        <h1>English Learning</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"navcontainer\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"#\">Home</a></li>\n");
      out.write("                    <li ><a href=\"word.jsp\">Vocabulary</a></li>\n");
      out.write("                    <li ><a href=\"Lesson.jsp\">Grammar</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"JumbledSentence.jsp\">Practice</a></li>\n");
      out.write("                    <li>\n");
      out.write("                    <form action=\"showSearchWord.jsp\" method=\"get\" class=\"navbar-form\" role=\"search\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"searchWord\" type=\"text\" class=\"form-control\" placeholder=\"Search Word\" name=\"word\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"sidebar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Jumbled Sentence</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"content\">\n");
      out.write("\n");
      out.write("       <canvas id=\"demoCanvas\" width=\"530\" height=\"300\"></canvas>\n");
      out.write("       <br><br>\n");
      out.write("       <button onclick=\"showResult()\" class=\"btn btn-danger\">View Result</button>\n");
      out.write("        <button onclick=\"location.reload();\"  class=\"btn btn-danger\">Try Another</button>\n");
      out.write("       <button onclick=\"reset()\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
