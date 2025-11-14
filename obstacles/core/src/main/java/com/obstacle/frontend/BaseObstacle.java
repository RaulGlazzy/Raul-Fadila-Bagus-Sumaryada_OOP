package com.obstacle.frontend;


import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class BaseObstacle {

    public Vector2 position;
    private Rectangle collider;
    private float length;
    private final float WIDTH = 10f;
    boolean active;
}

public BaseObstacle(Vector2 startPosition, int length){
    Vector2 startPosition = 0;
    length = 0;
    updateCollider();

}


public void initialize(Vector2 startPosition, int length){
    position = new Vector2(updateCollider());
}

public void render(ShapeRenderer shapeRenderer){

    drawShape(shapeRenderer);
}

isColliding(Rectangle playerCollider){

}

public isActive(){
    return boolean;
}

public isOffScreenCamera(float cameraLeftEdge){
    if(){

    }
}

public abstract void updateCollider(){

}

public abstract void drawShape(ShapeRenderer shapeRenderer){

}

public abstract void getRenderWidth(){
    return float;
}

public getPosition(){
    return Vector2 position;
}


