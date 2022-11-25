<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2022/11/25
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>

<body>
<%
    String name = (String)request.getAttribute("success") ;		//要转类型
%>
<p>登陆成功，欢迎你,<%=name %>
    <br>
    <a href="index.jsp">首页</a>		<!-- 返回登录页面 -->
</body>
</html>
