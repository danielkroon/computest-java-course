package uml2;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
        new Main();
    } {

    // Constructors

    Book book1 = new Book("Turksfruit", "99921-58-10-7", new Date(1990, 02,11), Category.SPORT);
    Book book2 = new Book("Harry Potter", "0-684-84328", new Date(2000, 05, 1), Category.FICTION);
    Book book3 = new Book("Permanent Record", "1-634-23325", new Date(2011, 12, 04), Category.FICTION);

    Author author1 = new Author("J.R.Tolkien", 60);
    Author author2 = new Author("M.Oskounev", 27);

    Library library1 = new Library("OBA", "Oosterdokskade 143 Amsterdam");
    Library library2 = new Library("Bibliotheek Rotterdam", "Hoogstraat 110, 3011 PV Rotterdam");

    LibraryService libraryService1 = new LibraryService(library1);

    // Methods

    // add book too ArrayList book
        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book3);

    // check if books are added successfully to author
        System.out.println("Books currently present in the author Arraylist: " + author1.getBooks());

    // add author to a library
        library1.addAuthor(author1);
        library2.addAuthor(author2);

    // find author by name method from LibraryService class
        libraryService1.findAuthorByNAme("J.R.Tolkien");
        libraryService1.findAuthorByNAme("J.R.Tlkien");

    // find book by name method from
        libraryService1.findBookByName("Turksfruit");
        libraryService1.findBookByName("Turksebanaan");

    // get all books from author
        libraryService1.getAllBooksFromAuthor(author1);
        libraryService1.getAllBooksFromAuthor(author2);

    // find all books between certain date
    libraryService1.findBooksBetweenDate(new Date(1988, 11, 02), new Date(1992, 04,05));
    libraryService1.findBooksBetweenDate(new Date(1900, 11, 02), new Date(1950, 04,05));

    }

}
