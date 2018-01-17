package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FeetTest {

    @Test
    public void three_feet_should_equals_three_feet() throws Exception {
        assertEquals(new Feet(3), new Feet(3));
    }

    @Test
    public void three_feet_should_not_equal_to_four_feet() throws Exception {
        assertNotEquals(new Feet(3), new Feet(4));
        assertNotEquals(new Feet(3), new Feet(2));
    }

    @Test
    public void three_feet_not_equal_to_null() throws Exception {
        assertNotEquals(new Feet(3), null);
    }

    @Test
    public void null_not_equal_to_three_feet() throws Exception {
        assertNotEquals(null, new Feet(3));
    }
}
