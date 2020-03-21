package com.hdd.design.pattren.observer2;


public abstract class Subject {
    protected abstract void Attach(Observer observer);
    protected abstract void Detash(Observer observer);
    protected abstract void Notify();
    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
