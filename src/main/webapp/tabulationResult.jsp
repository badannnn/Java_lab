<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Результати табулювання</title>
</head>
<body>
<h1>Результати табулювання функції y = ∛x</h1>
<table border="1">
    <tr>
        <th>x</th>
        <th>y</th>
    </tr>
    <%
        // Получаем значения из запроса
        List<Double> xValues = (List<Double>) request.getAttribute("xValues");
        List<Double> yValues = (List<Double>) request.getAttribute("yValues");
        for (int i = 0; i < xValues.size(); i++) {
    %>
    <tr>
        <td><%= xValues.get(i) %></td>
        <td><%= yValues.get(i) %></td>
    </tr>
    <%
        }
    %>
</table>
<a href="user.jsp">Повернутися назад</a>
</body>
</html>
