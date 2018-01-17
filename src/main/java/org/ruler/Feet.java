package org.ruler;

class Feet extends Length {
    Feet(int value) {
        super(value);
    }

    @Override
    protected int value() {
        return 12 * value;
    }
}
