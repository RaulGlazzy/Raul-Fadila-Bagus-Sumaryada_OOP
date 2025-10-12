package Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Score implements ShowDetail {
    private UUID scoreID;
    private UUID playerID;
    private Player player;
    private int value;
    private int coinsCollected;
    private int distance;
    private LocalDateTime createdAt;


    public void showDetail(){
        System.out.println("Model.Score ID: " + scoreID);
        System.out.println("Model.Player ID: " + player);
        System.out.println("Model.Score Value: " + value);
        System.out.println("Coins Collected: " + coinsCollected);
        System.out.println("Distance: " + distance);
        System.out.println("Created At: " + createdAt + "\n\n");
    }

    public Score(UUID playerID, int inputValue, int inputCoinsCollected, int inputDistance){
        this.scoreID = UUID.randomUUID();
        this.playerID = playerID;
        this.value = inputValue;
        this.coinsCollected = inputCoinsCollected;
        this.distance = inputDistance;
        this.createdAt = LocalDateTime.now();
    }

    public int getValue(){
        return value;
    }

    public int getCoinsCollected(){
        return coinsCollected;
    }

    public int getDistance(){
        return distance;
    }


    public Object getPlayerID() {
        return playerID;
    }

    public UUID getScoreID() {
        return scoreID;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}


