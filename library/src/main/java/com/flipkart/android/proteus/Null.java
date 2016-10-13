package com.flipkart.android.proteus;

/**
 * Null
 *
 * @author aditya.sharat
 */

public class Null extends Value {

    public static final Null INSTANCE = new Null();

    /**
     * All instances of Null have the same hash code since they are indistinguishable
     */
    @Override
    public int hashCode() {
        return Null.class.hashCode();
    }

    /**
     * All instances of Null are the same
     */
    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof Null;
    }
}
