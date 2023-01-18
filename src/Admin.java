import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Admin extends User {

    private List<Book> books;

    public Admin(String name, String lastName, int ID) {
        super(name, lastName, ID);
        this.books = new ArrayList<>();
    }

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
        books.add(book);
        System.out.println("Book has been added successfully");
    }

    public void removeBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ISBN of book to remove:");
        int ISBN = scan.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN() == ISBN) {
                books.remove(i);
                System.out.println("Book has been removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void checkAvailability() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter ISBN of book to check availability:");
            int ISBN = scan.nextInt();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getISBN() == ISBN) {
                    if (books.get(i).isAvailable()) {
                        System.out.println("Book is available");
                    } else {
                        System.out.println("Book is not available");
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

