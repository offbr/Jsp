<%@page import="shop.member.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="memberMgr" class="shop.member.MemberMgr"/>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");

MemberBean bean = memberMgr.getMember(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자용 회원수정</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../js/script.js"></script>
<script type="text/javascript">
window.onload = function(){
	document.getElementById("btnUpdateAdmin").onclick = memberUpdateAdmin;
	document.getElementById("btnUpdateCancelAdmin").onclick = memberUpdateCancelAdmin;
	document.getElementById("btnDeleteAdmin").onclick = memberDelete;
}
</script>
</head>
<body>
<table class="table" style="width: 100%">
<tr>
	<td align="center" valign="middle" style="background-color: #black"> <!-- #FFFFCC -->
		<form name="updateFormAdmin" method="post" action="memberupdateproc2.jsp">
			<input type="hidden" name="id" value="<%=bean.getId() %>">
			<table border="1" style="width: 100%">
				<tr style="background-color: green;">
					<td colspan="2" style="color: white;"><b><%=bean.getId() %> </b>회원정보 수정(관리자용)</td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="passwd" size="15" value="<%=bean.getPasswd() %>"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" size="15" value="<%=bean.getName() %>"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email" size="27" value="<%=bean.getEmail() %>"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone" size="20" value="<%=bean.getPhone() %>"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td>
						<input type="text" name="zipcode" size="7" value="<%=bean.getZipcode() %>"> 
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" size="60" value="<%=bean.getAddress() %>"></td>
				</tr>
				<tr>
					<td>직업</td>
					<td>
						<select name=job>
							<option value="<%=bean.getJob() %>"><%=bean.getJob() %></option>
							<option value="회사원">회사원</option>
							<option value="학생">학생</option>
							<option value="자영업">자영업</option>
							<option value="기타">기타</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="수정완료" id="btnUpdateAdmin">
						<input type="button" value="수정취소" id="btnUpdateCancelAdmin">
						<input type="button" value="회원강제탈퇴" id="btnDeleteAdmin">  
					</td>
				</tr>
			</table>
		</form>
	</td>
</tr>
</table>
</body>
</html>
















