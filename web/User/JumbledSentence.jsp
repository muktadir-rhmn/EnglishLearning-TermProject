<%@ page import="Practice.JumbledSentence" %>
<%@ page import="Model.MdlJumbledSentence" %>
<!DOCTYPE>
<html>
<head>
    <title>Jumbled Sentence - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

    <script src="../Resources/js/canvasFramework/easeljs-0.8.2.min.js"></script>
    <script>
        /********************************Dragging Circle*****************************/
        /*Reference: http://www.createjs.com/tutorials/Mouse%20Interaction/ */
        //var text = [ "world", "hello"]
        <%
        JumbledSentence js = MdlJumbledSentence.getRandomSentence();
        ;
        %>
        var text = [ <%=js.sentence%>] //the words to be showed in the canvas
        var correctOrder = [ <%=js.correctOrderStr%>];//the currect order of the words for being a valid sentence
        var currentOrder = [<%=js.correctOrderStr%>]; //x co-ordinate of the words currently showing in the canvas

        var nextWordPosition = 5;
        var tmp;

        /**
         This function need to be called when the webpage loads. This is initialize the canvas.
         */
        var stage;
        function init() {
            stage = new createjs.Stage("demoCanvas");

            // this lets our drag continue to track the mouse even when it leaves the canvas:
            // play with commenting this out to see the difference.
            stage.mouseMoveOutside = true;
            drawText();
        }

        function drawText() {
            for (var i = 0; i < text.length ; i++) {

                //created the text
                var label = new createjs.Text(text[i], "bold 20px Arial", "#0000");
                label.x = 0;
                label.y = 0;

                //created a rectangle
                var rect = new createjs.Shape();
                rect.x = label.x
                rect.y = label.y
                rect.graphics.clear().beginFill("rgb(82, 142, 254)").drawRect(-5, -5, label.getMeasuredWidth() + 10, 36);


                //grouped the label and the circle into container. All the elements's co-ordinate
                //is with respect to the container, not absolute position.
                var dragger = new createjs.Container();
                dragger.x = nextWordPosition
                dragger.y = 10;
                dragger.id = i
                dragger.addChild( rect, label);

                stage.addChild(dragger);

                dragger.on("pressmove", function(evt){
                    // currentTarget will be the container that the event listener was added to:
                    currentOrder[evt.currentTarget.id] = evt.currentTarget.x = evt.stageX;
                    evt.currentTarget.y = evt.stageY;
                    // make sure to redraw the stage to show the change:
                    stage.update();
                });

                stage.update();

                //update nextWordPosition
                currentOrder[i] = nextWordPosition;
                nextWordPosition += label.getMeasuredWidth() + 30;

            };
        }

        function showResult() {
            for (var i = correctOrder.length - 1; i > 0; i--) {
                if(!(currentOrder[correctOrder[i]] > currentOrder[correctOrder[i-1]] )){
                    alert("Wrong answer...");
                    return;
                }
            };
            alert("Correct :) ...");
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
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>

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

        <canvas id="demoCanvas" width="500" height="200" ></canvas>
        <br>
        <button onclick="location.reload();"  class="btn btn-danger">Try Another</button>
        <button onclick="showResult();" class="btn btn-danger">Show Result</button>
    </div>


</body>
</html>
