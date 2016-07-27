<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Second Page</title>
</head>
<body>
Введенное имя: ${userJSP.login};
<br/>
Введенный пароль: ${userJSP.password};
<br/>
Дали ли добро ? : ${userJSP.truOrFalse};
</body>
</html>
