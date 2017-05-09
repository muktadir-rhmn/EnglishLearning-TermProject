<%@ page import="Model.Practice" %>
<%@ page import="javafx.util.Pair" %>
<%@ page import="java.util.Random" %>
<%
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

%>
<!DOCTYPE>
<html>
<head>
    <title>Jumbled Sentence - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

    <script src="../Resources/js/canvasFramework/easeljs-0.8.2.min.js"></script>
    <script>
      
      function SentenceMatcher () {
        //parameters:to be filled by server
/*
        this.text = [ //the words to be showed in the canvas

          [ "My name is" ,  "I live ", "Buet is", "how are" ],  //first column
          ["in Dhaka", "best university ever", "you going on with studies?", "Muktadir rahman"  ] //second column.
        ];
        this.correctMatch = [3, 0, 1, 2];

*/
          this.text = [ //the words to be showed in the canvas

              [ <%=s1%> ],  //first column
              [ <%=s2%> ] //second column.
          ];
          this.correctMatch = [<%=strCorrectMatch%>];
        this.currentMatch = [0, 0, 0, 0]; //current order selected by the user.

        this.addMatch = function (columnNoOfM, m, n) {
          //alert(m + " " + n)
          if(columnNoOfM == 0) this.currentMatch[m] = n;
          else this.currentMatch[n] = m;
        }

        this.checkValidity = function  () {
          for (var i = 0; i < this.correctMatch.length; i++) {
            if(this.correctMatch[i] != this.currentMatch[i]) return false;
          };
          return true;
        }

        this.getNumRows = function  () {
          return this.text[0].length;
        }

        this.reset = function  () {
          for (var i = 0; i < this.currentMatch.length; i++) {
            this.currentMatch[i] = -1;//so that if the user match correctly, and then 
          //clicks reset, it will not show correct answer
          };
          
        }
      }


      //colors
      columnColor = ["#A1FB7B", "#EFB2E2"];
      //Line color
      lineColor =  ["#EDE15A", "#71F765", "#CDF5AC", "#93F7C7", "#93F1F7", "#7F81F7", "#E35FE3", "#F58D76"];
    
      
      var matcher = new SentenceMatcher();

      var firstColumnSize = 180; //first column starts at x = 0;
      var middleFreeSpace = 100;
      var marginTop = 35;

      var stage;
      var isDrawingLine = false;
      var source;
      var sourceColumn;
      var sourceX;
      var sourceY;
      var currentColor;
      var line = [];
      function getCurrentLine () {
        //if drawing, then what is the reference of current line
        if(!isDrawingLine) return;
        return line[source];
      }
      function init() {
        /*
        We need to create a stage object at first. This is the root of all objects. 
        In a word, this stage represents the whole canvas.
        */
        stage = new createjs.Stage("demoCanvas");
        for (var i = 0; i < matcher.getNumRows(); i++) {
          //one line for each correct match.
          var t = new createjs.Shape();
          t.id = i; //index in line[] in which this shape resides.
          line.push(t); //insert at the end of the array.
          stage.addChild(t);
          
        };

        for (var i = 0; i < 2 ; i++) {
          for(var j = 0; j < matcher.text[i].length; j++){
            var textBox;
            if(i == 0) textBox = generateTextBox(j, matcher.text[i][j], columnColor[i], firstColumnSize, j * 60 + marginTop, true);
            else textBox = generateTextBox(j, matcher.text[i][j], columnColor[i], firstColumnSize + middleFreeSpace, j * 60 + marginTop);

            textBox.on("click", function (evt) {

              var textBox = evt.currentTarget;

              if(isDrawingLine){ //clicked on destination
                var curLine = getCurrentLine();
                isDrawingLine = false;

                //updates the matcher.
                destColumn = textBox.x > 250 ? 1 : 0;
                //alert(destColumn + " " + sourceColumn);
                if(sourceColumn == destColumn){ //source and destination in the same column.
                  curLine.graphics.clear();
                  stage.update();
                  matcher.addMatch(sourceColumn, source, -1); //so that if the correct choice were made previously, still it will give wrong answer
                  return;
                }

                matcher.addMatch(sourceColumn, source, textBox.id);

              }
              else{//clicked on source
                  sourceColumn = textBox.x > 250 ? 1 : 0;
                  if(sourceColumn == 1) return;
                  source = textBox.id;
                  sourceX = evt.stageX;
                  sourceY = evt.stageY;
                  currentColor = parseInt(Math.random() * lineColor.length);

                  isDrawingLine = true;
              }

            })

            stage.addChild(textBox);
          }
        }

        stage.on("stagemousemove", function  (evt) {
          if(isDrawingLine){
            
            getCurrentLine().graphics.clear()
                  .beginStroke(lineColor[currentColor])
                  .setStrokeStyle(3, "round")
                  .moveTo(sourceX, sourceY)
                  .lineTo(evt.stageX, evt.stageY);
            stage.update();
          }
        })

        stage.on("dblclick", function  (evt) {
          /*Graphics object of shape class works like a layer in photoshop. 
          if we clear the layer, the content will be deleted from the stage. 
          */
          if(isDrawingLine) {
            matcher.addMatch(sourceColumn, source, -1); //so that if the correct choice were made previously, still it will give wrong answer
            getCurrentLine().graphics.clear();
            isDrawingLine = false;
            stage.update()
          } 
        })
        stage.update(); //update the canvas
      }

      function generateTextBox (id, text, color, x, y, paddLeft = false){
        /**
        if paddLeft = false, then x = total lenth.
        */

        //created the text
        var label = new createjs.Text(text, "bold 16px Arial", "#0000");
        label.x = 0;
        label.y = 0;

        //created a rectangle
        var rect = new createjs.Shape();
        rect.x = label.x
        rect.y = label.y
        rect.graphics.clear().beginFill(color).drawRect(-5, -5, label.getMeasuredWidth() + 10, 30);
        
        //grouped the label and the circle into container. All the elements's co-ordinate 
        //is with respect to the container, not absolute position.
        var textBox = new createjs.Container();
        textBox.id = id;
        
        if(paddLeft) textBox.x = x - label.getMeasuredWidth();
        else textBox.x = x;

        textBox.y = y;
        textBox.addChild(rect, label);
        return textBox;
      }

      function reset () {
        for (var i = 0; i < line.length; i++) {
          line[i].graphics.clear();
        };
        matcher.reset();
        stage.update();
      }

      function showResult () {
        if(matcher.checkValidity()) alert("Correct :)");
        else alert("Wrong");
      }

      
      
    </script>

    <style>
        canvas{
            border:1px solid #000000;
        }
    </style>
</head>
<body onload="init();">
<div id="container">
    <div id="banner">
        <h1>English Learning</h1>
    </div>

    <div id="navcontainer">
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li ><a href="#">Home</a></li>
                    <li ><a href="#about">Vocabulary</a></li>
                    <li ><a href="#contact">Grammar</a></li>
                    <li class="active"><a href="JumbledSentence.jsp">Practice</a></li>

                </ul>
            </div>
        </nav>
    </div>

    <div id="sidebar">



        <div class="list-group">

            <a href="#" class="list-group-item">Jumbled Sentence</a>

        </div>
    </div>

    <div id="content">

       <canvas id="demoCanvas" width="530" height="300"></canvas>
       <br><br>
       <button onclick="showResult()" class="btn btn-danger">View Result</button>
        <button onclick="location.reload();"  class="btn btn-danger">Try Another</button>
       <button onclick="reset()" class="btn btn-danger">Reset</button>
    </div>
</div>

</body>
</html>
