package com.flipkart.android.proteus;

/**
 * Undefined
 *
 * @author aditya.sharat
 */

public class Undefined extends Value {

    public static final Undefined INSTANCE = new Undefined();

    /**
     * All instances of Undefined have the same hash code since they are indistinguishable
     */
    @Override
    public int hashCode() {
        return Undefined.class.hashCode();
    }

    /**
     * All instances of Undefined are the same
     */
    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof Undefined;
    }
}
