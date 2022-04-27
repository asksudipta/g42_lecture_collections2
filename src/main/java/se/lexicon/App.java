package se.lexicon;

import se.lexicon.collectionExamples.model.Person;
import se.lexicon.genericExamples.Car;
import se.lexicon.genericExamples.GenericClassDemo;
import se.lexicon.genericExamples.GenericMethodExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {


  public static void main(String[] args) {
    /*GenericClassDemo<Person> demo= new GenericClassDemo<>();
    Person p1 = new Person(1,"test", "test","test@test.se");

    demo.setT(p1);
    Person result = demo.getT();*/

    /*Car<String,Integer> genericTestCar = new Car<>();
    genericTestCar.setBrand("Volvo");
    genericTestCar.setRegNumber(123);
    genericTestCar.setId(1);*/


    boolean res = GenericMethodExamples.isEqual("Test", "Test");
    System.out.println("res = " + res);
    System.out.println(GenericMethodExamples.isEqual(2,20));
    List<String> names = new ArrayList<>();
    names.add("Test1");
    names.add("Test2");
    names.add("Test3");
    GenericMethodExamples.printData(names);
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    GenericMethodExamples.printData(numbers);


  }


}
