package org.example.classes;

import org.example.interfaces.FileIF;

public class RealFile  implements FileIF {
    private String filename;

    public RealFile(String filename) {
        this.filename = filename;
        loadFileFromDisk();
    }

    private void loadFileFromDisk() {
        System.out.println("loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("displaing " + filename);
    }
}
