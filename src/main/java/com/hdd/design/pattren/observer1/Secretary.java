package com.hdd.design.pattren.observer1;

import java.util.ArrayList;

public class Secretary {
    private ArrayList<Observer> observers = new ArrayList();
    private String action;

    public void Attach(Observer observer) {
        observers.add(observer);
    }

    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知
    public void Notify() {
        for (Observer obs : observers) {
            obs.Update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
