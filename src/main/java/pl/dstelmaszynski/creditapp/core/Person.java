package pl.dstelmaszynski.creditapp.core;

public class Person {
    private final String name;
    private final String lastName;
    private final String mothersMaidenName;
    private double totalMonthlyIncome;
    private boolean married;
    private int numOfFamilyDependants;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public double getTotalMonthlyIncome() {
        return totalMonthlyIncome;
    }

    public boolean isMarried() {
        return married;
    }

    public int getNumOfFamilyDependants() {
        return numOfFamilyDependants;
    }

    public Person(String name, String lastName, String mothersMaidenName, double totalMonthlyIncome, boolean married, int numOfFamilyDependants) {
        this.name = name;
        this.lastName = lastName;
        this.mothersMaidenName = mothersMaidenName;
        this.totalMonthlyIncome = totalMonthlyIncome;
        this.married = married;
        this.numOfFamilyDependants = numOfFamilyDependants;


    }
}
