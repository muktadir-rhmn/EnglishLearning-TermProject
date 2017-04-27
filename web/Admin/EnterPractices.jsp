<%-- 
    Document   : EnterPractices
    Created on : Apr 27, 2017, 7:43:52 PM
    Author     : MUKTADIR
--%>

<jsp:include page="../Resources/header/admin_header.jsp">
    <jsp:param name="title" value="New Lesson" />
    <jsp:param name="newLessonSideBar" value="active" />
</jsp:include>
<%-- ******************************************************** --%>

<%
    String lessonId = request.getParameter("lessonId");
%>



<%-- ******************************************************** --%>
<jsp:include page="../Resources/footer/admin_footer.jsp"/>