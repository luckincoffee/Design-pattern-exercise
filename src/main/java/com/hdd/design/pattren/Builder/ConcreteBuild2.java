package com.hdd.design.pattren.Builder;

public class ConcreteBuild2 extends Builder {
    private  Product product = new Product();
    @Override
    public void BuildPartA() {
        product.Add("零件X");
    }

    @Override
    public void BuildPartB() {
        product.Add("零件xx");
    }

    @Override
    public Product GetReRult() {
        return product;
    }
}
