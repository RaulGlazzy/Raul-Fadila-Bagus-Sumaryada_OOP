package Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Player implements ShowDetail{
     UUID playerID;
    private String username;
    private int highscore;
    private int totalCoins;
    private int totalDistance;
    private LocalDateTime createdAt;


   public Player(String inputUsername){
       this.playerID = UUID.randomUUID();
       this.username = inputUsername;
       this.highscore = 0;
       this.totalCoins = 0;
       this.totalDistance = 0;
       this.createdAt = LocalDateTime.now();
   }

   public UUID getPlayerID(){
       return playerID;
   }

   public void updateHighScore(int newScore){
       if(newScore > this.highscore) {
           this.highscore = newScore;

       }
   }

    public void addCoins(int coins){
        this.totalCoins += coins;

    }

    public void addDistance(int distance){

       this.totalDistance += distance;
    }

    @Override
    public void showDetail(){
        System.out.println("Model.Player ID: " + playerID);
        System.out.println("Username: " + username);
        System.out.println("High Model.Score: " + highscore);
        System.out.println("Total Coins: " + totalCoins);
        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Created At: " + createdAt + "\n\n");
    }

    public Object getUsername() {
        return username;
    }

    public int getHighScore() {
        return highscore;
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public int getTotalDistance() {
        return totalDistance;
    }


}
