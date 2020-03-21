package com.hdd.design.pattren.observer2;

import java.util.ArrayList;

public class Boss extends Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void Attach(Observer observer) {
        observers.add(observer);
    }
    public void Detash(Observer observer) {
        observers.remove(observer);
    }
    public void Notify() {
        for (Observer obs: observers
             ) {
            obs.Update();
        }
    }
}
