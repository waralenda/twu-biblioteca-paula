package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.ArrayList;

public class ExampleTest {

    @Test
    public void testGetAvailability() {
        Book b = new Book("Title1", "Author1", 1984);
        assertTrue(b.getAvailability());
    }

    @Test
    public void testSetUnavailabile() {
        Book b = new Book("Title1", "Author1", 1984);
        b.setUnavailable();
        assertFalse(b.getAvailability());
    }

    @Test
    public void testSetAvailabile() {
        Book b = new Book("Title", "Author1", 1984);
        b.setUnavailable();
        b.setAvailable();
        assertTrue(b.getAvailability());
    }

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
    public void testCheckoutBook() {
        Book b = new Book("Title1", "Author1", 1984);
        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(b);
        Library l = new Library(listOfBooks);
        l.checkout(b, listOfBooks);
        assertFalse(b.getAvailability());
    }

}
