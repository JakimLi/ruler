package org.ruler;

class Yard {
    private int value;

    Yard(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return value == ((Yard) obj).value;
    }
}
