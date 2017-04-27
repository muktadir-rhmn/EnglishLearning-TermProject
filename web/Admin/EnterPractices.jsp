<%-- 
    Document   : EnterPractices
    Created on : Apr 27, 2017, 7:43:52 PM
    Author     : MUKTADIR
--%>

<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Lesson Practices" />
    <jsp:param name="newLessonSideBar" value="active" />
</jsp:include>
<%-- ******************************************************** --%>

<%
    String lessonId = request.getParameter("lessonId");
%>

<!--Question-->
<div class="form-group">
    <label for="question" class="control-label col-sm-2">Question</label>
    <div class="col-sm-10">
        <input name="question" id="question" type="text" class="form-control" placeholder="Enter a Question...">
    </div>
</div>
<br/>
<br/>
<br/>

<!--option1-->
<div class="form-group">
    <label for="option1" class="control-label col-sm-2">Option 1</label>
    <div class="col-sm-6">
        <input name="option1" id="option1" type="text" class="form-control" placeholder="Enter Option 1...">
    </div>

</div>
<br/>
<br/>

<!--ooption2-->
<div class="form-group">
    <label for="option2" class="control-label col-sm-2">Option 1</label>
    <div class="col-sm-6">
        <input name="option2" id="option2" type="text" class="form-control" placeholder="Enter Option 1...">
    </div>
</div>
<br/>
<br/>

<!--option3-->
<div class="form-group">
    <label for="option3" class="control-label col-sm-2">Option 3</label>
    <div class="col-sm-6">
        <input name="option3" id="option3" type="text" class="form-control" placeholder="Enter Option 3...">
    </div>
</div>
<br/>
<br/>

<div class="form-group">
    <label for="option3" class="control-label col-sm-2"></label>
    <div class="col-sm-10">
        <input type="button" value="Add" onclick="addPractice()" class="btn btn-primary"/>
    </div>
</div>
<br/>
<hr/>

<!-- added Question list-->
<ul id="questionList" style="font-size: large;">
    <li>
        What is your name? <a href="#" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-trash"></span></a>

        <ul>
            <li>Muktadir</li>
            <li>rahman</li>
        </ul>
    </li>
    <br/>
</ul>

<script>

</script>

<%-- ******************************************************** --%>
<jsp:include page="../Resources/footer/admin_footer.jsp"/>