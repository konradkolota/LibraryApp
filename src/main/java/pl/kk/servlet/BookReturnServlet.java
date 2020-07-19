package pl.kk.servlet;

import pl.kk.BookFactory;
import pl.kk.model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class BookReturnServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Book> borrowedBooks = (ArrayList<Book>) req.getSession().getAttribute("borrowedBooks");
        BookFactory books = new BookFactory();
        String borrowedIsb = req.getParameter("isbn");
        int indexOfReturnedBook = 0;

        borrowedBooks.removeIf(book -> book.getIsbn().equals(borrowedIsb));
        for (Book book:books.getBooks()) {
            if (book.getIsbn().equals(borrowedIsb)){
                indexOfReturnedBook = books.getBooks().indexOf(book);
            }
        }
        books.getBooks().get(indexOfReturnedBook).setBorrowed(false);
        resp.sendRedirect("showBooks.jsp");
    }
}
