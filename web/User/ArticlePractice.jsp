<%-- 
    Document   : ArticlePractice
    Created on : May 16, 2017, 9:29:52 AM
    Author     : user
--%>

<%@page import="Model.Practice"%>
<%@page import="javafx.util.Pair"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Jumbled Sentence - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

    <script src="../Resources/js/canvasFramework/easeljs-0.8.2.min.js"></script>
        
    </head>
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
                    <li ><a href="#">Home</a></li>
                    <li ><a href="#about">Vocabulary</a></li>
                    <li ><a href="#contact">Grammar</a></li>
                    <li class="active"><a href="ArticlePractise.jsp">Practice</a></li>

                </ul>
            </div>
        </nav>
    </div>

    <div id="sidebar">
        <div class="list-group">

            <a href="#" class="list-group-item">Article Practice</a>

        </div>
    </div>
    <div id="content">
        <%
            String problem, options;
            Pair<String, String[]> practices[] = Practice.getFourArticlePractises();
            for(int i = 0; i < 1; i++){
                Pair<String, String[]> temp = practices[i];
                problem = temp.getKey();
        %>
            <option value=<%=i%>><%=problem%></option>
            
        <%
                for(int j = 0; j < 3; j++){
                    options = temp.getValue()[j];
        %>
            <input type="checkbox" value=<%=options%> name="Select">
            <%=options%>
            <br>        
        <%
                }
            }
        %>
        <button onclick="location.reload()"  class="btn btn-danger">Try Another</button>
        <button class="btn btn-danger">Show Result</button>
    </div>
</html>
