package com.buyalskaya.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberPositiveTest() {
        boolean isPositive = StringUtils.isPositiveNumber("7");

        assertTrue(isPositive);
    }

    @Test
    public void isPositiveNumberNegativeTest() {
        boolean isPositive = StringUtils.isPositiveNumber("-7");

        assertFalse(isPositive);
    }
}

