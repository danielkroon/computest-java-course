package uml2;

import java.util.Date;

public class Book {
    private String nameBook;
    private String ISBN;
    private Date Date;
    private Category Category;

    // Book constructor

    public Book(String nameBook, String ISBN, Date date, Category Category) {
        this.nameBook = nameBook;
        this.ISBN = ISBN;
        this.Date = date;
        this.Category = Category;
        System.out.println("Book " + nameBook + " created.");
    }

    // Getters and Setters

    public Category getCategory() {
        return Category;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Date getDate() {
        return Date;
    }
}
