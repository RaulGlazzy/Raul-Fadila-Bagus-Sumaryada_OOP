package observers;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static java.awt.Color.white;

public class ScoreUIObserver {
    private BitmapFont font;
    private SpriteBatch batch;

    public ScoreUIObserver(){
        font = new BitmapFont(white);
        batch = new SpriteBatch();

    }

}

public void update(int score){}
public void render(int score){
    System.out.println("Score: ");
}
public void dispose(){}

