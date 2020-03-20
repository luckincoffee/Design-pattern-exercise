package com.hdd.design.pattren.decorator;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void WearTShirts() {
        System.out.println("大T恤");
    }
    public void WearBigTrouser() {
        System.out.println("垮裤");
    }
    public void WearSneakers() {
        System.out.println("破球鞋");
    }
    public void WearSuit() {
        System.out.println("西装");
    }
    public void WearTie() {
        System.out.println("领带");
    }
    public void WearLeatherShoes() {
        System.out.println("皮带");
    }

    public void Show() {
        System.out.println("装扮的" + name);
    }
}

