package com.hdd.design.pattren.decorator;

public class NewPerson2 {
    private String name;

    public NewPerson2(String name) {
        this.name = name;
    }

    public NewPerson2() {
    }

    public void Show() {
        System.out.println("装扮的" + name);
    }
}
