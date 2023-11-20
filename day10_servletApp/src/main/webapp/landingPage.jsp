<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="refresh" content="1;url=landingPage.jsp">
<title>Insert title here</title>
</head>
<body>
	<%
	if (session.getAttribute("un") == null)
		response.sendRedirect("login.jsp");
	%>
	<%
	out.println(session.getCreationTime());
	out.println(session.getLastAccessedTime());
	out.println(session.isNew());
	session.setMaxInactiveInterval(1);
	%>

	Welcome:
	<%=session.getAttribute("un")%>


	<a href="logout.jsp">Logout</a>

</body>
</html>