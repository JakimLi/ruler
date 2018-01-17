package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardTest {

    @Test
    public void three_yard_should_equals_three_yard() throws Exception {
        assertEquals(new Yard(3), new Yard(3));
    }

    @Test
    public void three_yard_should_not_equal_to_four_yard() throws Exception {
        assertNotEquals(new Yard(3), new Yard(4));
        assertNotEquals(new Yard(3), new Yard(2));
    }

    @Test
    public void three_yard_not_equal_to_null() throws Exception {
        assertNotEquals(new Yard(3), null);
    }

    @Test
    public void null_not_equal_to_three_yard() throws Exception {
        assertNotEquals(null, new Yard(3));
    }
}
