package Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Model.Player player1 = new Model.Player("Wowo");
        Model.Player player2 = new Model.Player("Wiwi");

        Model.Score score1 = new Model.Score(player1.getPlayerID(), 1500, 250, 5000);
        Model.Score score2 = new Model.Score(player2.getPlayerID(), 3200, 750, 12000);
        Model.Score score3 = new Model.Score(player1.getPlayerID(), 1800, 300, 6000);

        player1.updateHighScore(score1.getValue());
        player1.addCoins(score1.getCoinsCollected());
        player1.addCoins(score3.getCoinsCollected());
        player1.addDistance(score1.getDistance());
        player1.addDistance(score3.getDistance());

        player2.updateHighScore(score1.getValue());
        player2.addCoins(score2.getCoinsCollected());
        player2.addDistance(score2.getDistance());

        System.out.println("\n===================== Model.Player Details ======================\n");
        player1.showDetail();
        player2.showDetail();
    }
}