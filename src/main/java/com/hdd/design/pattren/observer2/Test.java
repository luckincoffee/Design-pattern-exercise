package com.hdd.design.pattren.observer2;

public class Test {
    public static void main(String[] args) {
        Boss huhansan = new Boss();

        StockObserver xw = new StockObserver("小王", huhansan);
        huhansan.Attach(xw);
        huhansan.setAction("我胡汉三回来了");
        huhansan.Notify();

    }
}
