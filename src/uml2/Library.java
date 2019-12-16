package uml2;

import java.util.ArrayList;

public class Library {
    private String nameLibrary;
    private String address;
    private ArrayList<Author> authors;

    // Create Library constructor

    public Library(String nameBook, String address) {
        this.nameLibrary = nameBook;
        this.address = address;
        authors = new ArrayList<Author>();
    }

    // Getters and Setters

    public String getNameLibrary() {
        return nameLibrary;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    // Methods

    public void addAuthor(Author author) {
        authors.add(author);
    }
}