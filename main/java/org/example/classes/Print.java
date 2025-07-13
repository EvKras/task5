package org.example.classes;

import org.example.interfaces.Product;

public class Print implements Product {
    public Print(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getDescription() {
        return decoratedProduct.getDescription() + ", Print";
    }

    @Override
    public double getCost() {
        return decoratedProduct.getCost() + 7.5;
    }
}
