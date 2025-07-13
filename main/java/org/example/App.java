package org.example;

import org.example.classes.Print;
import org.example.classes.SimpleProduct;
import org.example.interfaces.Product;

public class App 
{
    public static void main( String[] args )    {
        Product product = new SimpleProduct();
        System.out.println(product.getDescription() + " " + product.getCost());

        product = new Print(product);
        System.out.println(product.getDescription() + " " + product.getCost());
    }
}
