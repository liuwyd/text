<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2022/11/25
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="LoginServlet" method="post">		<!-- 表单向servlet传登录信息 -->
    <table width="298" border="0" align="center">
        <tr>
            <td align="right">用户名</td>
            <td align="left">
                <input type="text" name="user"/>		<!-- 输入用户名文本框 -->
            </td>
        </tr>
        <tr>
            <td align="right">密码</td>
            <td align="left">
                <input type="password" name="password">		<!-- 输入密码文本框 -->
            </td>
        </tr>
        <td colspan="2" align="center">
            <input type="submit" value="登录">
            <a href="register.jsp">注册</a>
        </td>
        </tr>
    </table>
</form>
</body>
</html>


