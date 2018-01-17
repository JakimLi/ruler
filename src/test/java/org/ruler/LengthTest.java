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

    @Test
    public void test_1760_yard_equals_1_mile() throws Exception {
        assertEquals(new Yard(1760), new Mile(1));
    }

    @Test
    public void test_1761_yard_not_equals_1_mile() throws Exception {
        assertNotEquals(new Yard(1761), new Mile(1));
    }

    @Test
    public void one_yard_equals_three_feet() throws Exception {
        assertEquals(new Yard(1), new Feet(3));
    }

    @Test
    public void one_feet_equals_12_inch() throws Exception {
        assertEquals(new Feet(1), new Inch(12));
    }
}
