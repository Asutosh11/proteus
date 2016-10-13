package com.flipkart.android.proteus;

import java.util.HashMap;

/**
 * Map
 *
 * @author aditya.sharat
 */

public class Map extends Value {

    private final java.util.Map<String, Value> elements;

    public Map() {
        this.elements = new HashMap<>();
    }

    public Value get(String key) {
        return elements.get(key);
    }

    public void put(String key, Value value) {
        elements.put(key, value);
    }
}
