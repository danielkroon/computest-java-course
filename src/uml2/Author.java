package uml2;

import java.util.ArrayList;

public class Author {
    private String nameAuthor;
    private int age;
    private ArrayList<Book> books;

    // Author constructor

    public Author(String nameAuthor, int age) {
        this.nameAuthor = nameAuthor;
        this.age = age;
        books = new ArrayList<Book>();
    }

    // Getters and Setters

    public String getNameAuthor() {
        return nameAuthor;
    }

    public int getAge() {
        return age;
    }

    public ArrayList getBooks() {
        return books;
    }

    // Methods

    public void addBook(Book book) {
        books.add(book);
    }
}
