package org.ruler;

class Yard extends Length {

    Yard(int value) {
        super(value);
    }

    @Override
    protected int value() {
        return value;
    }
}
