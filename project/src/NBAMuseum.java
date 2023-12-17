import java.util.ArrayList;
import java.util.List;

public class NBAMuseum {
    public List<BasketballPlayer> playerList;

    // constructed function
    public NBAMuseum() {
        this.playerList = new ArrayList<>();
    }

    // Add basketball star
    public void addPlayer(BasketballPlayer player) {
        playerList.add(player);
    }

    // View all basketball stars
    public void displayPlayers() {
        System.out.println("NBA名人堂成员:");
        for (BasketballPlayer player : playerList) {
            System.out.println("Name: " + player.getName() + ", Points: " + player.getPoints());
        }
    }

    // Find basketball stars
    public BasketballPlayer findPlayer(String name) {
        for (BasketballPlayer player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    // Removing Basketball Stars from the Hall of Fame
    public void removePlayer(BasketballPlayer player) {
        playerList.remove(player);
    }

    // Introducing the highlights and history of basketball stars
    public void importHighlights(String playerName, List<String> highlights) {
        BasketballPlayer player = findPlayer(playerName);
        if (player != null) {
            for (String highlight : highlights) {
                player.addHighlight(highlight);
            }
            System.out.println("Highlights imported for " + playerName);
        } else {
            System.out.println("Player not found.");
        }
    }

    // Search basketball star highlights history
    public void displayPlayerHighlights(String playerName) {
        BasketballPlayer player = findPlayer(playerName);
        if (player != null) {
            List<String> highlights = player.getHighlights();
            System.out.println("Highlights for " + playerName + ":");
            for (String highlight : highlights) {
                System.out.println("- " + highlight);
            }
        } else {
            System.out.println("Player not found.");
        }
    }
}
