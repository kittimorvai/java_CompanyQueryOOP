package academy.learnprogramming;

import java.util.ArrayList;

public class Person {
    private final String nameOfPerson;
    private ArrayList<String> companiesOfPerson;


    public Person (String nameOfPerson){
        this.nameOfPerson = nameOfPerson;
        companiesOfPerson = new ArrayList<>();
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public ArrayList<String> getCompaniesOfPerson() {
        return companiesOfPerson;
    }
    public void addCompanyToPerson (String nameOfCompany){
        companiesOfPerson.add(nameOfCompany);
    }
    public static Person createPerson (String name){
        return new Person(name);
    }
    public void printCompaniesOfPerson(){
        for (int i = 0; i < companiesOfPerson.size(); i++){
            System.out.println(companiesOfPerson.get(i));
        }
    }
}
