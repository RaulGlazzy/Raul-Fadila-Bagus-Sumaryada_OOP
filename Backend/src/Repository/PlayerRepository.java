package Repository;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.*;
import Model.Player;
import java.util.stream.Collectors;




public class PlayerRepository extends BaseRepository<Player, UUID>{

        @Override
        public void save(Player player){
          UUID id = getID(player);
          dataMap.put(id, player);
          allData.add(player);
        }

        @Override
        public UUID getID(Player entity){
            return entity.getPlayerID();
        }

        public Optional<Player> findByUsername(String username){
            return allData.stream()
                    .filter(player -> player.getUsername().equals(username))
                    .findFirst();
        }

    public boolean existByUsername(String username) {
        return allData.stream()
                .anyMatch(player -> player.getUsername().equals(username));
    }



    public List<Player> findTopPlayersByHighScore(int limit){

        return allData.stream().sorted((p1, p2) -> Integer.compare(p2.getHighScore(), p1.getHighScore()))
                .limit(limit)
                .collect(Collectors.toList());
    }

    public List<Player>findByHighscoreGreaterThan(int minScore){
        return allData.stream()
            .filter(player -> player.getHighScore() > minScore)
                .collect(Collectors.toList());
    }

    public List<Player> findAllByOrderByTotalCoinsDesc(){
        return allData.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getTotalCoins(), p1.getTotalCoins()))
                .collect(Collectors.toList());
    }

    public List<Player> findAllByOrderByTotalDistanceTravelledDesc(){
        return allData.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getTotalDistance(), p1.getTotalDistance()))
                        .collect(Collectors.toList());
    }

}
