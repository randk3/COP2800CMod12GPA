// DataWrapper.java
// Kristina Randolph
// 04-12-2026
// Generic wrapper class for storing and displaying data objects

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {

    private T value;

    public DataWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            System.out.println(element.getValue());
        }
    }
}