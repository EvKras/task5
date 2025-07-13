package org.example.interfaces;

import org.example.classes.Request;

public interface CustomHandler {
    void setNext(CustomHandler nextCustomHandler);
    void handleRequest(Request request);
}
