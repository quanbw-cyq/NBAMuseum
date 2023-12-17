import java.util.ArrayList;
import java.util.List;

public class BasketballPlayer {
    public String name;
    public int points;
    public List<String> highlights;  // Used to store highlight history

    public BasketballPlayer(String name, int points) {
        this.name = name;
        this.points = points;
        this.highlights = new ArrayList<>();
    }

    // Obtain player name
    public String getName() {
        return name;
    }

    //Get player scores
    public int getPoints() {
        return points;
    }

    // Set player scores
    public void setPoints(int points) {
        this.points = points;
    }

    // Add highlights
    public void addHighlight(String highlight) {
        highlights.add(highlight);
    }

    // Get highlights history
    public List<String> getHighlights() {
        return highlights;
    }
}
