package com.joyride.netlabjoyridebe.repository; // packagenya sesuaikan
dengan file anda
import com.joyride.netlabjoyridebe.model.Score; // importnya sesuaikan
dengan file anda
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;
@Repository
public interface ScoreRepository extends JpaRepository<Score, UUID> {
    // ISI Kodenya disini
}




package Repository;

public class ScoreRepository {

    findByPlayerId(){
        return List<Score>;
    }

    findByPlayerIdOrderByValueDesc(){
        return List<Score>;
    }



    findByValueGreaterThan(){
        return List<Score>;
    }

    findAllByOrderByCreatedAtDesc(){
        return List<Score>;
    }


    findTopScores(int limit){
        @Query("SELECT s FROM Score s ORDER BY s.value DESC")
        List<Score> findTopScores(int limit);
        return List<Score>;
    }

    @Param("playerId")
    findHighestScoreByPlayerId(UUID playerId){
        @Query(SELECT s FROM Score s WHERE s.playerId = :playerId ORDER BY s.value
                DESC)
        return List<Score>;
    }

    @Param("playerId")
    getTotalCoinsByPlayerId(UUID playerId){
        @Query("SELECT SUM(s.coinsCollected) FROM Score s WHERE s.playerId =\n" +
                ":playerId")
        return int;
    }

    @Param("playerId")
    getTotalDistanceByPlayerId(UUID playerId){
        @Query SELECT SUM("s.distanceTravelled) FROM Score s WHERE s.playerId =\n" +
                ":playerId")
        return int;
    }



}
