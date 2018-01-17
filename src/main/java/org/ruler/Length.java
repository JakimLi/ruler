package org.ruler;

class Length {
    protected int value;

    Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && value == ((Length) obj).value;
    }
}
