package org.ruler;

abstract class Length {
    protected int value;

    Length(int value) {
        this.value = value;
    }

    abstract protected int value();

    @Override
    public boolean equals(Object obj) {
        Length that = (Length) obj;
        return obj != null && value * this.value() == that.value * that.value();
    }
}
