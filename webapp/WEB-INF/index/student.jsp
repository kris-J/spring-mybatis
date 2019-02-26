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
    <script type="text/javascript">
        function getStudentById(stuId) {
            $.ajax({
                type: "post",
                url: '${pageContext.request.contextPath}/index/student/getById',
                data: {
                    studentId: stuId,
                },
                success: function (data) {
                    console.log(data)
                    $("#stuInfo").text(data.id+"--"+data.name)
                }
            })
        }
    </script>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>
                <input type="button" value="获取信息" onclick="getStudentById('${s.id}')"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<textarea id="stuInfo"></textarea>

</body>
</html>
