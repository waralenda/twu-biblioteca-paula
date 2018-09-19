package com.twu.biblioteca;


        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertFalse;
        import static org.junit.Assert.assertTrue;

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
        assertEquals(1984, b.getYear());
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
        assertFalse(menu.checkIfValid(10));
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
        assertEquals(fullList, lib.getListOfBooks());
    }

    ///// RELEASE 2

    @Test
    public void testRentableGetTitle() {
        Rentable r = new Rentable("Title", "Creator", 2018);
        assertEquals("Title", r.getTitle());
    }

    @Test
    public void testRentableGetCreator() {
        Rentable r = new Rentable("Title", "Creator", 2018);
        assertEquals("Creator", r.getCreator());
    }

    @Test
    public void testRentableGetYear() {
        Rentable r = new Rentable("Title", "Creator", 2018);
        assertEquals(2018, r.getYear());
    }

    @Test
    public void testMovieGetTitle() {
        Movie m = new Movie("Title", "Director", 2019, 8);
        assertEquals("Title", m.getTitle());
    }

    @Test
    public void testMovieGetDirector() {
        Movie m = new Movie("Title", "Director", 2019, 8);
        assertEquals("Director", m.getDirector());
    }

    @Test
    public void testMovieGetYear() {
        Movie m = new Movie("Title", "Director", 2019, 8);
        assertEquals(2019, m.getYear());
    }

    @Test
    public void testMovieGetRating() {
        Movie m = new Movie("Title", "Director", 2019, 8);
        assertEquals(8, m.getRating());
    }

    @Test
    public void testMovieGetRatingUnrated() {
        Movie m = new Movie("Title", "Director", 2019, "unrated");
        assertEquals("unrated", m.getRating());
    }

    @Test
    public void testAvailableContent() {
        List<Rentable> l = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        Rentable r2 = new Rentable("Title2", "Author2", 1992);
        l.add(r1);
        l.add(r2);
        Content con = new Content(l);
        assertEquals(con.getContents(), con.getAvailableContent());
    }

    @Test
    public void testUnavailableContent() {
        List<Rentable> l = new ArrayList<Rentable>();
        List<Rentable> emptyList = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        l.add(r1);
        Content con = new Content(l);
        assertEquals(emptyList, con.getUnavailableContent());
    }

    @Test
    public void testRentContent() {
        List<Rentable> l = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        Rentable r2 = new Rentable("Title2", "Author2", 1992);
        l.add(r1);
        l.add(r2);
        List<Rentable> postRent = new ArrayList<Rentable>();
        postRent.add(r2);
        Content con = new Content(l);
        con.checkoutItem(r1);
        assertEquals(postRent, con.getAvailableContent());
    }

    @Test
    public void testRentContent2() {
        List<Rentable> l = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        Rentable r2 = new Rentable("Title2", "Author2", 1992);
        l.add(r1);
        l.add(r2);
        List<Rentable> postRent = new ArrayList<Rentable>();
        postRent.add(r1);
        Content con = new Content(l);
        con.checkoutItem(r1);
        assertEquals(postRent, con.getUnavailableContent());
    }

    @Test
    public void testReturnItem() {
        List<Rentable> l = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        Rentable r2 = new Rentable("Title2", "Author2", 1992);
        l.add(r1);
        l.add(r2);
        List<Rentable> postReturn = new ArrayList<Rentable>();
        postReturn.add(r2);
        postReturn.add(r1);
        Content con = new Content(l);
        con.checkoutItem(r1);
        con.returnItem(r1);
        assertEquals(postReturn, con.getAvailableContent());
    }

    @Test
    public void testReturnItem2() {
        List<Rentable> l = new ArrayList<Rentable>();
        Rentable r1 = new Rentable("Title1", "Author1", 1991);
        Rentable r2 = new Rentable("Title2", "Author2", 1992);
        l.add(r1);
        l.add(r2);
        List<Rentable> postReturn = new ArrayList<Rentable>();
        Content con = new Content(l);
        con.checkoutItem(r1);
        con.returnItem(r1);
        assertEquals(postReturn, con.getUnavailableContent());
    }

    @Test
    public void testEqualMovies() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director", 2000, 5);
        assertEquals(m1, m2);
    }

    @Test
    public void testUnequalMovies() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 5);
        assertFalse(m1 == m2);
    }

    @Test
    public void testGetListOfMovies() {
        Movie m1 = new Movie("Title", "Director", 2000, 3);
        List<Movie> fullList = new ArrayList<Movie>();
        fullList.add(m1);
        Moviary mov = new Moviary(fullList);
        assertEquals(fullList, mov.getListOfMovies());
    }

    @Test
    public void testGetAvailableMovies() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        assertEquals(l, mov.getAvailableMovies());
    }

    @Test
    public void testGetUnavailableMovies() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        List<Movie> empty = new ArrayList<Movie>();
        assertEquals(empty, mov.getUnavailableMovies());
    }

    @Test
    public void testRentMovieAvailableContent() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        mov.checkoutMovie(m1);
        List<Movie> postRent = new ArrayList<Movie>();
        postRent.add(m2);
        assertEquals(postRent, mov.getAvailableMovies());
    }

    @Test
    public void testRentMovieUnavailableContent() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        mov.checkoutMovie(m1);
        List<Movie> postRent = new ArrayList<Movie>();
        postRent.add(m1);
        assertEquals(postRent, mov.getUnavailableMovies());
    }

    @Test
    public void testReturnMovieAvailableContent() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        mov.checkoutMovie(m1);
        mov.returnMovie(m1);
        List<Movie> postReturn = new ArrayList<Movie>();
        postReturn.add(m2);
        postReturn.add(m1);
        assertEquals(postReturn, mov.getAvailableMovies());
    }

    @Test
    public void testReturnMovieUnavailableContent() {
        Movie m1 = new Movie("Title", "Director", 2000, 4);
        Movie m2 = new Movie("Title", "Director2", 2000, 10);
        List<Movie> l = new ArrayList<Movie>();
        l.add(m1);
        l.add(m2);
        Moviary mov = new Moviary(l);
        mov.checkoutMovie(m1);
        mov.returnMovie(m1);
        List<Movie> empty = new ArrayList<Movie>();
        assertEquals(empty, mov.getUnavailableMovies());
    }

    @Test
    public void testIsUsernameInvalid() {
        Menu menu = new Menu();
        assertFalse(menu.isValidUsername("Paula"));
    }

    @Test
    public void testIsUsernameValid() {
        Menu menu = new Menu();
        assertTrue(menu.isValidUsername("123-4567"));
    }

    @Test
    public void testIsUsernameInvalid2() {
        Menu menu = new Menu();
        assertFalse(menu.isValidUsername("12345677"));
    }

    @Test
    public void testIsUsernameValid2() {
        Menu menu = new Menu();
        assertTrue(menu.isValidUsername("xxx-xxxx"));
    }
}






