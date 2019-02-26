<%--
  Created by IntelliJ IDEA.
  User: fangjie
  Date: 2019/2/25
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>老师</th>
        <th>学生</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${classes}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.teacher.name}</td>
            <td>
                <c:forEach items="${c.students}" var="s">
                    ${s.name} + "|"
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
