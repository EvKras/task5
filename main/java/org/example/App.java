package org.example;

import org.example.classes.TxtToYamlAdapter;
import org.example.innterfaces.DataConverter;

import java.io.BufferedReader;
import java.io.StringReader;

public class App {
    public static void main(String[] args) {
        String txtData = "name=Yauheni Krasitski\n" +
                "age=24\n" +
                "city=Vitebsk";

        BufferedReader reader = new BufferedReader(new StringReader(txtData));
        DataConverter adapter = new TxtToYamlAdapter(reader);
        String yamlData = adapter.convertData(txtData);

        if (yamlData != null) {
            System.out.println(yamlData);
        }
    }
}
