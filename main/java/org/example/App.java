package org.example;

import org.example.classes.ConcreteHandler1;
import org.example.classes.ConcreteHandler2;
import org.example.classes.Request;
import org.example.classes.RequestType;
import org.example.interfaces.CustomHandler;

public class App
{
    public static void main( String[] args )    {
        CustomHandler handler1 = new ConcreteHandler1();
        CustomHandler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        Request request1 = new Request(RequestType.TYPE1);
        handler1.handleRequest(request1);
        Request request2 = new Request(RequestType.TYPE2);
        handler1.handleRequest(request2);
        Request request3 = new Request(RequestType.TYPE3);
        handler1.handleRequest(request3);
    }
}
