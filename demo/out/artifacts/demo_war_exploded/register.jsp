<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2022/11/25
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>

<body>
<form action="LoginServlet" method="post">			<!-- 表单向servlet传注册信息 -->
    <table width="298" border="0" align="center">
        <tr>
            <td align="right">用户名</td>
            <td align="left">
                <input type="text" name="user">
            </td>
        </tr>
        <tr>
            <td align="right">密码</td>
            <td align="left">
                <input type="password" name="password">
            </td>
        </tr>
        </tr>
        <td colspan="2" align="center">
            <input type="submit" value="注册">
            <a href="login.jsp">取消</a>
        </td>
        </tr>
    </table>
</form>
</body>
</html>
