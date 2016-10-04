package com.flipkart.android.proteus;

/**
 * Value
 *
 * @author aditya.sharat
 */

public abstract class Value {

    public boolean isArray() {
        return this instanceof Array;
    }

    public boolean isLayout() {
        return this instanceof Layout;
    }

    public boolean isPrimitive() {
        return this instanceof Primitive;
    }

    public boolean isMap() {
        return this instanceof Map;
    }
}
