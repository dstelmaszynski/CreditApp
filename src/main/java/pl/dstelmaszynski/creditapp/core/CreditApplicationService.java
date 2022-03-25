package pl.dstelmaszynski.creditapp.core;

public class CreditApplicationService {
    public String getDecision (Person person){
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        return calculator.calculate(person) > 300 ? "Congratulations," + person.getName() + " " + person.getLastName() + ", decision is positive"
                : "Sorry," + person.getName() + person.getLastName() +", decision is negative";
    }
}
