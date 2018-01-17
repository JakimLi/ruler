package org.ruler;

class Mile extends Length {

    Mile(int value) {
        super(value);
    }

    @Override
    protected int value() {
        return 1760 * this.value;
    }
}
