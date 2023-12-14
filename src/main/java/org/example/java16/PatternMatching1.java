package org.example.java16;

import java.util.Calendar;

public class PatternMatching1 {
    public static double priceOld(Vehicle v) {
        if (v instanceof Car) {
            Car c = (Car) v;
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle) {
            Bicycle b = (Bicycle) v;
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
