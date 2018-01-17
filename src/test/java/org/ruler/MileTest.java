package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MileTest {

    @Test
    public void three_mile_should_equals_three_mile() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }

    @Test
    public void three_mile_should_not_equal_to_four_mile() throws Exception {
        assertNotEquals(new Mile(3), new Mile(4));
        assertNotEquals(new Mile(3), new Mile(2));
    }

    @Test
    public void three_mile_not_equal_to_null() throws Exception {
        assertNotEquals(new Mile(3), null);
    }

    @Test
    public void null_not_equal_to_three_mile() throws Exception {
        assertNotEquals(null, new Mile(3));
    }
}
