<%@page import="java.util.ArrayList"%>
<%@page import="Database.DataAccess"%>
<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Lesson" />
    <jsp:param name="newLessonSideBar" value="active" />
    <jsp:param name="sectionVocabulary" value="collapse" />
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

<script>

</script>

<form id="lessonForm" action="NewLesson.do" method="get" class="form-horizontal">
    <!--level selection-->
    <div class="form-group">
        <div class="col-sm-1">
             <label for="level" class="control-label ">Level</label>
        </div>
        <div class="col-sm-9">
            <select name="level" id="level" class="form-control">
                <!--To Arnob: Get levels from database and print like the following-->
                <%
                    DataAccess db = DataAccess.getDataAccess();
                    ArrayList<String> List = db.levelListLesson();
                    for(int i = 0; i < List.size(); i++){
                        String name = List.get(i);
                %>
                        <option value=<%=i%>><%=name%></option>
                <%
                    }
                %>
                
            </select>
            <!-- Trigger the modal with a button -->
        </div>
        <div class="col-sm-2">
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus"></span></button>
        </div>
    </div>
    <!--/level selection-->


    <input type="hidden" id="LessonBody" name="body" value="fjasdlfk"/>
    <!--Title text box-->
    <div class="form-group">
        <label for="title" class="control-label col-sm-1">Title</label>
        <div class="col-sm-11">
            <input name="title" id="title" type="text" class="form-control" placeholder="Title">
        </div>
    </div>
    <!--/Title text box-->


    <br/>
    <!--Text Editor-->
    <div id="editor">
        <label for="edit" >Lesson</label>
        <textarea id="edit"> </textarea>
    </div>
    <!--/Text Editor-->
    <br>
    <input type="button" onclick="sendLesson();" value="Post" class="btn btn-primary btn-lg">
</form>


<!-- Modal for creating new level-->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">New Level</h4>
            </div>
            <div class="modal-body">
                <!--Level from-->
                <form action="NewLevel.do" class="form-horizontal">
                    <fieldset>
                        <input type="hidden" id="levelType" name="levelType" value="1"/>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="levelTitle">Title</label>
                            <div class="col-md-4">
                                <input id="levelTitle" name="levelTitle" type="text" placeholder="title" class="form-control input-md" required="">
                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="levelNo">Level No</label>
                            <div class="col-md-4">
                                <input id="levelNo" name="levelNo" type="text" placeholder="Level No" class="form-control input-md" required="">
                            </div>
                        </div>
                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="btnNewLevel"></label>
                            <div class="col-md-4">
                                <button id="btnNewLevel" class="btn btn-primary">Create</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
                <!--/Level from-->
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>  <!-- /Modal Content-->
    </div>
</div> <!-- /Modal -->

<%-- ******************************************************** --%>
<jsp:include page="../Resources/footer/admin_footer.jsp"/>