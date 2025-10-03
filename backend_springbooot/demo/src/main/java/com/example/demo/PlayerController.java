package com.example.demo;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    getAllPlayers(){



    }


    getPlayerById(@PathVariable UUID playerId){

    }


    getPlayerById(@GetMapping("/username/{username}")){

    }

    checkUsername(@GetMapping){
        playerService.isUsernameExists(username);

    }

    createPlayer(@RequestBody Player player){
        @PostMapping
        try{
            playerService.createPlayer(player)
            HttpStatus.CREATED
        }
        catch(IO){
            HttpStatus.BAD_REQUEST
        }
        createPlayer(@PutMapping("/{playerId}")){
            if(){
                playerService.updatePlayer(playerId, player);
                return
            } else{
                return HttpStatus.NOT_FOUND;
            }

        }

        deletePlayer(@PathVariable UUID playerId){
            @DeleteMapping("/{playerId}")
                    playerService.deletePlayer(playerId);
        }

        getLeaderboardByHighScore(@RequestParam(defaultValue = "10"){
            return ResponseEntity<List<Player>>;

            @GetMapping("/leaderboard/high-score")
                    playerService.getLeaderboardByHighScore(limit);
            return ResponseEntity.ok();
        }

        getLeaderboardByTotalCoins(){
            return ResponseEntity<List<Player>>;

            @GetMapping("/leaderboard/total-coins")
                    playerService.getLeaderboardByTotalCoins();
            return ResponseEntity.ok();
        }

        getLeaderboardByTotalDistance(){
            return ResponseEntity<List<Player>>;

            @GetMapping("/leaderboard/total-distance")
                    playerService.getLeaderboardByTotalDistance();
            return ResponseEntity.ok();
        }




    }



}
