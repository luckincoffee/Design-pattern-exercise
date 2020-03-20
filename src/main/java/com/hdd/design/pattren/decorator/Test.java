package com.hdd.design.pattren.decorator;

public class Test {
    public static void main(String[] args) {
//        Person xc = new Person("小溪");
//        xc.WearTShirts();
//        xc.WearBigTrouser();
//        xc.WearSneakers();
//        xc.Show();
//
//        xc.WearSuit();
//        xc.WearTie();
//        xc.WearLeatherShoes();
//        xc.Show();

//        NewPerson xc = new NewPerson("小菜");
//        Finery dtx = new Tshirt();
//        Finery kk = new BigTrouser();
//        Finery pqx = new Sneakers();
//
//        dtx.Show();
//        kk.Show();
//        pqx.Show();
//        xc.Show();

        NewPerson2 xc = new NewPerson2("小菜");
        NewBigTrouser newBigTrouser = new NewBigTrouser();
        NewTie newTie = new NewTie();
        NewTShirts newTShirts = new NewTShirts();

        newBigTrouser.Decorate(xc);
        newTie.Decorate(newBigTrouser);
        newTShirts.Decorate(newTie);

        newTShirts.Show();

    }
}
