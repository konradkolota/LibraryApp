<%@ page import="pl.kk.model.Book, java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wszystkie dostępne tytuły</title>
</head>
<body>
<div>
    <h1>Dostępne Tytuły</h1>
<table border="1">
    <tr>
        <td>Tytuł książki</td>
        <td>Autor</td>
        <td>ISBN</td>
    </tr>
    <c:forEach var="book" items="${applicationScope.books}">
        <c:if test="${book.borrowed eq false}">

        <tr>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><c:out value="${book.isbn}"/></td>
            <td>
                <form action="${pageContext.request.contextPath}/borrow" method="get">
                    <input type="hidden" name="isbn" value="${book.isbn}">
                    <input type="submit" value="Wypożycz książkę">
                </form>
            </td>
            <td>
            <form action="${pageContext.request.contextPath}/delete" method="post">
                <input type="hidden" name="isbn" value="${book.isbn}">
                <input type="submit" value="Usuń pozyjcję">
            </form>
            </td>
        </tr>
        </c:if>
    </c:forEach>
</table>
</div>

<c:if test="${borrowedBooks != null}">
    <div>
    <h1>Wypożyczone książki</h1>
    <table border="1">
        <tr>
            <td>Tytuł książki</td>
            <td>Autor</td>
            <td>ISBN</td>
        </tr>
        <c:forEach var="borrowedBook" items="${sessionScope.borrowedBooks}">
            <tr>
                <td><c:out value="${borrowedBook.title}"/></td>
                <td><c:out value="${borrowedBook.author}"/></td>
                <td><c:out value="${borrowedBook.isbn}"/></td>
                <td>
                    <form action="${pageContext.request.contextPath}/return" method="get">
                        <input type="hidden" name="isbn" value="${borrowedBook.isbn}">
                        <input type="submit" value="Zwróć książkę">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    </div>
</c:if>
<a href="index.jsp">Home</a>

</body>
</html>
