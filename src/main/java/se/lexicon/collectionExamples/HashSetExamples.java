package se.lexicon.collectionExamples;

import se.lexicon.collectionExamples.model.Person;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExamples {

  public static void main(String[] args) {
    ex2();
  }


  public static void ex1(){
    HashSet<String> countries = new HashSet<>();

    // adding element into hashset
    countries.add("India");
    countries.add("Australia");
    countries.add("South Africa");
    countries.add("Iran");
    countries.add("Iran"); // add duplicate elements

    System.out.println("countries: " + countries);

    Iterator<String> iterator = countries.iterator();
    while (iterator.hasNext()){
      System.out.println("Element: " + iterator.next());
    }

  }

  public static void ex2(){
    HashSet<Person> personSet= new HashSet<>();
    // requirements, implement tha equal and hash code methods

    personSet.add(new Person(1,"Test2","Test11", "Test1"));
    personSet.add(new Person(3,"Test1","Test11", "Test1"));
    personSet.add(new Person(2,"Test2","Test22", "Test1"));
    personSet.add(new Person(1,"Test2","Test11", "Test1"));

    System.out.println(personSet.size());
  }
}
