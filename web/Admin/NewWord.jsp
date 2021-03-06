<%-- 
    Document   : NewWord
    Created on : Apr 26, 2017, 9:16:55 AM
    Author     : MUKTADIR
--%>
 <%
if(session.getAttribute("adminLogin") == null || !((String)session.getAttribute("adminLogin")).equals("true")){
        out.print(
            "You must login..."
        );
        return;
    }
%>

<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="Model.WordGroup"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.DataAccess"%>
<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Word" />
    <jsp:param name="newWordSideBar" value="active" />
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
       <form action="NewWord.do" method="get" class="form-horizontal">

            <!--word group box-->
            <div class="form-group">
                <label for="group" class="control-label col-sm-2">Group</label>
                <div class="col-sm-8">
                    <select name="group" id="group" class="form-control">
                        <!--Arnob: fetch word groups and word levels-->
                        <%
                        DataAccess db = DataAccess.getDataAccess();
                        ArrayList<WordGroup> levelList = db.getWordLevels();

                        %>
                        <%
                        for(WordGroup t : levelList){
                            ArrayList<WordGroup> groups = db.getWordGroups(t.get_entity_id());
                            if(groups.isEmpty()) continue;
                        %>
                               <option disabled><%=t.get_entity_level_title()%></option>
                        <%
                            for(WordGroup g: groups){
                        %>
                            <option value = "<%=g.get_word_group_id()%>">-----<%=g.get_word_group_title()%></option> 
                        <%    
                        
                            }                        
                        }
                        %>
                    </select>

                </div>
                <div class="col-sm-2">
                    <!-- Trigger the modal with a button -->
                    <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus"></span></button>
                </div>
            </div>
            <!--/word group box-->

            <!--word text box-->
            <div class="form-group">
                <label for="word" class="control-label col-sm-2">Word</label>
                <div class="col-sm-10">
                    <input name="word" id="word" type="text" class="form-control" placeholder="Word">
                </div>
            </div>
            <br/>
            <!--/word text box-->

            <!--meaning text box-->
            <div class="form-group">
                <label for="meaning" class="control-label col-sm-2">Meaning</label>
                <div class="col-sm-10">
                    <textarea name="meaning" id="meaning"  class="form-control" placeholder="Meaning of the word"></textarea>
                </div>
            </div>
            <br/>
            <!--/meaning text box-->
            
            <!--parts of speech text box-->
            <div class="form-group">
                <label for="partsofspeech" class="control-label col-sm-2">Parts of Speech</label>
                <div class="col-sm-10">
                    <textarea name="partsofspeech" id="partsofspeech"  class="form-control" placeholder="Parts of Speech"></textarea>
                </div>
            </div>
            <br/>
            <!--/parts of speech text box-->
            
            <!--example text box-->
            <div class="form-group">
                <label for="examples" class="control-label col-sm-2">Examples</label>
                <div class="col-sm-10">
                    <textarea name="example" id="examples" class="form-control" placeholder="Write an example per line"></textarea>
                </div>
            </div>
            <br/>
            <!--/examples text box-->



    <br>
    <div class="form-group">
        <div class="control-label col-sm-2"></div>
        <div class="col-sm-10">
            <input type="submit" value="Add Word" class="btn btn-primary"/>
        </div>
    </div>
    <br/>
</form>

<!-- Modal for creating new level-->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">New Group</h4>
            </div>
            <div class="modal-body">

                <!--Level from-->
                <form action="NewWordGroup.do" class="form-horizontal">
                    <fieldset>

                        <!--Word levels-->
                        <div class="form-group">
                            <label for="wordLevel" class="control-label col-sm-4">Level</label>
                            <div class="col-sm-6">
                                <select name="wordLevel" id="wordLevel" class="form-control">
                                    <!--Arnob: fetche the word levels from database-->
                                    <%
                                    DataAccess db1 = DataAccess.getDataAccess();
                                    String tempName1 = "";
                                    int tempID1;
                                    
                                    for(WordGroup t: levelList){
                                    %>
                                            <option value="<%=t.get_entity_id()%>"><%=t.get_entity_level_title()%></option> 
                                    <%
                                        }
                                    %>
                                </select>

                            </div>
                            <div class="col-sm-2">
                                <!-- Trigger the modal with a button -->
                                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#newWordLevel"><span class="glyphicon glyphicon-plus"></span></button>
                            </div>
                        </div>
                        <!--/word levels box-->

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="groupTitle">Title</label>
                            <div class="col-md-6">
                                <input id="groupTitle" name="groupTitle" type="text" placeholder="title" class="form-control input-md" required="">
                            </div>
                        </div>
                        <!-- /Text input-->
                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="btnNewGroup"></label>
                            <div class="col-md-4">
                                <input type="submit" value="Create Group" id="btnNewGroup" class="btn btn-primary"/>
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


<!-- Modal for creating new level-->
<div class="modal fade" id="newWordLevel" role="dialog">
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
                        <input type="hidden" name="levelType" value="0"/>
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
                            <label class="col-md-4 control-label" for=></label>
                            <div class="col-md-4">
                                <input type="submit" value="Create Level" class="btn btn-primary"/>
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