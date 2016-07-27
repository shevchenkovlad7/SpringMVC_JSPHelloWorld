<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Index Page</title>
  <link rel="stylesheet" type="text/css" href="/resources/css/index.css" media="all">
</head>

<body>
<spring:form class="box login" method="post"  modelAttribute="userJSP" action="check-user">

<fieldset class="boxBody">
  <spring:label path="login">Login</spring:label>
  <spring:input path="login"/>

  <spring:label path="password">Password</spring:label>
  <spring:input path="password"/>

  </fieldset>

  <footer>
  <spring:checkbox path="truOrFalse"/>
  <spring:label path="truOrFalse">You agree with the registration rules?</spring:label>
    <input class="btnLogin" type="submit"  value="Sign up" tabindex="4">
  </footer>
</spring:form>

</body>

</html>
