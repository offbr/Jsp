<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** 관리자 **</title>
<link href="../css/default.css" rel="stylesheet" title="Default Style">
<link rel="stylesheet" type="text/css" href="../css/board.css">
<script type="text/javascript">
function check(){
	if(frm.id.value == "" || frm.pwd.value == ""){
		alert("자료를 입력하시오");
		return;
	}
	frm.submit();
}
</script>
</head>
<body>
<form action="adminlogin.jsp" name="frm" method="post">
<b>관리자</b>
<table style="width: 100%">
	<tr>
		<td>
		<%
		String sessionVal = (String)session.getAttribute("adminOk");
		if(sessionVal != null){
		%>
			로그인 중입니다.<br><br>
			[<a href="adminlogout.jsp">로그아웃</a>]
			[<a href="javascript:window.close()">창닫기</a>]
		<%}else{%>
			<table style="width: 100%">
				<tr>
					<td>id : <input type="text" name="id" size="10"></td>
				</tr>
				<tr>
					<td>pwd : <input type="text" name="pwd" size="10"></td>
				</tr>
				<tr>
					<td>
						[<a href="#" onclick="check()">로그인</a>]
						[<a href="javascript:window.close()">창닫기</a>]
					</td>	
				</tr>
			</table>
		<%}%>
		</td>
	</tr>
</table>
</form>
</body>
</html>