package pl.kk.servlet;

import pl.kk.BookFactory;
import pl.kk.model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BookAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String isbn = req.getParameter("isbn");

        Book newBook = new Book(title, author, isbn);
        BookFactory books = new BookFactory();
        books.getBooks().add(newBook);

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.append("Dodano: " + title + " " + author + " " +isbn + "</br>");
        writer.append("<a href=\"index.jsp\">Home</a>");
    }
}
