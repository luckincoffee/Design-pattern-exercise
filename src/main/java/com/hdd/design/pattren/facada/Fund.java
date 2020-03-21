package com.hdd.design.pattren.facada;

import java.util.logging.SocketHandler;

public class Fund {
    Stock stock;
    Stock2 stock2;
    Stock3 stock3;

    NationalDebt1 nd1;
    Realty1 rt1;

    public Fund() {
        stock = new Stock();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nd1 = new NationalDebt1();
        rt1 = new Realty1();
    }

    public void BuyFund() {
        stock.Buy();
        stock2.Buy();
        stock3.Buy();
        nd1.Buy();
        rt1.Buy();
    }

    public void SellFund() {
        stock.Sell();
        stock2.Sell();
        stock3.Sell();
        nd1.Sell();
        rt1.Sell();
    }
}
