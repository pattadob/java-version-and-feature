package org.example.java16;

import java.util.List;

    // Static Members of Inner Classes
    // https://docs.oracle.com/en/java/javase/16/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263
public class ContactList {

    record Contact(String name, String number) { }

    public static void main(String[] args) {

        class Task implements Runnable {

            // Record class member, implicitly static,
            // declared in an inner class
            Contact c;

            public Task(Contact contact) {
                c = contact;
            }
            public void run() {
                System.out.println(c.name + ", " + c.number);
            }
        }

        List<Contact> contacts = List.of(
                new Contact("Sneha", "555-1234"),
                new Contact("Raj", "555-2345"));
        contacts.stream()
                .forEach(cont -> new Thread(new Task(cont)).start());
    }
}