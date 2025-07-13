package org.example;

import org.example.classes.Person;

public class App
{
    public static void main( String[] args )    {
        Person person = new Person.Builder("Yauheny", "Krasitski")
                .age(24)
                .phone("+375 33 993-32-00")
                .build();
    }
}
