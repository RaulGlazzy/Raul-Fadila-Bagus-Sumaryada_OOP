import java.time.LocalDateTime;
import java.util.UUID;

public class Player {
    UUID playerID;
    String username;
    int highscore;
    int totalCoins;
    int totalDistance;
    LocalDateTime createdAt;


   public Player(UUID playerID, String inputUsername, int highscore, int totalCoins, int inputTotalDistance, LocalDateTime createdAt){
       this.playerID = UUID.randomUUID();
       this.username = inputUsername;
       this.highscore = 0;
       this.totalCoins = 0;
       this.totalDistance = inputTotalDistance;
       this.createdAt = LocalDateTime.now();
   }

   java.util.UUID getPlayerID(){
       return playerID;
   }

   void updateHighScore(int newScore){
       if(newScore > highscore){
           highscore = newScore + highscore;

       } else {
           System.out.println("Invalid.");
       }

   }

    void addCoins(int coins){
        totalCoins = coins + totalCoins;

    }

    void addDistance(int distance){
       totalDistance = distance + totalDistance;
    }

    void showDetail(){
        System.out.println("Player ID: " + playerID);
        System.out.println("Username: " + username);
        System.out.println("High Score: " + highscore);
        System.out.println("Total Coins: " + totalCoins);
        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Created At: " + createdAt + "\n\n");


    }


}
