package com.hdd.design.pattren.observer;

public class Test {
    public static void main(String[] args) {
        Secretary tongzizhe = new Secretary();

        StockObserver tongshi1 = new StockObserver("围观女", tongzizhe);
        StockObserver tongshi2 = new StockObserver("牛掰格拉斯", tongzizhe);

        tongzizhe.Attach(tongshi1);
        tongzizhe.Attach(tongshi2);

        tongzizhe.setSecretaryAction("王老板回来了!");

        tongzizhe.Notify();
    }
}
