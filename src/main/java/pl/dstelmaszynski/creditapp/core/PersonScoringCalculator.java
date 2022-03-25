package pl.dstelmaszynski.creditapp.core;

public class PersonScoringCalculator {
    public int calculate (Person person){
        int scoreIfMarried = person.isMarried() ? 100 : 0;
        double scoreFromFamilyMembers = (person.getTotalMonthlyIncome() / person.getNumOfFamilyDependants());
        int totalscore = scoreIfMarried + (((int) scoreFromFamilyMembers / 1000) * 100);
        return totalscore;
    }
}
