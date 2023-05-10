package test.java.MovieStore;

import MovieStore.Movie;
import MovieStore.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    /**
     * Should return the correct number of days rented
     */
    @Test
    public void getDaysRentedReturnsCorrectValue() { // Create a test rental object
        Movie movie = new Movie("The Matrix", Movie.REGULAR);
        Rental rental = new Rental(movie, 5);

        // Verify that getDaysRented returns the correct value
        assertEquals(5, rental.getDaysRented());
    }
}