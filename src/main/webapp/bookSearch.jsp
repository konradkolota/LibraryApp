<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyszukaj książkę</title>
</head>
<body>
<div>
<form action="${pageContext.request.contextPath}/searchByAuthor" method="post">
    <label for="authorName">Wyszukaj po autorze książki</label>
    <input type="text" placeholder="Wpisz imię autora" id="authorName" name="authorName">
    <input type="submit" value="Wyszukaj">
</form>
    </br>
<form action="${pageContext.request.contextPath}/searchByIsbn" method="post">
    <label for="bookIsbn">Wyszukaj po numerze ISBN</label>
    <input type="text" placeholder="Wpisz ISBN książki" id="bookIsbn" name="bookIsbn">
    <input type="submit" value="Wyszukaj">
</form>
</div>
<a href="index.jsp">Home</a>
</body>
</html>
