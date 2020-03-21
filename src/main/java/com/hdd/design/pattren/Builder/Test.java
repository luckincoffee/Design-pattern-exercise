package com.hdd.design.pattren.Builder;


public class Test {
    public static void main(String[] args) {
//        Pen p = new Pen();
//        Group g = new Group();
//        PersonBuilder ptb = new PersonThinBuilder(g, p);
//        PersonDirector personDirector = new PersonDirector(ptb);
//        personDirector.createPerson();

        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuild2();

        director.Construct(b1);
        Product p1 = b1.GetReRult();
        p1.Show();

        director.Construct(b2);
        Product p2 = b2.GetReRult();
        p2.Show();
    }
}

