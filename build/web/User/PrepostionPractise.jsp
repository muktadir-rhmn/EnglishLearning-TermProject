<%-- 
    Document   : ArticlePractice
    Created on : May 16, 2017, 9:29:52 AM
    Author     : user
--%>

<%@page import="Model.Word"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Random"%>
<%@page import="Model.Practice"%>
<%@page import="javafx.util.Pair"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Preposition Practice - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../Resources/js/jqueryUI/jquery-ui.min.css" rel="stylesheet"> 
    <link href="../Resources/js/jqueryUI/jquery-ui.structure.min.css" rel="stylesheet"> 
    <link href="../Resources/js/jqueryUI/jquery-ui.theme.min.css" rel="stylesheet"> 
    
    <script src="../Resources/js/jquery.js" ></script>
    <script src="../Resources/js/canvasFramework/easeljs-0.8.2.min.js"></script>
    <script src="../Resources/js/jqueryUI/jquery-ui.min.js"></script>
      <script>
          <%
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
    %>
  $( function() {
    
    var availableTags = <%=arr%>;
    $( "#searchWord" ).autocomplete({
      source: availableTags
    });
  } );
  </script>
    <script>  
    function showResult() {
        alert(S);
            /*for (var i = correctOrder.length - 1; i > 0; i--) {
                if(!(currentOrder[correctOrder[i]] > currentOrder[correctOrder[i-1]] )){
                    alert("Wrong answer...");
                    return;
                }
            };
            alert("Correct :) ...");*/
        };
    </script>
    </head>
    <body>
<div id="container">
    <div id="banner">
        <h1>English Learning</h1>
    </div>

    <div id="navcontainer">
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li ><a href="home.jsp">Home</a></li>
                    <li ><a href="word.jsp">Vocabulary</a></li>
                    <li ><a href="Lesson.jsp">Grammar</a></li>
                    <li class="active"><a href=practice.jsp">Practice</a></li>
                    <li>
                    <form action="showSearchWord.jsp" method="get" class="navbar-form" role="search">
                    <div class="input-group">
                        <input id="searchWord" type="text" class="form-control" placeholder="Search Word" name="word">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                    </form>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <jsp:include page="sidebarPractice.jsp">
        <jsp:param name="prepositionPractice" value="background: rgb(234,242,200);" />
    </jsp:include>
    <div id="content">
        <%
            
            String problem, options;
            Pair<String, String[]> practices[] = Practice.getFourPrepositionPractises();
            for(int i = 0; i < 4; i++){
                Pair<String, String[]> temp = practices[i]; 
                problem = temp.getKey();
        %>
            <option value=<%=i%>><%=problem%></option>
            
        <%
                Random rand = new Random();
                int idx = Math.abs(rand.nextInt() % 3);
                boolean[] visited = new boolean[3];
                for(int k = 0; k < 3; k++){
                    visited[k] = false;
                }
                int cnt = 0;
                while(true){
                    if(visited[idx]==false){
                        options = temp.getValue()[idx];
                        visited[idx] = true;
                        %>
                        <input type="radio" value=<%=options%> name="Select">
                        <%=options%>
                        <br>
                        <%
                        cnt++;
                    }
                    idx = Math.abs(rand.nextInt() % 3);
                    if(cnt==3)break;
                }
            }
        %>
        <button onclick="location.reload()"  class="btn btn-danger">Try Another</button>
        <button  onclick="showResult()" class="btn btn-danger">Show Result</button>
       
    </div>
</body>
</html>
