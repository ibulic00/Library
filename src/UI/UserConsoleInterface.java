package UI;

import entities.User;
/*
import java.util.Scanner;

public class UserConsoleInterface {

    User user = new User();
    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("1. Borrow a book");
        System.out.println("2. Return a book");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter the name of the book you want to borrow: ");
            String bookName = scanner.nextLine();
            borrowBook(user, bookName);
        } else if (choice == 2) {
            System.out.print("Enter the name of the book you want to return: ");
            String bookName = scanner.nextLine();
            returnBook(user, bookName);
        } else if (choice == 3) {
            break;
        } else {
            System.out.println("Invalid choice. Please enter a valid number.");
        }
    }

        scanner.close();
}

}
