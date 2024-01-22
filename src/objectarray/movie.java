package objectarray;

import java.util.Comparator;

public class movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods...

    // Comparator for sorting by rating and profit
    public static Comparator<movie> ratingAndProfitComparator = Comparator
            .comparing(movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());

    // Comparator for sorting by year released and rating
    public static Comparator<movie> yearAndRatingComparator = Comparator
            .comparingInt(movie::getYearReleased)
            .thenComparingDouble(movie::getRating);

    // Getter methods...

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

    // Main method for testing
    public static void main(String[] args) {
        // Creating some sample movies
        movie movie1 = new movie(2005, 8.5, 50.0, 150.0);
        movie movie2 = new movie(2010, 7.8, 80.0, 120.0);
        movie movie3 = new movie(2015, 9.0, 30.0, 200.0);

        // Sorting movies by rating and profit
        int result1 = movie.ratingAndProfitComparator.compare(movie1, movie2);
        int result2 = movie.ratingAndProfitComparator.compare(movie2, movie3);

        // Sorting movies by year released and rating
        int result3 = movie.yearAndRatingComparator.compare(movie1, movie2);
        int result4 = movie.yearAndRatingComparator.compare(movie2, movie3);

        // Displaying the results
        System.out.println("Comparison result by rating and profit between movie1 and movie2: " + result1);
        System.out.println("Comparison result by rating and profit between movie2 and movie3: " + result2);
        System.out.println("Comparison result by year released and rating between movie1 and movie2: " + result3);
        System.out.println("Comparison result by year released and rating between movie2 and movie3: " + result4);
    }
}

