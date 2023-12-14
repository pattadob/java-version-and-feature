package org.example.java13;

import java.time.DayOfWeek;
import java.time.Month;

public class SwitchExpression4 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;

        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            default      -> {
                String s = day.toString();
                int result = s.length();
                yield result;
            }
        };
    }
}
