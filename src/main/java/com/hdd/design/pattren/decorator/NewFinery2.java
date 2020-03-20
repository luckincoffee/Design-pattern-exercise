package com.hdd.design.pattren.decorator;

public class NewFinery2 extends NewPerson2 {
    protected NewPerson2 component;
    public void  Decorate(NewPerson2 component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if (component != null) {
            component.Show();
        }
    }
}
