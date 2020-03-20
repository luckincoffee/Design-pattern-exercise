package com.hdd.design.pattren.decorator;

public class NewTie extends NewFinery2 {
    @Override
    public void Show() {
        System.out.println("领带");
        super.Show();
    }
}
