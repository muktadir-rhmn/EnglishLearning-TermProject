<%-- 
    Document   : NewWord
    Created on : Apr 26, 2017, 9:16:55 AM
    Author     : MUKTADIR
--%>

<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Word" />
    <jsp:param name="newWordSideBar" value="active" />
</jsp:include>
<%-- ******************************************************** --%>

<form action="Admin/NewWord.do" method="get" class="form-horizontal">

    <!--word group box-->
    <div class="form-group">
        <label for="group" class="control-label col-sm-2">Group</label>
        <div class="col-sm-8">
            <select name="group" id="group" class="form-control">
                <!--Arnob: fetch word groups and word levels-->
                <option value="1">Basic</option>
                <option value="1">------Fruit Names</option>
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

    <!--example text box-->
    <div class="form-group">
        <label for="examples" class="control-label col-sm-2">Examples</label>
        <div class="col-sm-10">
            <textarea name="meaning" id="examples" class="form-control" placeholder="Write an example per line"></textarea>
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
                <form action="Admin/NewWordGroup.do" class="form-horizontal">
                    <fieldset>

                        <!--Word levels-->
                        <div class="form-group">
                            <label for="wordLevel" class="control-label col-sm-4">Level</label>
                            <div class="col-sm-6">
                                <select name="wordLevel" id="wordLevel" class="form-control">
                                    <!--Arnob: fetche the word levels from database-->
                                    <option value="1">Basic</option>
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
                <h4 class="modal-title">New Group</h4>
            </div>
            <div class="modal-body">

                <!--Level from-->
                <form action="Admin/NewWordLevel.do" class="form-horizontal">
                    <fieldset>
                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="wordlevel1">Title</label>
                            <div class="col-md-6">
                                <input id="wordlevel1" name="level" type="text" placeholder="Word Level" class="form-control input-md" required="">
                            </div>
                        </div>
                        <!-- /Text input-->
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