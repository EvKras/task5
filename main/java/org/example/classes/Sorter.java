package org.example.classes;

import org.example.interfaces.SortStrategy;

public class Sorter {

    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortData(Integer[] data) {
        strategy.sort(data);
    }
}
