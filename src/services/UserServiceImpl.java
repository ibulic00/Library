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
            if (book != null) {
                book.setAvailable(false);
                user.getBorrowedBooks().add(book);
                System.out.println("Book successfully borrowed.");
            } else {
                System.out.println("Sorry, the book is not available for borrowing.");
            }
        }


        @Override
        public void returnBook (User user,int ISBN){



        }

        }

