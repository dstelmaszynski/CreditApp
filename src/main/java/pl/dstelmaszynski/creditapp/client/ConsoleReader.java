package pl.dstelmaszynski.creditapp.client;

import pl.dstelmaszynski.creditapp.core.Person;

import java.util.Scanner;

public class ConsoleReader {
    public Person readInputParameters(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Enter your mother's maiden name:");
        String mothersMaidenName = input.next();

        return new Person(name, lastName, mothersMaidenName);
    }
}
