package factories;

import pools.CoinPool;

import java.util.Random;

import static java.lang.Math.random;

public class CoinFactory {
    private CoinPool coinPool;
    private Random random;

    public createCoinPattern(float spawnX, float groundTopY){
        if(random >= 0.3){
            coinPool.obtain;
            coinPool.obtain;
            coinPool.obtain;
        };
    }

    public void getActiveCoins(){}
    public void releaseCoin(){}
}
