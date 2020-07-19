package pl.kk.servlet;

import pl.kk.BookFactory;
import pl.kk.model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BookIsbnSearchServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookFactory books = new BookFactory();
        String isbn = req.getParameter("bookIsbn");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html; charset=UTF-8;");
        resp.setCharacterEncoding("UTF-8");

        writer.print("<table border=\"1\">\n" +
                "    <tr>\n" +
                "        <td>Tytuł książki</td>\n" +
                "        <td>Autor</td>\n" +
                "        <td>ISBN</td>\n" +
                "    </tr>");
        for (Book book : books.getBooks()) {
            if (book.getIsbn().equals(isbn)) {
                writer.print("</tr>" +
                        "    <tr>\n" +
                        "        <td>" + book.getTitle() + "</td>\n" +
                        "        <td>" + book.getAuthor() + "</td>\n" +
                        "        <td>" + book.getIsbn() + "</td>\n" +
                        "    </tr>");
            }
        }
        writer.print("</table>");
        writer.print("<a href=\"index.jsp\">Home</a>");

    }
}
