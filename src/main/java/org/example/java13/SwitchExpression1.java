package org.example.java13;

import java.time.Month;

public class SwitchExpression1 {

    public static void main(String[] args) {
        int days = 0;
        Month month = Month.APRIL;

        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER :
                days = 31;
                break;
            case FEBRUARY :
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER :
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }
    }
}
