package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    // Attributes
    private String title;
    private int pages;
    private int publicationYear;

    // Constructor with all parameters
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // No-argument constructor
    public Book() {
        this.title = "Unknown Title";
        this.pages = 0;
        this.publicationYear = 0;
    }

    // Constructor with title only
    public Book(String title) {
        this.title = title;
        this.pages = 0;
        this.publicationYear = 0;
    }

    // Constructor with title and pages
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = 0;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, published in " + publicationYear;
    }

    // Main method to handle user input and operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter the title of the book (or press Enter to finish): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What do you want to print? (everything/name): ");
        String printChoice = scanner.nextLine().trim().toLowerCase();

        if (printChoice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printChoice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice. Please enter 'everything' or 'name'.");
        }

        // Test the new constructors
        books.add(new Book("The name of the Wind", 662)); // Using constructor with title and pages
        books.add(new Book("Beautiful Code", 593)); // Using constructor with title and pages
        books.add(new Book("Brave New World", 311)); // Using constructor with title and pages

        System.out.println("Additional Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
