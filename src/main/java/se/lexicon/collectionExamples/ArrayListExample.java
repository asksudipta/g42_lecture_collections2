package se.lexicon.collectionExamples;

import se.lexicon.collectionExamples.model.Person;

import java.util.*;

public class ArrayListExample {


  public static void main(String[] args) {
    ex6();
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

  // convert list to array
  public static void ex4() {
    List<String> contacts = new ArrayList<>();
    contacts.add("0700000000");
    contacts.add("0700000001");
    contacts.add("0700000002");
    contacts.add("0700000003");
    Object[] newArr = contacts.toArray();
    System.out.println(newArr.length);
    System.out.println(contacts.size());

  }

  // sort data in arraylist
  public static void ex5(){
    List<String> names = new ArrayList<>();
    names.add("Mehrdad");
    names.add("Simon");
    names.add("Ulf");
    names.add("erik");
    //Collections.sort(names);
    Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
    System.out.println(names);
  }

  public static void ex6(){
    List<Person> personList = new ArrayList<>();
    personList.add(new Person(1,"Test2","Test11", "Test1"));
    personList.add(new Person(3,"Test1","Test11", "Test1"));
    personList.add(new Person(2,"Test2","Test22", "Test1"));
    personList.add(new Person(1,"Test3","Test33", "Test1"));
    System.out.println("default Data for PersonList: \n" + personList);
    // sort object by comparable interface
    // comparable interface is used to sort objects with natural ordering.
    //Collections.sort(personList);
    //System.out.println("sorted Data for PersonList: \n" + personList);

    Collections.sort(personList, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
      }
    });


    Collections.sort(personList, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
      }
    });
    System.out.println("sorted Data for PersonList through the Comparator interface: \n" + personList);
  }
}
