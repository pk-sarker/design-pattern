/**
 * 
 */
package com.dp.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pijus
 *
 */
public class Bug {
    private List<Observer> observers = new ArrayList<Observer>();
    private String bugNumber;

    public String getBugNumber() {
        return bugNumber;
    }

    public void setBugNumber(String bugNumber) {
        this.bugNumber = bugNumber;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
