package org.example.classes;

import org.example.interfaces.Product;

public class SimpleProduct implements Product {
    @Override
    public String getDescription() {
        return "cup";
    }

    @Override
    public double getCost() {
        return 35.76;
    }
}
