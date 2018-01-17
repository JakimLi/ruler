package org.ruler;

class Length {
    protected int value;

    Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this instanceof Mile && obj instanceof Yard) {
            return this.value * 1760 == ((Yard) obj).value;
        }
        return obj != null && value == ((Length) obj).value;
    }
}
