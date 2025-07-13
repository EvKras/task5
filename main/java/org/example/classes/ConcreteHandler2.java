package org.example.classes;

import org.example.interfaces.CustomHandler;

public class ConcreteHandler2 implements CustomHandler {
    private CustomHandler nextHandler;

    @Override
    public void setNext(CustomHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("handling request TYPE2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("handling error");
        }
    }
}
