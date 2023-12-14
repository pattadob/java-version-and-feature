package org.example.java10;

import java.util.List;

public class LocalTypeVar2 {

    // https://reflectoring.io/java-release-notes/
    // https://docs.oracle.com/en/java/javase/17/language/local-variable-type-inference.html#GUID-D2C58FE6-1065-4B50-9326-57DD8EC358AC
    public void explicitTypes() {
        Person Roland = new Person("Roland", "Deschain");
        Person Susan = new Person("Susan", "Delgado");
        Person Eddie = new Person("Eddie", "Dean");
        Person Detta = new Person("Detta", "Walker");
        Person Jake = new Person("Jake", "Chambers");

        var persons =
                List.of(Roland, Susan, Eddie, Detta, Jake);

        for (var person : persons) {
            System.out.println(person.name + " - " + person.lastname);
        }
    }

    public class Person {
        String name;
        String lastname;

        public Person(String name, String lastname){
            this.name = name;
            this.lastname = lastname;
        }
    }
}
