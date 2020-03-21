package com.hdd.design.pattren.Builder;

public class Director {
    public void Construct(Builder builder) {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
