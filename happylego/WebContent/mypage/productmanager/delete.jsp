<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="processDao" class="happy.mybatis.ProcessDao"/>
<%
String pno = request.getParameter("pno");
boolean b = processDao.deleteDataProduct(pno);
if(b){
%>
<script>
alert("삭제되었습니다");
opener.location.reload();
window.close();
</script>
<%	
}else{
%>
<script>
alert("삭제를 실패하였습니다");
opener.location.reload();
window.close();
</script>
<%	
}
%>