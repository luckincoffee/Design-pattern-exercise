package com.hdd.design.pattren.observer;

import java.util.ArrayList;

public class Secretary {
    private ArrayList<StockObserver> observers = new ArrayList();
    private String action;

    public void Attach(StockObserver observer) {
        observers.add(observer);
    }

    // 通知
    public void Notify() {
        for (StockObserver st: observers) {
            st.Update();
        }
    }

    // 前台状态
    public String getSecretaryAction() {
        return action;
    }

    public void setSecretaryAction(String secretaryAction) {
        action = secretaryAction;
    }

}
