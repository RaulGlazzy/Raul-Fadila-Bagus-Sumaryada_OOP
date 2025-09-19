//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Player;
import Model.Score;
import Repository.PlayerRepository;
import Repository.ScoreRepository;
import java.util.UUID;
public class Main {
    public static void main(String[] args) {
        PlayerRepository playerRepo = new PlayerRepository();
        ScoreRepository scoreRepo = new ScoreRepository();
        Player player1 = new Player("Stelle");
        Player player2 = new Player("gamerLooxmaxxing");
        Player player3 = new Player ("Stelle123");
        Player player4 = new Player ("Banananana");

        // Create and save Player
        Player savePlayer;

        player1.updateHighScore(1500);
        player1.addCoins(250);
        player1.addDistance(5000);
        player2.updateHighScore(3200);

        layer2.addCoins(750);
        player2.addDistance(12000);
        // Create update stats for player 3 and 4 (as you wish)
        player3.updateStat(idk);
        player4.updateStat(idk);

        Model.Score score1 = new Model.Score(player2.getPlayerId(), 1500, 250, 5000);
        Model.Score score2 = new Model.Score(player4.getPlayerId(), 3200, 750, 12000);
        Model.Score score3 = new Model.Score(player1.getPlayerId(), 4000, 400, 32000);
        Model.Score score4 = new Model.Score(player4.getPlayerId(), 1800, 300, 6000);
        Model.Score score5 = new Model.Score(player3.getPlayerId(), 2400, 240, 2400);
        Model.Score score6 = new Model.Score(player2.getPlayerId(), 6200, 320, 5000);
        Model.Score score7 = new Model.Score(player4.getPlayerId(), 1800, 60, 1200);
        Model.Score score8 = new Model.Score(player1.getPlayerId(), 2100, 200, 7000);
        Model.Score score9 = new Model.Score(player1.getPlayerId(), 8000, 720, 6200);
        Model.Score score10 = new Model.Score(player3.getPlayerId(), 1900, 210, 4200);

        System.out.println("=== TESTING CS3 ===");

        System.out.println("Find player by ID:");
        // Show the detail of Player 3
        System.out.println("========================== Player Details ==========================");
        player3.showDetail();C

        score1.showDetail();

        System.out.println("All players:");
        // Show all player

        // Sort all player based on highscore

        System.out.println("Scores for player1:");
        // Find Score of Player 1
    }