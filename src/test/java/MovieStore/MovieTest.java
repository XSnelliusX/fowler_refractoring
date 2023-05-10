package test.java.MovieStore;

import MovieStore.Movie;
import MovieStore.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    /**
     * Should set the price code for the movie
     */
    @Test
    public void setPriceCodeSetsCorrectPriceCode() {
        Movie movie = new Movie("The Matrix", Movie.REGULAR);
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, movie.getPriceCode());
    }

    /**
     * Should return the correct title for the movie
     */
    @Test
    public void getTitleReturnsCorrectTitle() {
        String title = "The Shawshank Redemption";
        int priceCode = Movie.REGULAR;
        Movie movie = new Movie(title, priceCode);

        assertEquals(title, movie.getTitle());
    }

    /**
     * Should create a movie with the given title and price code
     */
    @Test
    public void createMovieWithGivenTitleAndPriceCode() {
        String title = "The Shawshank Redemption";
        int priceCode = Movie.REGULAR;
        Movie movie = new Movie(title, priceCode);

        assertEquals(title, movie.getTitle());
        assertEquals(priceCode, movie.getPriceCode());
    }

    /**
     * Should return the correct price code for the movie
     */
    @Test
    public void getPriceCodeReturnsCorrectPriceCode() { // Context: None

        Movie movie = new Movie("The Matrix", Movie.REGULAR);

        int priceCode = movie.getPriceCode();

        assertEquals(Movie.REGULAR, priceCode);
    }

    /**
     * Should return the correct number of days rented
     */
    @Test
    public void getDaysRentedReturnsCorrectNumberOfDays() { // Create a test movie and rental
        Movie movie = new Movie("Test Movie", Movie.REGULAR);
        Rental rental = new Rental(movie, 5);

        // Verify that getDaysRented returns the correct number of days
        assertEquals(5, rental.getDaysRented());
    }
}
