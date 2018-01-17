package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {

    @Test
    public void one_mile_equals_1760_yard() throws Exception {
        assertEquals(new Mile(1), new Yard(1760));
    }

    @Test
    public void one_mile_not_equal_1761_yard() throws Exception {
        assertNotEquals(new Mile(1), new Yard(1761));
    }
}
