<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${param.title} - Admin</title>

    <!-- Bootstrap Core CSS -->
    <link href="../Resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../Resources/css/admin/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../Resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/froala_editor.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/froala_style.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/code_view.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/colors.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/emoticons.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/image_manager.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/image.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/line_breaker.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/table.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/char_counter.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/video.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/fullscreen.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/file.css">
  <link rel="stylesheet" href="../Resources/css/admin/froala/plugins/quick_insert.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.3.0/codemirror.min.css">

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Admin</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
               
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        
                        <li>
                            <a href="Logout.do"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">

                    <li class="${param.newLessonSideBar}">
                        <a href="javascript:;" data-toggle="collapse" data-target="#sectionLesson"><span class="glyphicon glyphicon-book"></span> Lessons <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="sectionLesson">
                            <li >
                                <a href="NewLesson.jsp" ><span class="glyphicon glyphicon-pencil"> </span></i> New Lesson</a>
                            </li>
                            <li>
                                <!--<a href=""><span class="glyphicon glyphicon-th-list"> </span></i> View Lessons</a>-->
                            </li>
                        </ul>
                    </li>
                    <li class="${param.newWordSideBar}">
                        <a href="javascript:;" data-toggle="collapse" data-target="#sectionVocabulary"><span class="glyphicon glyphicon-th"></span> Vocabulary <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="sectionVocabulary" >
                            <li>
                                <a href="NewWord.jsp"><span class="glyphicon glyphicon-pencil"> </span></i> New Word</a>
                            </li>
                            <li>
                              <!--  <a href=""><span class="glyphicon glyphicon-th-list"> </span></i> Search Word</a>-->
                            </li>
                        </ul>
                    </li>
                    <li class="${param.newPracticeSideBar}">
                        <a href="javascript:;" data-toggle="collapse" data-target="#sectionLesson"><span class="glyphicon glyphicon-book"></span> Practice <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="sectionPractice">
                            <li >
                                <a href="AddJumbledSentence.jsp" ><span class="glyphicon glyphicon-pencil"> </span></i> New Jumble Sentence</a>
                            </li>
                            <li>
                                <!--<a href=""><span class="glyphicon glyphicon-th-list"> </span></i> View Lessons</a>-->
                            </li>
                        </ul>
                    </li>

<!--                    <li class="">
                        <a href=""><span class="glyphicon glyphicon-pencil"> </span></i> Dummy</a>
                    </li>
                    -->
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">
        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        ${param.title}
                    </h1>

                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                        </li>
                        <li class="active">
                             ${param.title}
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-6">
                    <!-- body of the page-->