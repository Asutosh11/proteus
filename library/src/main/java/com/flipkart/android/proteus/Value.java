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

    public boolean isNull() {
        return this instanceof Null;
    }

    public boolean isUndefined() {
        return this instanceof Undefined;
    }

    public Primitive getAsPrimitve() {
        if (isPrimitive()) {
            return (Primitive) this;
        }
        throw new IllegalStateException("This is not a Primitive.");
    }

    public Array getAsArray() {
        if (isArray()) {
            return (Array) this;
        }
        throw new IllegalStateException("This is not a Array.");
    }

    public Map getAsMap() {
        if (isMap()) {
            return (Map) this;
        }
        throw new IllegalStateException("This is not a Map.");
    }

    public Layout getAsLayout() {
        if (isLayout()) {
            return (Layout) this;
        }
        throw new IllegalStateException("This is not a Layout.");
    }
}
