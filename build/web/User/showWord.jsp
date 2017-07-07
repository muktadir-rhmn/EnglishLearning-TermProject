<%-- 
    Document   : ArticlePractice
    Created on : May 16, 2017, 9:29:52 AM
    Author     : user
--%>

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
        <title>Lesson - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

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
    <body>
        <body>
        <body onload="init();">
<div id="container">
    <div id="banner">
        <h1>English Learning</h1>
    </div>

    <div id="navcontainer">
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li ><a href="home.jsp">Home</a></li>
                    <li class="active"><a href="showWord.jsp">Vocabulary</a></li>
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
    <div id="sidebar">
        <div class="list-group">
            <%
                Word obj1 = new Word();
                Set<Pair<String,Integer> >list = obj1.getWordLevel();
                Iterator<Pair<String,Integer> > itr = list.iterator();
                while(itr.hasNext()){
                    Pair<String, Integer> tmp = itr.next();
                    String temp = tmp.getKey();
                    Integer no = tmp.getValue();
            %>
            <a href="showWordGroup.jsp?levelID=<%=no%>" class="list-group-item"><%=temp%></a>
            <%
            }
            %>

        </div>
    </div>
            <div id="content">
            <%
                    String word = request.getParameter("word");
                    String partsofSpeech = request.getParameter("partsofSpeech");
                    String meaning = request.getParameter("meaning");
                    int id = Integer.valueOf(request.getParameter("entity_id"));
            %>
            <h1><b><%=word%></b></h1>
            <br>
            <br>
            <b>Meaning:</b><br><br><i><%=meaning%></i>
            <br>
            <br>
            <b>Parts of Speech:</b><br><br><i><%=partsofSpeech%></i><br><br>
            <%
                Word ob = new Word();
                ArrayList<String> example = ob.getExamples(id);
                for(String tmp:example){
            %>
            <b>Example:</b><br><br><i><%=tmp%></i><br>
            <%
            }
            %>
            </div>
    </body>
</html>
