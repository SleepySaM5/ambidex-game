import java.util.Random;

public class Player {
    String playerName = "Default Name";
    int score = 0;
    public Player(String input) {
        playerName = input;
    }
    private Colors randomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }
    String color = String.valueOf(randomColor());

    public Vote playerVote(Vote input) {
        return input;
    }
}
