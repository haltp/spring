<%@ page import="java.util.ArrayList"%>
<%@ page import="com.company.yedam.emp.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%-- <%@ taglib prefix="my" tagdir="/WEB-INF/tags"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/list.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function() {
		$(".btnSelect").on("click", function() {
			var empid = $(this).closest(".row").find("span").eq(1).html();
			var firstName = $(this).closest(".row").find("span").eq(3).html();;
			opener.document.frm.manager_id.value = empid;
			opener.document.frm.mname.value = firstName;
			$(opener.document).find('[name=manager_id]').val(empid);
			window.close();
		});
	});
</script>
</head>
<body>
	<c:forEach items="${list}" var="emp">
		<div class="row">
			<span>사원번호 : </span>
			<span>${emp.employee_id}</span>
			<span>이름 : </span>
			<span>${emp.first_name}</span> 
			<span><button type="button" class="btnSelect">선택</button></span> <br>
		</div>
	</c:forEach>

	<%-- 	<my:login />
	<my:paging />
	이름:
	<%=((ArrayList<EmpVO>) request.getAttribute("list")).get(0).getFirst_name()%>
	<hr>
	이름 : ${requestScope.list[0].getLast_name() }
	<hr>
	컨텍스트(어플이름) : ${pageContext.request.contextPath }
	<!-- 중요 -->
	<%=request.getHeader("User-Agent")%>
	<br>
	<my:login />
	<my:paging /> --%>
</body>
</html>