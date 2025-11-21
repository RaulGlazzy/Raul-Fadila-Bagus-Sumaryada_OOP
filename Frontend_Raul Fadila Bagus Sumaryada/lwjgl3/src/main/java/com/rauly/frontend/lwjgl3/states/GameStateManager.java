package com.rauly.frontend.lwjgl3.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

import static sun.tools.jconsole.inspector.XDataViewer.dispose;

public class GameStateManager {

    private final Stack<GameState> states;

    public GameStateManager(){
        Stack<GameState> states = new Stack<>();
    }

    push(GameState state){};
    pop(){
        states.dispose();
    }
    set(GameState state){
        states.push(state);
    }

    update(float delta){
        states.peek();
    }

    render(SpriteBatch batch){
    }

}
