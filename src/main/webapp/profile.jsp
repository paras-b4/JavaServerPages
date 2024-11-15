<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String url ="jdbc:postgresql://localhost:5432/postgres" ;
 String user= "postgres";
 String password= "paras@yadav";
 Class.forName("org.postgresql.Driver");
 String sql=" Select * from students ";
 Connection con = DriverManager.getConnection(url, user, password);
 Statement str= con.createStatement();
 ResultSet rs = str.executeQuery(sql);
 rs.next();

 System.out.println("run succesfully");
%>
Roll no : <%=rs.getString(1) %><br>
Name : <%= rs.getString(2) %><br>
phone no :  <%=rs.getString(3) %><br>

</body>
</html>