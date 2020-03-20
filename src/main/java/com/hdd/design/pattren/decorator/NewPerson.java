package com.hdd.design.pattren.decorator;

public class NewPerson {
    private String name;

    public NewPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Show() {
        System.out.println("装扮的" + name);
    }
}
