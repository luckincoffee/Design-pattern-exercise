package com.hdd.design.pattren.Builder;


public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Group g, Pen p) {
        super(g, p);
    }

    @Override
    public void BuildHead() {
        System.out.println("画头");
    }

    @Override
    public void BuildBody() {
        System.out.println("画身体");
    }

    @Override
    public void BuildArmLeft() {
        System.out.println("画左胳膊");
    }

    @Override
    public void BuildArmRight() {
        System.out.println("画右胳膊");
    }

    @Override
    public void BuildLegLeft() {
        System.out.println("左大腿");
    }

    @Override
    public void BuildLegRight() {
        System.out.println("右大腿");
    }
}
