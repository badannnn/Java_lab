<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Результат обчислення</title>
</head>
<body>
<h1>Результат обчислення</h1>
<p>Сума ряду Тейлора: ${taylorSum}</p>
<p>Сума доданків з абсолютним значенням більше e: ${sumGreaterE}</p>
<p>Кількість доданків, що перевищують e: ${countGreaterE}</p>
<p>Точне значення функції e^(-x^2): ${exactValue}</p>
<a href="user.jsp">Повернутися назад</a>
</body>
</html>
