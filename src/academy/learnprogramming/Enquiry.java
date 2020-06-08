package academy.learnprogramming;

import java.util.ArrayList;

public class Enquiry {
    private ArrayList<Company> allCompanies;
    private ArrayList<Person> allPersons;

    public Enquiry(){
        allCompanies = new ArrayList<>();
        allPersons = new ArrayList<>();
    }

    private Company findCompany (String nameOfCompany){
        for (Company toBeChecked : this.allCompanies) {
            if (nameOfCompany.equals(toBeChecked.getNameOfCompany())) {
                return toBeChecked;
            }
        }
        return null;
    }
    private int findCompanyPosition (String nameOfCompany){
        for (int i = 0; i < allCompanies.size(); i++){
            if(allCompanies.get(i).getNameOfCompany().equals(nameOfCompany)){
                return i;
            }
        }
        return -1;
    }
    private int findPersonPosition (String nameOfPerson){
        for (int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getNameOfPerson().equals(nameOfPerson)){
                return i;
            }
        }
        return -1;
    }
    public void printAllCompanies (){
        for (Company allCompany : allCompanies) {
            System.out.println("\n" + allCompany.getNameOfCompany() + ", " + allCompany.getCountry());
            allCompany.printPersonsInCompany();
        }
    }
    public void printPersonsCompanies (){
        for (Person allPerson : allPersons) {
            System.out.println("\n" + allPerson.getNameOfPerson());
            for (int j = 0; j < allPerson.getCompaniesOfPerson().size(); j++) {
                System.out.println("\t" + allPerson.getCompaniesOfPerson().get(j));
            }
        }

    }
    public void addCompanyToAllCompanies (String nameOfCompany, String country){
        if(findCompany(nameOfCompany) == null){
            allCompanies.add(Company.createNewCompany(nameOfCompany, country));
        } else {
            System.out.println("Company already added");
        }
    }
    public void addPersonToAllPersons (String name){
        allPersons.add(Person.createPerson(name));
    }
    public void addPersonToCompany (String nameOfCompany, String nameOfPerson){
        int positionOfCompany = findCompanyPosition(nameOfCompany);
        int positionOfPerson = findPersonPosition(nameOfPerson);
        if(positionOfCompany == -1){
            System.out.println("No such company");
        } else{
            allPersons.get(positionOfPerson).getCompaniesOfPerson().add(nameOfCompany);
            allCompanies.get(positionOfCompany).addPersonsToCompany(allPersons.get(positionOfPerson));
        }
    }

}
