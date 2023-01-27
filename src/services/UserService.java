package services;

import entities.User;

public interface UserService {

     void borrowBook(User user, String bookName);

     void returnBook(User user, String bookName);
}
