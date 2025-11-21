package com.rauly.frontend.lwjgl3;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Background {
     Texture backgroundTexture;
    private TextureRegion backgroundRegion;
    private float width;
    private float height;
    private float currentCameraX = 0f;

    public Background(){

        this.width = 2688f;
        this.height = 1536f;
    }


}

public void update(float cameraX){}
public void render(SpriteBatch batch){
    getscreenSize(width , height);
}

public void dispose(){
    if(backgroundTexture != NULL){
    System.out.println("Background" + backgroundTexture)
    }
    else {

    }
}


