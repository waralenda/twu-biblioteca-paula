package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testGetAvailability() {
        Book b = new Book("Title1", "Author1", 1984);
        assertEquals(true, b.getAvailability());
    }

    @Test
    public void testSetUnavailabile() {
        Book b = new Book("Title1", "Author1", 1984);
        b.setUnavailable();
        assertEquals(false, b.getAvailability());
    }

    @Test
    public void testSetAvailabile() {
        Book b = new Book("Title", "Author1", 1984);
        b.setUnavailable();
        b.setAvailable();
        assertEquals(true, b.getAvailability());
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




}
