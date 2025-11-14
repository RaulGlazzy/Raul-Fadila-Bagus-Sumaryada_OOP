package observers;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ScoreManager {
    List<Observer> observers = new List<Observer>();
    int score = 0;


    public ScoreManager(){
        observers = new ArrayList<>(0);
    }
}

public void addObservers(Observer observers){}
public void removeObservers(Observer observers){}
public void notifyObservers(Observer observers){
    updateScore();
}
public void setScore(int newScore){
    int score = newScore;
    notifyObservers(score);
}
public getScore(){
    return int score;
}










