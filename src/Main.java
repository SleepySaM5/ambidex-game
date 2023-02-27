public class Main {
    public static void main(String[] args) {
        Player Sigma = new Player("Sigma");
        Player Dio = new Player("Dio");
        Player Luna = new Player("Luna");
        Door escapeDoor = new Door();

        System.out.println("Sigma bracelet color set to: " + Sigma.color);
        System.out.println("Dio bracelet color set to: " + Dio.color);
        System.out.println("Luna bracelet color set to: " + Luna.color);

        if(Sigma.score == escapeDoor.number) {
            System.out.println("Sigma can escape through the number 9 door!");
        }

        System.out.println(Sigma.playerName + " chose " + Sigma.playerVote(Vote.Ally));
    }
}