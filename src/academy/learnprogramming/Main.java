package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static Enquiry enquiry = new Enquiry();

    public static void main(String[] args) {
        enquiry.addCompanyToAllCompanies("Company1", "Country1");
        enquiry.addCompanyToAllCompanies("Company2", "Country2");
        enquiry.addCompanyToAllCompanies("Company3", "Country2");
        enquiry.addCompanyToAllCompanies("Company4", "Country2");
        enquiry.addPersonToAllPersons("Person1");
        enquiry.addPersonToAllPersons("Person2");
        enquiry.addPersonToCompany("Company1", "Person1");
        enquiry.addPersonToCompany("Company2", "Person1");
        enquiry.addPersonToCompany("Company3", "Person1");
        enquiry.addPersonToCompany("Company1", "Person2");

        //enquiry.printAllCompanies();
        enquiry.printPersonsCompanies();



    }
}
