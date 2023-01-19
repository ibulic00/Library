package services;

import entities.Author;
import entities.Book;
import data.BookList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminServiceImpl implements AdminService {

    // private List<Book> books = new ArrayList<>();

    @Override
    public void addBook() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scan.nextLine();

        System.out.print("Enter author name: ");
        String authorName = scan.nextLine();

        System.out.print("Enter ISBN: ");
        int ISBN = scan.nextInt();

        Author author = new Author(authorName);
        Book book = new Book(title, author, ISBN);

        BookList bookList = new BookList();
        bookList.getBooks().add(book);
        System.out.println("entities.Book has been added successfully");
    }

    @Override
    public void removeBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ISBN of book to remove:");
        int ISBN = scan.nextInt();
        BookList bookList = new BookList();

        for (int i = 0; i < bookList.getBooks().size(); i++) {
            if (bookList.getBooks().get(i).getISBN() == ISBN) {
                bookList.getBooks().remove(i);
                System.out.println("entities.Book has been removed successfully");
                return;
            }
        }
        System.out.println("entities.Book not found");

    }

    @Override
    public void checkAvailability() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter ISBN of book to check availability:");
            int ISBN = scan.nextInt();
            BookList bookList = new BookList();
            for (int i = 0; i < bookList.getBooks().size(); i++) {
                if (bookList.getBooks().get(i).getISBN() == ISBN) {
                    if (bookList.getBooks().get(i).isAvailable()) {
                        System.out.println("entities.Book is available");
                    } else {
                        System.out.println("entities.Book is not available");
                    }
                    return;
                }
            }
            System.out.println("Book not found");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a valid ISBN number");
        }

    }
}
