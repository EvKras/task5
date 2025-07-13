package org.example;

import org.example.classes.ProxyFile;
import org.example.interfaces.FileIF;


public class App 
{
    public static void main( String[] args )    {
        FileIF file = new ProxyFile("test.file");
        file.display();
    }
}
