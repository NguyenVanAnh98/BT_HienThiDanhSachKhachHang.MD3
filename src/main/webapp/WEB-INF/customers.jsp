<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 30/01/2024
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <tr>
        <h1>DANH SÁCH KHÁCH HÀNG</h1>
        <th>ID</th>
        <th>Name</th>
        <th>Địa chỉ</th>
        <th>Ngày Sinh</th>
        <th>Hình ảnh</th>
    </tr>
    <c:forEach items="${ customers }" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.address}</td>
            <td>${c.createdAt}</td>
            <td><img width="50px" src="${c.img}" alt=""> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>