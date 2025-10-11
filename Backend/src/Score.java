import java.time.LocalDateTime;
import java.util.UUID;

public class Score implements ShowDetail{
    UUID scoreID;
    UUID playerID;
    Player player;
    int value;
    int coinsCollected;
    int distance;
    LocalDateTime createdAt;


    public void showDetail(){
        System.out.println("Score ID: " + scoreID);
        System.out.println("Player ID: " + player);
        System.out.println("Score Value: " + value);
        System.out.println("Coins Collected: " + coinsCollected);
        System.out.println("Distance: " + distance);
        System.out.println("Created At: " + createdAt + "\n\n");
    }

    Score(UUID scoreID, UUID playerID, Player inputPlayerrr, int inputValue, int inputCoinsCollected, int inputDistance, LocalDateTime createdAt){
        this.scoreID = UUID.randomUUID();
        this.playerID = UUID.randomUUID();
        this.player = inputPlayerrr;
        this.value = inputValue;
        this.coinsCollected = inputCoinsCollected;
        this.distance = inputDistance;
        this.createdAt = LocalDateTime.now();
    }

    java.util.UUID getValue(){
        return scoreID;
    }

    int getCoinsCollected(){
        return coinsCollected;
    }

    int getDistance(){
        return distance;
    }




}


