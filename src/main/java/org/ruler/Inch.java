package org.ruler;

class Inch extends Length {
    Inch(int value) {
        super(value);
    }

    @Override
    protected int value() {
        return value;
    }
}
