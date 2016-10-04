package com.flipkart.android.proteus;

/**
 * Layout
 *
 * @author aditya.sharat
 */

public class Layout extends Value {

    private int type;
    private Value[] attributes;

    int getType() {
        return this.type;
    }

    Value get(int attribute) {
        return this.attributes[attribute];
    }

}
