package org.example;

import org.example.classes.AscendingSort;
import org.example.classes.DescendingSort;
import org.example.classes.Sorter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Sorter sorter = new Sorter();
        Integer[] array = {7, 2, 9, 4, 0, 1, 5};
        sorter.setStrategy(new AscendingSort());
        sorter.sortData(array);
        sorter.setStrategy(new DescendingSort());
        sorter.sortData(array);
    }
}
