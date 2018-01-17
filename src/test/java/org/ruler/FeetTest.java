package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.ruler.Length.feet;

public class FeetTest {

    @Test
    public void three_feet_should_equals_three_feet() throws Exception {
        assertEquals(feet(3), feet(3));
    }

    @Test
    public void three_feet_should_not_equal_to_four_feet() throws Exception {
        assertNotEquals(feet(3), feet(4));
        assertNotEquals(feet(3), feet(2));
    }

    @Test
    public void three_feet_not_equal_to_null() throws Exception {
        assertNotEquals(feet(3), null);
    }

    @Test
    public void null_not_equal_to_three_feet() throws Exception {
        assertNotEquals(null, feet(3));
    }
}
