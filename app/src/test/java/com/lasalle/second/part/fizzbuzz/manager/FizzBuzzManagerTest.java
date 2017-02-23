package com.lasalle.second.part.fizzbuzz.manager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzManagerTest {

    private FizzBuzzManager fizzBuzzManager;

    @Before
    public void setUp() throws Exception {
        fizzBuzzManager = new FizzBuzzManager();
    }

    @Test
    public void writingOnePrintsOne() {
        String result = fizzBuzzManager.getStringValue(1);
        assertEquals("1", result);
    }

    @Test
    public void writtingTwoPrintsTwo() {
        String result = fizzBuzzManager.getStringValue(2);
        assertEquals("2", result);
    }
/*
    @Test
    public void writtingThreePrintsFizz() {
        String result = fizzBuzzManager.getStringValue(3);
        assertEquals("Fizz", result);
    }
    */
}
