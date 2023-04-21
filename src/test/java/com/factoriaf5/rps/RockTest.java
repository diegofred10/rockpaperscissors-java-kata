package com.factoriaf5.rps;

import org.junit.Test;

public class RockTest {



    @Test
    public void test_is_a_rock() {
        Rock rock = new Rock();
        assertTrue (rock instanceof Rock); //Rock.class
        assertEquals (expected: "Rock", rock. getType());
    }
    
}
