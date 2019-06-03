<%@ page import="domains.user.User" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <title>My app</title>
    <link href="http://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet" type="text/css" />
    <link href="http://fonts.googleapis.com/css?family=Kreon" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="../style.css" />
</head>
<body>

<%
    User user = (User)session.getAttribute("user");
%>

<div id="wrapper">
    <div id="header">
        <h3>Welcome to: <%=user.getName()%>| <a href="logout">Logout</a></h3>
        <div id="logo">

        </div>
        <div id="menu">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Photos</a></li>
                <li><a href="#">Portfolio</a></li>
                <li class="last"><a href="#">Contact</a></li>
            </ul>
            <br class="clearfix" />
        </div>
    </div>
    <div id="page">
        <div id="sidebar">
            <div class="box">
                <ul class="list">
                    <li class="first"><a href="userlist">Manage User</a></li>
                    <li><a href="#">Welcome</a></li>
                    <li class="last"><a href="#">Welcome</a></li>
                    <li class="last"><a href="#">Welcome</a></li>

                </ul>
            </div>

        </div>

        <div id="content">

            <%
                List<User> userList = (List<User>) request.getAttribute("userList");
            %>

            <a href="add">New User</a>
            <table  border="1px" width="50%">
                <tr bgcolor="aqua">
                    <td>User Name</td>
                    <td>Password</td>
                    <td>Role</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>

                <%
                    for (User user1:userList) {


                %>
                <tr>
                    <td><%=user1.getName()%></td>
                    <td><%=user1.getPassword()%></td>
                    <td><%=user1.getRole()%></td>
                    <td><a href="edit?id=<%=user1.getId()%>&page=edit">Edit</a></td>
                    <td><a href="delete?id=<%=user1.getId()%>&page=delete">Delete</a></td>
                </tr>

                <%}%>

            </table>


            <br class="clearfix" />
        </div>

        <br class="clearfix" />
    </div>

</div>
<div id="footer">
    &copy; My App | Deerwalk
</div>
</body>
</html>
