package com;

import java.util.ArrayList;

public class GameManager {

    private com.nama.frontend.services.BackendService backendService;
    private String currentPlayerId = null;
    private int coinsCollected = 0;

    private GameManager(){
        backendService = new com.nama.frontend.services.BackendService(0);
    }

    public registerPlayer(String username){
        backendService.createPlayer username = new com.nama.frontend.services.BackendService.RequestCallBack();
    }

    public startGame(){

    }

    public addCoin(){}

    public getCoins(){
        return coinsCollected;
    }
}
