package com.rauly.frontend.lwjgl3;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import static java.awt.Color.yellow;

public class Coin {
    Vector2 position;
    Rectangle collider;
    float radius = 15f;
    boolean active;
    float bobOffset;
    float bobSpeed;

    public Coin(){
        Vector2 startPosition;
    }

    public update(float delta){
        bobOffset = bobSpeed * delta;
    }

    renderShape(ShapeRenderer shapeRenderer){
        drawY = position.y + (float)(Math.sin(bobOffset) * 5f);
        shapeRenderer.circle(yellow);
        setColor(1f, 1f, 0f, 1f);
        return;
    }

    public void isColliding(Rectangle playerCollider){
        if(active = true){
            return active;
        }

    }


}
