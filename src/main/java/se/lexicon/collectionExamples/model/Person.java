package se.lexicon.collectionExamples.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

  private int id;
  private String firstName;
  private String lastName;
  private String email;

  public Person(int id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Person(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // compare to method for comparable interface
  @Override
  public int compareTo(Person o) {
    /*
    positive integer, if the current object is grater than the specified object
    negative number, if the current object is less than the specified object
    zero, if the current is equal to the specified object
     */

    if (o == null) {
      return -1;
    }
    if (o.getId() < this.getId()) {
      return 1;
    } else if (o.getId() == this.getId()) {
      return 0;
    } else {
      return -1;
    }
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email);
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            '}';
  }

}
