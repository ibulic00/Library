package entities;

import java.util.ArrayList;

public class User {


    private int ID;
    private String name;
    private String lastName;
    private ArrayList<Object> borrowedBooks = new ArrayList<>();


    public User(String name, String lastName, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    public ArrayList getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
