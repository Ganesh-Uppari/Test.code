package objectarrays;

import java.util.Comparator;

public class Movie {
    // Instance variables
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods
    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    // Comparator implementation for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparingDouble(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());

    // Comparator implementation for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);

    // Main method (example usage)
    public static void main(String[] args) {
        // Creating instances of the Movie class
        Movie movie1 = new Movie(2000, 8.5, 50.0, 120.0);
        Movie movie2 = new Movie(2010, 7.8, 80.0, 150.0);
        Movie movie3 = new Movie(2005, 9.0, 30.0, 100.0);

        // Sorting movies by rating and profit
        System.out.println("Sorting by Rating and Profit:");
        Comparator<Movie> ratingAndProfitComparator = Movie.ratingAndProfitComparator;
        int result1 = ratingAndProfitComparator.compare(movie1, movie2);
        int result2 = ratingAndProfitComparator.compare(movie2, movie3);
        int result3 = ratingAndProfitComparator.compare(movie1, movie3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);

        // Sorting movies by year released and rating
        System.out.println("\nSorting by Year Released and Rating:");
        Comparator<Movie> yearAndRatingComparator = Movie.yearAndRatingComparator;
        int result4 = yearAndRatingComparator.compare(movie1, movie2);
        int result5 = yearAndRatingComparator.compare(movie2, movie3);
        int result6 = yearAndRatingComparator.compare(movie1, movie3);

        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
        System.out.println("Result 6: " + result6);
    }
}

