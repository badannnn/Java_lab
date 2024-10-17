<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Обчислення</title>
</head>
<body>
<h1>Виберіть функцію для обчислення</h1>

<form action="taylor" method="post">
    <h2>Обчислення ряду Тейлора</h2>
    <label for="x">x:</label>
    <input type="number" step="any" name="x" required>
    <label for="n">n:</label>
    <input type="number" name="n" required>
    <label for="e">e:</label>
    <input type="number" name="e" step="0.0000000000001" required>
    <input type="submit" value="Обчислити">
</form>

<form action="tabulate" method="post">
    <h2>Табулювання функції y = ∛x</h2>
    <label for="a">a:</label>
    <input type="number" step="any" name="a" required>
    <label for="b">b:</label>
    <input type="number" step="any" name="b" required>
    <label for="h">h:</label>
    <input type="number" step="any" name="h" required>
    <input type="submit" value="Обчислити">
</form>
</body>
</html>
