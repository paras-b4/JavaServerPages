<%@ page import="java.util.*,java.util.List " %> <!-- Directive tag has @page,@include,@taglib -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file ="header.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor= pink>
<%!
// Declaration tag
int coef = 2;

%>
<h1> Hello World</h1>
<%
 // scriptlet tag
 int i=10;
out.println(i+5);
%>
<br>
result is : <%= coef %>
</body>
</html>