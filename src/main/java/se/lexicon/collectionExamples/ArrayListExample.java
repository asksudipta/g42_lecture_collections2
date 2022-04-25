package se.lexicon.collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {


  public static void main(String[] args) {
    ex3();

  }


  public static void ex1() {
    // creating arraylist
    ArrayList<Integer> numbers = new ArrayList<>();
    // Adding object in arraylist
    numbers.add(100); // 0
    numbers.add(400); // 1
    numbers.add(300); // 2
    numbers.add(200); // 3

    System.out.println("Size of list: " + numbers.size());

    // Traversing on arraylist
    System.out.println("Loop---------------------");
    for (Integer element : numbers) {
      System.out.println("Element: " + element);
    }

    System.out.println("Iterator---------------------");
    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
      System.out.println("Element: " + iterator.next());
    }

    System.out.println("Basic For Loop---------------------");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("Element: " + numbers.get(i));
    }

    // accessing the element
    System.out.println("Get Element by index");
    System.out.println(numbers.get(2));


  }

  public static void ex2() {
    // creating arraylist
    ArrayList<Integer> numbers = new ArrayList<>();
    // Adding object in arraylist
    numbers.add(100); // 0
    numbers.add(400); // 1
    numbers.add(300); // 2
    numbers.add(200); // 3

    Integer removeByIndex = numbers.remove(2);
    System.out.println("removeByIndex = " + removeByIndex);
    System.out.println("ArrayList Size: " + numbers.size());
    //Integer element100 = new Integer(100);
    boolean isRemoveObject = numbers.remove(new Integer(100));
    System.out.println("isRemoveObject = " + isRemoveObject);

  }

  public static void ex3() {
    List<String> euCars = new ArrayList<>();
    euCars.add("Volvo");
    euCars.add("VW");
    euCars.add("BMW");
    euCars.add("Volvo"); // we can add duplicate data in ArrayList
    System.out.println("EU Cars: " + euCars.size());

    List<String> usaCars = new ArrayList<>();
    usaCars.add("Tesla");

    //euCars.addAll(1,usaCars);
    euCars.addAll(usaCars);
    for (String car : euCars) {
      System.out.println("Car: " + car);
    }

    System.out.println("Last Index Of Volvo: " + euCars.lastIndexOf("Volvo"));

  }


}
