package com.flipkart.android.proteus;

import java.util.List;

/**
 * Layout
 *
 * @author aditya.sharat
 */

public class Layout extends Value {

    private int type;
    private List<Value> attributes;

    int getType() {
        return this.type;
    }

    public List<Value> getAttributes() {
        return attributes;
    }

}
