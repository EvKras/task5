package org.example.classes;

import org.example.interfaces.SortStrategy;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort implements SortStrategy {
    @Override
    public void sort(Integer[] data) {
        Arrays.sort(data, Collections.reverseOrder());
    }
}
