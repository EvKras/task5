package org.example.classes;

import org.example.interfaces.FileIF;

public class ProxyFile implements FileIF {
    private String filename;
    private RealFile realFile;

    public ProxyFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realFile == null) {
            realFile = new RealFile(filename);
        }
        realFile.display();
    }
}
