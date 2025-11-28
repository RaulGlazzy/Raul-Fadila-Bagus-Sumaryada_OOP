package pools;

import com.badlogic.gdx.math.Vector2;
import com.rauly.frontend.lwjgl3.Coin;

public class CoinPool extends ObjectPool<Coin>{

    public createObject(){
        return newCoin(new Vector2(0,0));
    }

    public resetObject(){
        coin.setActive(false);
    }

    public obtain(float x, float y){
        float x, y = 0;
        super.obtain();
        return coin;
    }

}
