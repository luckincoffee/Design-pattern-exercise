package com.hdd.design.pattren.Builder;

public class ConcreteBuilder1 extends Builder {
    private  Product product = new Product();
    @Override
    public void BuildPartA() {
        product.Add("零件A");
    }

    @Override
    public void BuildPartB() {
        product.Add("零件B");
    }

    @Override
    public Product GetReRult() {
        return product;
    }
}
