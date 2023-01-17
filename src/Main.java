import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("John Doe", 1);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Update a book");
            System.out.println("4. Check availability of a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();


            if (choice == 1) {
                admin.addBook();
            } else if (choice == 2) {
                // Code to remove a book
                admin.removeBook();
            } else if (choice == 3) {
                // Code to update a book
                admin.updateBook();
            } else if (choice == 4) {
                // Code to check availability of a book
                admin.checkAvailability();
            } else if (choice == 5) {
                // Exit the program
                break;
            }
        }
    }
}