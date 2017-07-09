<%-- 
    Document   : ArticlePractice
    Created on : May 16, 2017, 9:29:52 AM
    Author     : user
--%>

<%@page import="java.util.Random"%>
<%@page import="Model.Word"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Lesson"%>
<%@page import="Model.Practice"%>
<%@page import="javafx.util.Pair"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vocabulary - English Learning</title>
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
</head>

   
    <div id="container">
    <div id="banner">
        <h1>English Learning</h1>
    </div>
    <div id="navcontainer">
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li ><a href="home.jsp">Home</a></li>
                    <li class="active"><a href="word.jsp">Vocabulary</a></li>
                    <li ><a href="practice.jsp">Practice</a></li>
                    <li><a href="Lesson.jsp">Grammar</a></li>
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
        <jsp:param name="wordgap" value="background: rgb(234,242,200);" />
    </jsp:include>
        
    <div id="content">    
        <%
            Word object = new Word();
            ArrayList<Word> res = object.getAllWord();
        %>
        <%
            Random rand = new Random();
            int length = res.size();
            int idx = Math.abs(rand.nextInt() % length);
            String word = res.get(idx).getWord();
            int wordLength = word.length();
            while(wordLength<=2){
                idx = Math.abs(rand.nextInt() % length);
                word = res.get(idx).getWord();
                wordLength = word.length();
            }
            int blank_no = Math.abs(rand.nextInt() % 3);
            while(blank_no==0){
                blank_no = Math.abs(rand.nextInt() % 3);
            }
            boolean[] visited = new boolean[wordLength];
            for(int i = 0; i < wordLength; i++){
                visited[i] = false;
            }
            while(blank_no!=0){
                int index = Math.abs(rand.nextInt() % wordLength);
                if(visited[index]==false){
                    visited[index] = true;
                    blank_no--;
                }
            }
            
        %>
        <%
            for(int i = 0; i < wordLength; i++){
                if(visited[i]==false){
        %>
        <b style="color:rgb(4,139,132)" ><font size="6"><%=word.charAt(i)%></font></b>
        <%}
        if(visited[i]==true){
        %>
            <input name="<%=i%>" type="text" style="width:40px;"/>
        <%
        }
        %>
        <%}%>
    
        <br/>
        <button onclick="location.reload()"  class="btn btn-danger">Try Another</button>
        <button name="showresult" onclick="location.reload()"  class="btn btn-danger" >Show Result</button>
    </div>    
    </div>
</html>
