package se.lexicon.genericExamples;

// Generic is a technique of writing the code without specifying the data type
public class GenericClassDemo<T> {
  // The most commonly used data type parameter are:
  /*
  E – Element (used extensively by the Java Collections Framework)
  K – Key (Used in Map)
  N – Number
  T – Type
  V – Value (Used in Map)
  S,U,V etc. – 2nd, 3rd, 4th types
   */

  private T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

}
