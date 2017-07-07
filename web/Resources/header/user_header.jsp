<!DOCTYPE>
<html>
<head>
    <title>${param.title} - English Learning</title>
    <link href="../Resources/css/user/style.css" rel="stylesheet" />

    <<!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

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
                    <li class="${param.homeActive}"><a href="#">Home</a></li>
                    <li class="${param.vocabularyActive}"><a href="#about">Vocabulary</a></li>
                    <li class="${param.GrammarActive}"><a href="#contact">Grammar</a></li>
                    <li class="${param.GrammarActive}"><a href="JumbledSentence.jsp">Practice</a></li>
                    <li class="${param.GrammarActive}"><a href="JumbledSentence.jsp">Practice</a></li>
                </ul>
            </div>
        </nav>
    </div>
