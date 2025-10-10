package com.joyride.netlabjoyridebe.service; // import packagenya sesuaikan
dengan file anda
import com.joyride.netlabjoyridebe.model.Score; // sesuaikan
import com.joyride.netlabjoyridebe.repository.ScoreRepository; //sesuaikan
import com.joyride.netlabjoyridebe.repository.PlayerRepository; //sesuaikan
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerService playerService;



    @Transactional
            scoreRepository.save(score);
            playerService.updatePlayerStats();

    getScoreById(UUID scoreID){
        findById();
        return Optional<Score>;
    }

    getAllScores(){
        findAll();
        return List<Score>;
    }

    getScoresByPlayerId(UUID playerID){
        findByPlayerId();
        return List<Score>;
    }

    getScoresByPlayerIdOrderByValue(UUID playerID){
        findByPlayerIdOrderByValueDesc)();
        return List<Score>;
    }

    getLeaderboard(int limit){
        findTopScores();
        return List<Score>;
    }
}
