package org.example.java10;

import java.util.List;

public class LocalTypeVar1 {
    public void explicitTypes() {
        Person Roland = new Person("Roland", "Deschain");
        Person Susan = new Person("Susan", "Delgado");
        Person Eddie = new Person("Eddie", "Dean");
        Person Detta = new Person("Detta", "Walker");
        Person Jake = new Person("Jake", "Chambers");

        List<Person> persons =
                List.of(Roland, Susan, Eddie, Detta, Jake);

        for (Person person : persons) {
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
