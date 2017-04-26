<%-- 
    Document   : NewWord
    Created on : Apr 26, 2017, 9:16:55 AM
    Author     : MUKTADIR
--%>

<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Lesson" />
    <jsp:param name="newLessonSideBar" value="active" />
</jsp:include>
<%-- ******************************************************** --%>


<div class="container-fluid">

    <!-- Page Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">
                New Lesson
            </h1>

            <ol class="breadcrumb">
                <li>
                    <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                </li>
                <li class="active">
                    <i class="fa fa-table"></i> New Lesson
                </li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <div class="row">
        <div class="col-lg-6">
            <!-- body of the page-->


                <!--word text box-->
                <div class="form-group">
                    <label for="word" class="control-label col-sm-1">Word</label>
                    <div class="col-sm-11">
                        <input name="word" id="word" type="text" class="form-control" placeholder="Title">
                    </div>
                </div>
                <!--/word text box-->

                <br>
                <input type="submit" value="Post" class="btn btn-primary">
            </form>
        </div>
    </div>




</div>
<!-- /.container-fluid -->


<%-- ******************************************************** --%>
<jsp:include page="../Resources/footer/admin_footer.jsp"/>