<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.kk.BookFactory" %>
<html>
<head>
    <title>Biblioteka</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">


</head>
<body>
<nav class="nav flex-column">
    <a href="showBooks.jsp" class="nav-item nav-link">Pokaż wszystkie książki</a>
    <a href="bookAddForm.jsp" class="nav-item nav-link">Dodaj książkę</a>
    <a href="bookSearch.jsp" class="nav-item nav-link">Wyszukaj książkę</a>
</nav>

<c:set var="books" scope="application" value="${BookFactory.books}"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
