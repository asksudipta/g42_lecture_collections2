package se.lexicon.collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    ex1();

  }

  public static void ex1(){
    Map<String, String> map = new HashMap<>();
    map.put("mehrdad.javan@lexicon.se", "Mehrdad Javan");
    map.put("simon.elbrink@lexicon.se", "Simon Elbrink");

    String data = map.putIfAbsent("tes.test@lexicon.se", "Test Test");
    System.out.println(map.containsKey("mehrdad.javan@lexicon.se"));
    System.out.println(map.containsValue("Test1234"));
    map.replace("mehrdad.javan@lexicon.se", "ABCD ABCD");


    for (Map.Entry m: map.entrySet()){
      System.out.println("Key: " + m.getKey() + "  Value: " + m.getValue());
    }

  }

}
