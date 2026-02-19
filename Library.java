import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------");
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public Book searchByTitle(String title) {
        for (Book b : books) {    {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "102");   library.addBook(b1);
        library.addBook(b2);

        System.out.println("\nAll Books:");
        library.displayAllBooks();

        System.out.println("\nSearching for 'Java Basics':");
        Book found = library.searchByTitle("Java Basics");

        if (found != null) {
            found.display();
        } else {
            System.out.println("Book not found.");
        }
    }
}