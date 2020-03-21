package com.hdd.design.pattren.observer2;

public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println(sub.getAction() + name + "关闭股票行情，继续工作");
    }
}
