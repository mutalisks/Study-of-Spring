<!DOCTYPE>
<html>

<body>

<h2>Spring MVC Demo - Home Page</h2>

<hr>

<a href="hello/showForm">Hello World form</a>

<br><br>

<a href="${pageContext.request.contextPath}/student/showForm">Student form</a>

<br><br>
<a href="${pageContext.request.contextPath}/custom/showForm">Customer form</a>

<br><br>
<img src="${pageContext.request.contextPath}/resources/photo1.jpeg">

</body>

</html>