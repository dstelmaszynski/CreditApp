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

        System.out.println("Enter total monthly income in PLN:");
        int totalMonthlyIncome = input.nextInt();

        System.out.println("Are you married:");
        boolean married = input.nextBoolean();

        System.out.println("Enter number of family dependants:");
        int numOfFamilyDependants = input.nextInt();

        return new Person(name, lastName, mothersMaidenName, totalMonthlyIncome, married, numOfFamilyDependants);
    }
}
