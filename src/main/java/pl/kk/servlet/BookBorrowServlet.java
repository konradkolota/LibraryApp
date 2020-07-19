package pl.kk.servlet;

import pl.kk.BookFactory;
import pl.kk.model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BookBorrowServlet extends HttpServlet {

    BookFactory books = new BookFactory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int index = 0;
        String borrowedIsbn = req.getParameter("isbn");

        if (req.getSession().getAttribute("books")==null){
            req.getSession().setAttribute("books", new ArrayList<Book>());
        }

        for (Book book:books.getBooks()) {
            if(book.getIsbn().equals(borrowedIsbn)){
                index = books.getBooks().indexOf(book);
            }
        }
        ArrayList<Book> borrowedBooks = (ArrayList<Book>) req.getSession().getAttribute("books");
        books.getBooks().get(index).setBorrowed(true);
        borrowedBooks.add(books.getBooks().get(index));
        req.getSession().setAttribute("borrowedBooks", borrowedBooks);
        resp.sendRedirect("showBooks.jsp");
    }
}
