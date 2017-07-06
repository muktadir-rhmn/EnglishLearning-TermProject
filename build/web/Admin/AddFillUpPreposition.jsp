<%-- 
    Document   : AddJumbledSentence
    Created on : Apr 30, 2017, 12:29:48 AM
    Author     : MUKTADIR
--%>

<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="Add Preposition Practise" />
    <jsp:param name="newLessonSideBar" value="active" />
</jsp:include>
<%-- ******************************************************** --%>

<%
    String msg = (String) session.getAttribute("msg");
    if(msg != null){
        out.print(
                "<div class='alert alert-success'>" + msg +"</div>"
        );
        session.removeAttribute("msg");
    }
%>
<form action="AddFillUpPreposition.do" method="post" class="form-horizontal">
    <!--sentences text box-->
    <div class="form-group">
        <label for="sentences" class="control-label col-sm-2">Sentences</label>
        <div class="col-sm-10">
            <textarea name="sentences" id="sentences" class="form-control" placeholder="Write some sentences..."></textarea>
        </div>
    </div>
    <br/>
    <!--/sentences text box-->
    <br>
    <div class="form-group">
        <div class="control-label col-sm-2"></div>
        <div class="col-sm-10">
            <input type="submit" value="Make Fill In the Blanks & Store" class="btn btn-primary"/>
        </div>
    </div>
    <br/>
</form>

<%-- ******************************************************** --%>
<jsp:include page="../Resources/footer/admin_footer.jsp"/>