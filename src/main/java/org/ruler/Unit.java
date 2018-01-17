package org.ruler;

public enum Unit {
    MILE(12 * 3 * 1760), YARD(12 * 3), FEET(12), INCH(1);

    private int value;

    Unit(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
