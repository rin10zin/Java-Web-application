<%--
  Created by IntelliJ IDEA.
  User: userpc
  Date: 5/11/2016
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%
      String message = (String)request.getAttribute("message");

      if(message!=null){
  %>

  <h1><%=message%></h1>

      <%}%>

  <form action="login" method="post">
    Name: <input type="text" name="username">
    Password: <input type="password" name="password">
    <input type="submit" value="Login">
  </form>
  </body>
</html>
