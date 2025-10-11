import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n===================== Player Details ======================\n");
        Player player1 = new Player(UUID.randomUUID(), "Wowo", 1500, 250, 5000, LocalDateTime.now());
        Player player2 = new Player(UUID.randomUUID(), "Wiwi", 3200, 750, 12000, LocalDateTime.now());
        player2.showDetail();
        Player player1update = new Player(UUID.randomUUID(), "Wowo", 1500 + 1800, 250 + 300, 5000 + 6000, LocalDateTime.now());
        player1update.showDetail();
        Score score1 = new Score(UUID.randomUUID(), UUID.randomUUID(), player1, 1500, 250, 5000, LocalDateTime.now());
        Score score2 = new Score(UUID.randomUUID(), UUID.randomUUID(), player2, 3200, 750, 12000, LocalDateTime.now());
        Score score3 = new Score(UUID.randomUUID(), UUID.randomUUID(), player1, 1800, 300, 6000, LocalDateTime.now());
    }
}