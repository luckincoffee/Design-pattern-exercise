package com.hdd.design.pattren.decorator;

public class NewBigTrouser extends NewFinery2 {
    @Override
    public void Show() {
        System.out.println("穿垮裤");
        super.Show();
    }
}
