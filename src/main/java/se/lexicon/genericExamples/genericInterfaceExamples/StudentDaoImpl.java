package se.lexicon.genericExamples.genericInterfaceExamples;

import se.lexicon.genericExamples.genericInterfaceExamples.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

  private List<Student> studentList = new ArrayList<>();

  @Override
  public Student save(Student student) {
    // step1: validate the parameters
    // step2: check the mail should nut be duplicate
    // step3: if the list is not null then add to list
    // DONE
    if (student == null) throw new IllegalArgumentException("student is null");
    if (findByEmail(student.getEmail()) != null)
      throw new IllegalArgumentException("A student with email " + student.getEmail() + " already exists");
    if (studentList == null) throw new IllegalArgumentException("student list is null");
    studentList.add(student);
    return student;
  }

  @Override
  public Student update(Student student) {
    // todo: implement it
    return null;
  }

  @Override
  public boolean remove(Integer integer) {
    // todo: implement it
    return false;
  }

  @Override
  public Student findById(Integer integer) {
    // todo: implement it
    return null;
  }

  @Override
  public Student findByEmail(String email) {
    if (email == null) throw new IllegalArgumentException("Email is null");
    for (Student element : studentList) {
      if (element.getEmail().equalsIgnoreCase(email)){
        return element;
      }
    }
    return null;
  }
}
