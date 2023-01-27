package services;

import data.BookList;
import entities.Book;
import entities.User;

public class UserServiceImpl implements UserService {
    @Override
    public void borrowBook(User user, String bookName) {

        BookList bookList = new BookList();

        Book book = null;
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            Book b = bookList.getBooks().get(i);

            if (b.getTitle().equals(bookName) && b.isAvailable()) {
                book = b;
                break;
            }
            System.out.println("Sorry, the book is not available for borrowing.");

            if (book != null) {
                book.setAvailable(false);
                user.getBorrowedBooks().add(book);
                System.out.println("Book successfully borrowed.");
            } else {
                System.out.println("Sorry, the book is not available for borrowing.");
            }
        }
    }

    @Override
    public void returnBook(User user, String bookName) {

        Book returnedBook = null;
        for (int i = 0; i < user.getBorrowedBooks().size(); i++) {
            Book b = (Book) user.getBorrowedBooks().get(i);
            if (b.getTitle().equals(bookName)) {
                returnedBook = b;
                break;
            }
        }

        if (returnedBook != null) {
            returnedBook.setAvailable(true);
            user.getBorrowedBooks().remove(returnedBook);
            System.out.println("Book successfully returned.");
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }
}

