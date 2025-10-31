package com.rauly.frontend;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class Ground {

    private Rectangle collider;
    private static final float GROUND_HEIGHT = 50f;

    public Ground(){
     collider =  new Rectangle(0f, 0f, Gdx.graphics.getWidth());

    }


    public void update(float cameraX){


    }

    public boolean isColliding(Rectangle playerCollider){

        return collider.overlaps(playerCollider);
    }

    public float getTopY(){
        return GROUND_HEIGHT;
    }

    void renderShape(ShapeRenderer shapeRenderer){
        shapeRenderer = new ShapeRenderer(gray, 0.5f, 0.5f);

    }
}
