package CriterialPattern;

import java.util.ArrayList; 
import java.util.List;
 
public class CriteriaPatternDemo {
   public static void main(String[] args) {
      List<Person> persons = new ArrayList<Person>();
 
      persons.add(new Person("Robert","Male", "Single"));
      persons.add(new Person("John","Male", "Married"));
      persons.add(new Person("Laura","Female", "Married"));
      persons.add(new Person("Diana","Female", "Single"));
      persons.add(new Person("Mike","Male", "Single"));
      persons.add(new Person("Bobby","Male", "Single"));
 
      Criterial male = new CriterialMale();
      Criterial female = new CriterialFemale();
      Criterial single = new CriterialSignle();
      Criterial singleMale = new AndCriterial(single, male);
      Criterial singleOrFemale = new OrCriterial(single, female);
 
      System.out.println("Males: ");
      printPersons(male.meetCriterial(persons));
 
      System.out.println("\nFemales: ");
      printPersons(female.meetCriterial(persons));
 
      System.out.println("\nSingle Males: ");
      printPersons(singleMale.meetCriterial(persons));
 
      System.out.println("\nSingle Or Females: ");
      printPersons(singleOrFemale.meetCriterial(persons));
   }
 
   public static void printPersons(List<Person> persons){
      for (Person person : persons) {
         System.out.println("Person : [ Name : " + person.getName() 
            +", Gender : " + person.getGender() 
            +", Marital Status : " + person.getMaritalStatus()
            +" ]");
      }
   }      
}