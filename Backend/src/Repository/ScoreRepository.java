package Repository;

import java.util.HashMap;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import Model.Score;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;


public class ScoreRepository extends BaseRepository<Score, UUID> {

    @Override
    public void save(Score score){
        UUID id = getID(score);
        dataMap.put(id, score);
        allData.add(score);

    }

    @Override
    public UUID getID(Score entity){
        return entity.getScoreID();
    }

    public List<Score> findByPlayerId(UUID playerID){
        return allData.stream()
                .filter(score -> score.getPlayerID().equals(playerID))
                .collect(Collectors.toList());
    }

    public List<Score> findByPlayerIDOrderByValueDesc(UUID playerID){
        return allData.stream()
                .filter(score -> score.getPlayerID().equals(playerID))
                .sorted((s1, s2) -> Integer.compare(s2.getValue(), s1.getValue()) )
                .collect(Collectors.toList());
    }

    public List<Score> findTopScores(int limit){
        return allData.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getValue(), s1.getValue()))
                        .limit(limit)
                        .collect(Collectors.toList());
    }

    public Optional<Score> findHighestScoreByPlayerID(UUID playerID){
        return allData.stream()
                .filter(score -> score.getPlayerID().equals(playerID))
                .max((s1, s2) -> Integer.compare(s2.getValue(), s1.getValue()));

    }

    public List<Score> findByValueGreaterThan(int minValue){

        return allData.stream()
                .filter(score -> score.getValue() > minValue)
                .collect(Collectors.toList());
    }

    public List<Score> findAllByOrderByCreatedAtDesc(){
        return allData.stream()
                .sorted((s1, s2) -> s2.getCreatedAt().compareTo(s1.getCreatedAt()))
                .collect(Collectors.toList());
    }

    public int getTotalCoinsByPlayerID(UUID playerID){
        return allData.stream()
                .filter(score -> score.getPlayerID().equals(playerID))
                .mapToInt(Score::getCoinsCollected).sum();
    }



    public int getTotalDistanceByPlayerID(UUID playerID){

        return allData.stream()
                .filter(score -> score.getPlayerID().equals(playerID))
                .mapToInt(Score::getDistance).sum();

    }



}
