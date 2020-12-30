package com.buyalskaya.task1;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.startsWith;

public class StringUtils {
    private static final String MINUS = "-";

    public static boolean isPositiveNumber(String str) {
        return isNumeric(str) && !startsWith(str,MINUS);
    }
}