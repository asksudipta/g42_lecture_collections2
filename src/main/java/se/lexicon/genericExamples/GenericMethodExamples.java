package se.lexicon.genericExamples;

import se.lexicon.collectionExamples.model.Person;

import java.util.List;

public class GenericMethodExamples {

  /*public static boolean isEqual(String s1, String s2){
    return s1.equals(s2);
  }

  public static boolean isEqual(Person p1, Person p2){
    return p1.equals(p2);
  }

  public static boolean isEqual(Integer p1, Integer p2){
    return p1.equals(p2);
  }*/

  public static <T> boolean isEqual(T firstValue, T secondValue) {
    return firstValue.equals(secondValue);
  }

  /*public static void printData(List<String> list) {
    for (String value : list) {
      System.out.println(value);
    }
  }*/

  public static <E> void printData(List<E> list) {
    for (E value : list) {
      System.out.println(value);
    }
  }

}
