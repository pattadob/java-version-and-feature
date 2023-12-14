package org.example.java16;

import java.util.Calendar;

public class PatternMatching2 {
    public static double priceOld(Vehicle v) {
        if (v instanceof Car c) {
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

    class Bicycle extends Vehicle{
        float wheelSize;
    }

    class Car extends Vehicle{
        int year;
    }

    class Vehicle{
        float kilomenters;
    }
}
