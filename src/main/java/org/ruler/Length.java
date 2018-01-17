package org.ruler;

import static org.ruler.Unit.FEET;
import static org.ruler.Unit.INCH;
import static org.ruler.Unit.MILE;
import static org.ruler.Unit.YARD;

class Length {
    private int value;
    private Unit unit;

    private Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length mile(int value) {
        return new Length(value, MILE);
    }

    public static Length yard(int value) {
        return new Length(value, YARD);
    }

    public static Length feet(int value) {
        return new Length(value, FEET);
    }

    public static Length inch(int value) {
        return new Length(value, INCH);
    }

    @Override
    public boolean equals(Object obj) {
        Length that = (Length) obj;
        return obj != null && this.value * this.unit.value() == that.value * that.unit.value();
    }
}
