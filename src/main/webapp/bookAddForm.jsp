<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.kk.model.Book,java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<header class="jumbotron">
    <h1>Dodaj książkę</h1>
</header>
<form action="${pageContext.request.contextPath}/add" method="get">
    <label for="bookTitle">Tytuł: </label>
    <input type="text" name="title" id="bookTitle" placeholder="Podaj tytuł książki.">
    <label for="bookAuthor">Autor: </label>
    <input type="text" name="author" id="bookAuthor" placeholder="Podaj autora książki.">
    <label for="bookIsbn">ISBN: </label>
    <input type="text" name="isbn" id="bookIsbn" placeholder="Podaj ISBN książki.">
    <input type="submit" value="Dodaj książkę.">
</form>
<a href="index.jsp">Home</a>
</body>
</html>
