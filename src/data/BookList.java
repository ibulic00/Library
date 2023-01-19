package data;

import entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> books = new ArrayList<>();



    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
