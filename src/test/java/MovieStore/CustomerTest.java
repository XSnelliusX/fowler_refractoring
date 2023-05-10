package test.java.MovieStore;

import MovieStore.Customer;
import MovieStore.Movie;
import MovieStore.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    /**
     * Should return the customer's name
     */
    @Test
    public void getName() { // Create test data
        String name = "John Doe";
        Movie movie1 = new Movie("Movie 1", Movie.REGULAR);
        Movie movie2 = new Movie("Movie 2", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);

        // Create customer object
        Customer customer = new Customer(name);

        // Add rentals to customer object
        customer.addRental(rental1);
        customer.addRental(rental2);

        // Verify the statement method returns the expected result
        String expectedStatement =
                "Rental Record for "
                        + name
                        + "\n"
                        + "\tTitle\t\tDays\tAmount\n"
                        + "\tMovie 1\t\t3\t3.5\n"
                        + "\tMovie 2\t\t2\t6.0\n"
                        + "Amount owed is 9.5\n"
                        + "You earned 3 frequent renter points";
        assertEquals(expectedStatement, customer.statement());
    }

    /**
     * Should calculate the rental amount for different movie price codes
     */
    @Test
    public void amountFor() { // Create a test customer
        Customer customer = new Customer("John Doe");

        // Create some test movies
        Movie regularMovie = new Movie("Regular Movie", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Movie childrensMovie = new Movie("Children's Movie", Movie.CHILDRENS);

        // Create some test rentals
        Rental regularRental = new Rental(regularMovie, 3);
        Rental newReleaseRental = new Rental(newReleaseMovie, 2);
        Rental childrensRental = new Rental(childrensMovie, 4);

        // Add the rentals to the customer
        customer.addRental(regularRental);
        customer.addRental(newReleaseRental);
        customer.addRental(childrensRental);

        // Test the statement method
        String expectedStatement =
                """
                        Rental Record for John Doe
                        \tTitle\t\tDays\tAmount
                        \tRegular Movie\t\t3\t3.5
                        \tNew Release Movie\t\t2\t6.0
                        \tChildren's Movie\t\t4\t3.0
                        Amount owed is 12.5
                        You earned 4 frequent renter points""";
        assertEquals(expectedStatement, customer.statement());
    }
}