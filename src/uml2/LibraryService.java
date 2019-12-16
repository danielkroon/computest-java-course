package uml2;

import java.util.ArrayList;
import java.util.Date;

public class LibraryService {
    private Library library;

    // Library constructor

    public LibraryService(Library library) {
        this.library = library;
    }

    // Methods

    public Author findAuthorByNAme(String name) {
        for (Author item:library.getAuthors()) {
            if (item.getNameAuthor().equals(name)) {
                System.out.println("Found the bastard:  " + item.getNameAuthor() + " and his/her age is: " + item.getAge());
                return item;
            }
        }
        System.out.println("Sorry couldn't find the bastard named: " + name);
        return null;
    }

    public Book findBookByName(String name) {
        // create an Arraylist of all books of all authors
            ArrayList<Book> result = new ArrayList();
            for (Author item:library.getAuthors()) {
                result = item.getBooks();
            }

        // in the new created Arraylist search for the book name
            for (Book item:result){
                if (item.getNameBook().equals(name)) {
                    System.out.println("Found the book: " + item.getNameBook());
                    return item;
                }
            }
        System.out.println("Sorry couldn't find the book named: " + name);
        return null;
    }

    public ArrayList<Book> getAllBooksFromAuthor(Author author) {
        ArrayList<Book> books = author.getBooks();

        for (Book item:books) {
            System.out.println("found these books: " + item.getNameBook() + " from author: " + author.getNameAuthor());
        }

        return author.getBooks();
    }

    public ArrayList<Book> findBooksBetweenDate(Date start, Date end) {
        ArrayList<Author> authors = library.getAuthors();
        ArrayList<Book> result = new ArrayList<Book>();

        for (Author item1:authors) {
            ArrayList<Book> booksOfAuthor = item1.getBooks();
            System.out.println("books: " + booksOfAuthor);

            for (Book item2:booksOfAuthor) {
                if (item2.getDate().before(end) && item2.getDate().after(start)) {
                    System.out.println("Found books between given start and end date: " + item2.getNameBook());
                    result.add(item2);
                }
            }
        }
        System.out.println("Found no books between given start date " + start + " and "+ end + " date");
        return result;
    }
}
