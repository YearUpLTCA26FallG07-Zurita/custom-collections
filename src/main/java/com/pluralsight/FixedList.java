package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;
    private int counter;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }
    public void add(T item){
        if (counter < maxSize) {
            items.add(item);
            counter++;
            System.out.printf("Item added. (%d / %d)\n", counter, maxSize);
        } else {
            System.out.println("ERROR: Maximum list capacity reached.");
        }
    }
}
