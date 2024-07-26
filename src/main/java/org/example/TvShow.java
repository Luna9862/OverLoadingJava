package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // No-argument constructor
    public TvShow() {
        this.showName = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    // Constructor with only showName
    public TvShow(String showName) {
        this.showName = showName;
        this.numberOfEpisodes = 0; // Default number of episodes
        this.genre = "Unknown"; // Default genre
    }

    // Constructor with showName and numberOfEpisodes
    public TvShow(String showName, int numberOfEpisodes) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = "Unknown"; // Default genre
    }

    // Getters
    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    // toString method to match the desired output format
    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with " + getNumberOfEpisodes() + " number of episodes. The genre is " + getGenre();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.println("Enter TV show name (entering nothing will stop the loop): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("Enter number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter genre: ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        System.out.println("TV Shows List:");
        for (TvShow show : tvShows) {
            System.out.println(show);
        }

        // Testing the new constructors
        tvShows.add(new TvShow("Blue Planet II", 7)); // Using constructor with showName and numberOfEpisodes
        tvShows.add(new TvShow("Friends", 234)); // Using constructor with showName and numberOfEpisodes
        tvShows.add(new TvShow("Breaking Bad", 62)); // Using constructor with showName and numberOfEpisodes

        System.out.println("Additional TV Shows:");
        for (TvShow show : tvShows) {
            System.out.println(show);
        }
    }
}
