<%@page import="pack.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="md" class="pack.MemberDao"/>
<%
request.setCharacterEncoding("utf-8");
String no = request.getParameter("no");
String name = request.getParameter("name");

boolean check = md.loginCheck(no, name);

if(check){
	session.setAttribute("name", name);	
	response.sendRedirect("logsuccess.jsp");
}else{
	response.sendRedirect("logerr.jsp");
}
%>
</body>
</html>








