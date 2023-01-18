
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Ivan","B",1 );

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("4. Check availability of a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                admin.addBook();
                // Add book
            } else if (choice == 2) {
                // Remove book
                admin.removeBook();
            } else if (choice == 4) {
                // Check availability of a book
                admin.checkAvailability();
            } else if (choice == 5) {
                // Exit the program
                break;
            }
        }
    }
}