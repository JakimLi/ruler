package org.ruler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MileTest {

    @Test
    public void three_mile_should_equals_three_mile() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }
}
