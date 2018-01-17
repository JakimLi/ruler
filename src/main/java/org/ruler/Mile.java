package org.ruler;

class Mile {
    private int value;

    Mile(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value == ((Mile) obj).value;
    }
}
