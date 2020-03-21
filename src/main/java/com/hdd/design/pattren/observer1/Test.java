package com.hdd.design.pattren.observer1;

public class Test {
    public static void main(String[] args) {
        Secretary mishu = new Secretary();
        StockObserver stockObserver = new StockObserver("围观女", mishu);
        NBAObserver nbaObserver = new NBAObserver("小王", mishu);
        mishu.Attach(stockObserver);
        mishu.Attach(nbaObserver);
        mishu.setAction("王老板回来");
        mishu.Notify();
    }
}
