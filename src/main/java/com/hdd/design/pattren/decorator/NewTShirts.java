package com.hdd.design.pattren.decorator;

public class NewTShirts extends NewFinery2 {
    @Override
    public void Show() {
        System.out.println("穿大T恤");
        super.Show();
    }
}
