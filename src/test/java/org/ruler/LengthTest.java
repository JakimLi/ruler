package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test
    public void one_mile_equals_1760_yard() throws Exception {
        assertEquals(new Mile(1), new Yard(1760));
    }
}
