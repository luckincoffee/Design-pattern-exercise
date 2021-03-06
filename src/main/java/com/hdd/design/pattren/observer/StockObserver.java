package com.hdd.design.pattren.observer;

public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void Update() {
        System.out.println(sub.getSecretaryAction() + name + "关闭股票行情，继续干活！");
    }
}
