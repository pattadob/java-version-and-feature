package org.example.java13;

import java.time.Month;

    // https://docs.oracle.com/en/java/javase/14/language/switch-expressions.html#GUID-BA4F63E3-4823-43C6-A5F3-BAA4A2EF3ADC
public class SwitchExpression3 {
    public static void main(String[] args) {
        int days = 0;
        Month month = Month.APRIL;

        days = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
                System.out.println(month);
                yield 31;
            }
            case FEBRUARY -> {
                System.out.println(month);
                yield 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                System.out.println(month);
                yield 30;
            }
            default -> throw new IllegalStateException();
        };
    }
}
