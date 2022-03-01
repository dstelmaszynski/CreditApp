package pl.dstelmaszynski.creditapp;

import pl.dstelmaszynski.creditapp.client.ConsoleReader;
import pl.dstelmaszynski.creditapp.core.Person;

public class Main {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        Person person = consoleReader.readInputParameters();
        System.out.println("Hello, " + person.getName() + " " + person.getLastName() + "!");
    }
}
