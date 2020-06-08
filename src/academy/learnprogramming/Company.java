package academy.learnprogramming;

import java.util.ArrayList;

public class Company {
    private final String nameOfCompany;
    private final String country;
    private ArrayList<Person> personsInCompany;


    public Company (String nameOfCompany, String country){
        this.nameOfCompany = nameOfCompany;
        this.country = country;
        personsInCompany = new ArrayList<>();

    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getCountry() {
        return country;
    }

    public static Company createNewCompany (String name, String country){
        return new Company(name, country);
    }
    public void addPersonsToCompany (Person person){
        personsInCompany.add(person);
    }
    public void addCompanyToPersonPosition (String nameOfCompany, String nameOfPerson){
        int positionOfPerson = findPersonPosition(nameOfPerson);
        personsInCompany.get(positionOfPerson).addCompanyToPerson(nameOfCompany);
    }
    public void printPersonsInCompany (){
        for (int i = 0; i < personsInCompany.size(); i++){
            System.out.println(personsInCompany.get(i).getNameOfPerson());
        }
    }
    public int findPersonPosition (String nameOfPerson){
        for (int i = 0; i < personsInCompany.size(); i++){
            if (personsInCompany.get(i).getNameOfPerson().equals(nameOfPerson)){
                return i;
            }
        }
        return -1;
    }

}
