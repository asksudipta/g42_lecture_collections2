package se.lexicon.genericExamples;

public class Car<T, ID> {

  private ID id;
  private ID regNumber;
  private T brand;

  public Car() {
  }

  public Car(ID regNumber, T brand) {
    this.regNumber = regNumber;
    this.brand = brand;
  }

  public Car(ID id, ID regNumber, T brand) {
    this.id = id;
    this.regNumber = regNumber;
    this.brand = brand;
  }

  public ID getId() {
    return id;
  }

  public void setId(ID id) {
    this.id = id;
  }

  public ID getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(ID regNumber) {
    this.regNumber = regNumber;
  }

  public T getBrand() {
    return brand;
  }

  public void setBrand(T brand) {
    this.brand = brand;
  }
}
