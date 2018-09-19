package com.twu.biblioteca;


        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertFalse;
        import java.util.List;
        import java.util.ArrayList;

public class ExampleTest {
    @Test
    public void testGetAuthorNull() {
        Book b = new Book("Title1", "Author1", 1984);
        assertEquals("Author1", b.getAuthor());
    }

    @Test
    public void testGetYearPublished() {
        Book b = new Book("Title1", "Author1", 1984);
        assertEquals(1984, b.getYearPublished());
    }

    @Test
    public void testGetTitle() {
        Book b = new Book("Title1", "Author1", 1994);
        assertEquals("Title1", b.getTitle());
    }

    @Test
    public void testCheckIfValid() {
        List listOfBooks = new ArrayList();
        Library library = new Library(listOfBooks);
        Menu menu = new Menu(library);
        assertFalse(menu.checkIfValid(5));
    }

    @Test
    public void testOverrideEquals() {
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title1", "Author1", 1991);
        assertEquals(b1, b2);
    }

    @Test
    public void testUnequalsBooksYear() {
        Book b1 = new Book("Title1", "Author1", 1992);
        Book b2 = new Book("Title1", "Author1", 1991);
        assertFalse(b1 == b2);
    }

    @Test
    public void testUnequalsBooksTitle() {
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author1", 1991);
        assertFalse(b1 == b2);
    }

    @Test
    public void testUnequalsBooksAuthor() {
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title1", "Author2", 1991);
        assertFalse(b1 == b2);
    }

    @Test
    public void testAvailableBooks() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        Library lib = new Library(l);
        assertEquals(lib.getListOfBooks(), lib.getAvailableBooks());
    }

    @Test
    public void testUnavailableBooks() {
        List<Book> l = new ArrayList<Book>();
        List<Book> emptyList = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        l.add(b1);
        Library lib = new Library(l);
        assertEquals(emptyList, lib.getUnavailableBooks());
    }

    @Test
    public void testRentBook() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        List<Book> postRent = new ArrayList<Book>();
        postRent.add(b2);
        Library lib = new Library(l);
        lib.checkoutBook(b1);
        assertEquals(postRent, lib.getAvailableBooks());
    }

    @Test
    public void testRentBook2() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        List<Book> postRent = new ArrayList<Book>();
        postRent.add(b1);
        Library lib = new Library(l);
        lib.checkoutBook(b1);
        assertEquals(postRent, lib.getUnavailableBooks());
    }

    @Test
    public void testReturnBook() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        List<Book> postReturn = new ArrayList<Book>();
        postReturn.add(b2);
        postReturn.add(b1);
        Library lib = new Library(l);
        lib.checkoutBook(b1);
        lib.returnBook(b1);
        assertEquals(postReturn, lib.getAvailableBooks());
    }

    @Test
    public void testReturnBook2() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        List<Book> postReturn = new ArrayList<Book>();
        Library lib = new Library(l);
        lib.checkoutBook(b1);
        lib.returnBook(b1);
        assertEquals(postReturn, lib.getUnavailableBooks());
    }

    @Test
    public void testListsOfBooks() {
        List<Book> l = new ArrayList<Book>();
        Book b1 = new Book("Title1", "Author1", 1991);
        Book b2 = new Book("Title2", "Author2", 1992);
        l.add(b1);
        l.add(b2);
        List<Book> fullList = new ArrayList<Book>();
        fullList.add(b1);
        fullList.add(b2);
        Library lib = new Library(l);
        lib.checkoutBook(b1);
        assertEquals(fullList, lib.getListOfBooks());
    }
}
