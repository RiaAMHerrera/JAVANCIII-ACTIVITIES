// Create a Java class to represent a Book and implement a constructor to initialize its attributes. //
// Instructions: Create a new Java class called "Book" with the following attributes: //
// String title //
// String author //
// int yearPublished //
// double price //
// Implement a constructor in the Book class that takes four parameters //
// corresponding to the attributes and initializes them. //
// Create a main method in a separate class to test the constructor: //
// Instantiate three Book objects with different values using the constructor. //
// Print out the details of each book (title, author, yearPublished, and price) //
// using System.out.println(). //
// Example Output: //
// Book 1: //
// Title: "Java Programming" //
// Author: "John Smith" //
// Year Published: 2021 //
// Price: $39.99 //
// Book 2: //
// Title: "Python Basics" //
// Author: "Jane Doe" //
// Year Published: 2020 //
// Price: $29.99 //
// Book 3: //
// Title: "C++ Essentials" //
// Author: "Michael Johnson" //
// Year Published: 2019 //
// Price: $49.99 //

public class Book {
    // Attributes
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Getters (Optional)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }
}