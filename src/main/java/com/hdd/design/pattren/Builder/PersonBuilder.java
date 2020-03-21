package com.hdd.design.pattren.Builder;



public abstract class PersonBuilder {
    protected Group g;
    protected Pen p;

    public PersonBuilder(Group g, Pen p) {
        this.g = g;
        this.p = p;
    }

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
}
