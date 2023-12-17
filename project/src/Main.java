// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating the NBA Hall of Fame
        NBAMuseum nbaMuseum = new NBAMuseum();

        // User inputs basketball star information and adds it to the Hall of Fame
        System.out.println("Enter the number of basketball players you want to add:");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter the name of basketball player " + (i+1) + ":");
            String playerName = scanner.nextLine();

            System.out.println("Enter the points scored by " + playerName + ":");
            int playerPoints = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            BasketballPlayer player = new BasketballPlayer(playerName, playerPoints);
            nbaMuseum.addPlayer(player);

            // User inputs basketball star highlight history and imports it
            System.out.println("Enter the number of highlights for " + playerName + ":");
            int numberOfHighlights = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            List<String> highlights = new ArrayList<>();
            for (int j = 0; j < numberOfHighlights; j++) {
                System.out.println("Enter highlight " + (j + 1) + " for " + playerName + ":");
                String highlight = scanner.nextLine();
                highlights.add(highlight);
            }

            nbaMuseum.importHighlights(playerName, highlights);
        }

        // View all basketball stars
        System.out.println("\nAll Basketball Players in the NBA Hall of Fame:");
        nbaMuseum.displayPlayers();

        // Search basketball star highlights history
        System.out.println("\nEnter the name of the player you want to see highlights for:");
        String playerToQuery = scanner.nextLine();
        nbaMuseum.displayPlayerHighlights(playerToQuery);
    }
}