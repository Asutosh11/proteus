package com.flipkart.android.proteus;

import java.util.ArrayList;
import java.util.List;

/**
 * Array
 *
 * @author aditya.sharat
 */

public class Array extends Value {

    private final List<Value> elements;

    public Array() {
        this.elements = new ArrayList<>();
    }

    public Value get(int i) {
        return elements.get(i);
    }

    public int size() {
        return elements.size();
    }
}
