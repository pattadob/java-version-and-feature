package org.example.java13;

import java.time.Month;

public class SwitchExpression2 {
    public static void main(String[] args) {
        int days = 0;
        Month month = Month.APRIL;

        days = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> throw new IllegalStateException();
        };
    }
}
