package pl.dstelmaszynski.creditapp;

import pl.dstelmaszynski.creditapp.client.ConsoleReader;
import pl.dstelmaszynski.creditapp.core.CreditApplicationService;
import pl.dstelmaszynski.creditapp.core.Person;

public class Main {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        Person person = consoleReader.readInputParameters();

        CreditApplicationService creditApplicationService = new CreditApplicationService();
        String decision = creditApplicationService.getDecision(person);

        System.out.println(decision);

    }
}
