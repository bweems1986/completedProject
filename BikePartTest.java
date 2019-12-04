package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikePartTest {

    @Test
    public void testSerialize() {
        BikePart testPart = new BikePart("testPart", 1234567890,
                23.39, 19.57, false, 35, 5);
        String serialized = testPart.Serialize();
        String expected = "testPart,1234567890,23.39,19.57,false,35,5\n";
        assertEquals(expected, serialized);
    }
}
