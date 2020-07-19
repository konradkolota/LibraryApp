package pl.kk;

import pl.kk.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    public static List<Book> books = new ArrayList<>(List.of(
            new Book("Pan Lodowego Ogrodu Tom 1", "Jaroslaw Grzedowicz", "123-ABC-456"),
            new Book("Miecz Przeznaczenia", "Andrzej Sapkowski", "432-THR-087"),
            new Book("Czysty Kod. Podrecznik dobrego programisty.", "Robert C. Martin", "978-83-283-0234-1")
            ));


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        BookFactory.books = books;
    }
}
