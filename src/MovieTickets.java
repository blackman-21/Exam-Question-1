

public class MovieTickets implements IMovieTickets {

    // Method to calculate total sales for a movie
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }

    // Method to determine the top performing movie based on total sales
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] movies = {"Napolean", "Oppenheimer"};
        int[][] sales = {
                {3000, 1500, 1700}, // Napolean's sales
                {3500, 1200, 1600}  // Oppenheimer's sales
        };

        // Create an instance of MovieTickets
        MovieTickets movieTickets = new MovieTickets();
        int[] totalSales = new int[movies.length];

        // Calculate total sales for each movie
        for (int i = 0; i < sales.length; i++) {
            totalSales[i] = movieTickets.TotalMovieSales(sales[i]);
        }

        // Print the report header as a table
        System.out.println("MOVIE SALES REPORT");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Movie", "JAN", "FEB", "MAR", "Total Sales");
        System.out.println("--------------------------------------------------------------");

        // Print the sales data for each movie
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n",
                    movies[i], sales[i][0], sales[i][1], sales[i][2], totalSales[i]);
        }

        // Print the total sales at the bottom
        System.out.println("\nTotal Ticket Sales:");
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s %-10d\n", movies[i], totalSales[i]);
        }

        // Find and print the top-performing movie
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        int topSales = totalSales[movies[0].equals(topMovie) ? 0 : 1]; // Get the corresponding sales
        System.out.println("\nTop Performing Movie:");
        System.out.printf("%s with %d ticket sales\n", topMovie, topSales);
    }
}
