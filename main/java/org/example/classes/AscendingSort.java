package org.example.classes;

import org.example.interfaces.SortStrategy;

import java.util.Arrays;

public class AscendingSort implements SortStrategy {
    @Override
    public void sort(Integer[] data) {
        Arrays.sort(data);
    }
}
