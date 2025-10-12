package Repository;

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
        playerRepo.save(player1);
        playerRepo.save(player2);
        playerRepo.save(player3);
        playerRepo.save(player4);

        player1.updateHighScore(1500);
        player1.addCoins(250);
        player1.addDistance(5000);

        player2.updateHighScore(3200);
        player2.addCoins(750);
        player2.addDistance(12000);
        // Create update stats for player 3 and 4 (as you wish)

        player3.updateHighScore(3000);
        player3.addCoins(340);
        player3.addDistance(5000);

        player4.updateHighScore(2300);
        player4.addCoins(480);
        player4.addDistance(6200);
        // Create and save score with these following requirements;

        //Score 1
        Score score1 = new Score(player2.getPlayerID(), 1500, 250, 5000);
        Score score2 = new Score(player4.getPlayerID(), 3200, 750, 12000);
        Score score3 = new Score(player1.getPlayerID(), 4000, 400, 32000);
        Score score4 = new Score(player4.getPlayerID(), 1800, 300, 6000);
        Score score5 = new Score(player3.getPlayerID(), 2400, 240, 2400);
        Score score6 = new Score(player2.getPlayerID(), 6200, 320, 5000);
        Score score7 = new Score(player4.getPlayerID(), 1800, 60, 1200);
        Score score8 = new Score(player1.getPlayerID(), 2100, 200, 7000);
        Score score9 = new Score(player1.getPlayerID(), 8000, 720, 6200);
        Score score10 = new Score(player3.getPlayerID(), 1900, 210, 4200);

        scoreRepo.save(score1);
        scoreRepo.save(score2);
        scoreRepo.save(score3);
        scoreRepo.save(score4);
        scoreRepo.save(score5);
        scoreRepo.save(score6);
        scoreRepo.save(score7);
        scoreRepo.save(score8);
        scoreRepo.save(score9);
        scoreRepo.save(score10);

        System.out.println("=== TESTING CS3 ===");

        System.out.println("Find player by ID:");
        playerRepo.findByID(player3.getPlayerID()).ifPresent(Player::showDetail);
        // Show the detail of Player 3

        System.out.println("All players:");
        playerRepo.findAll().forEach(Player::showDetail);
        playerRepo.findTopPlayersByHighScore(10);
        // Show all player
        System.out.println("Player based on Highscore: ");
        playerRepo.findTopPlayersByHighScore(10).forEach(Player::showDetail);
        // Sort all player based on highscore

        System.out.println("Scores for player1:");
        scoreRepo.findTopScores(3).forEach(Score::showDetail);
        // Find Score of Player 1

        System.out.println("Total coins for player 1: " +
                scoreRepo.getTotalCoinsByPlayerID(player1.getPlayerID()));
    }
}
