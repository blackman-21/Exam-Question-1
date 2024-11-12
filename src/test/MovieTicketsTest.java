package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MovieTicketsTest {

    private MovieTickets movieTickets; // Corrected the type to MovieTickets

    @BeforeEach
    public void setUp() {
        // Initialize the MovieTickets instance before each test
        movieTickets = new MovieTickets();
    }

    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        // Test data
        int[] ticketSalesNapolean = {3000, 1500, 1700}; // Expected total: 6200

        // Act
        int totalSales = movieTickets.TotalMovieSales(ticketSalesNapolean);

        // Assert
        assertEquals(6200, totalSales, "Total sales for Napolean should be 6200");
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        // Test data
        String[] movies = {"Napolean", "Oppenheimer"};
        int[] totalSales = {6200, 6300}; // Oppenheimer has the highest total sales

        // Act
        String topMovie = movieTickets.TopMovie(movies, totalSales);

        // Assert
        assertEquals("Oppenheimer", topMovie, "Top movie should be Oppenheimer");
    }

    private class MovieTickets {
        public int TotalMovieSales(int[] ticketSalesNapolean) {
            return 0;
        }

        public String TopMovie(String[] movies, int[] totalSales) {
            return null;
        }
    }
}
