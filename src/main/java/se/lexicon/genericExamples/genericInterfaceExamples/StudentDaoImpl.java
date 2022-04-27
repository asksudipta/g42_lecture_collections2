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
    // step1: validation the parameters
    // step2: find by id
    // step3: find the original object index
    // step:4 set new object to list

    if (student == null) throw new IllegalArgumentException("student is null");
    if (student.getId() == null) throw new IllegalArgumentException("student id is null");

    Student toUpdate = findById(student.getId());
    if (toUpdate == null) throw new IllegalArgumentException("student dose not exist");
    int index = studentList.indexOf(toUpdate);

    toUpdate.setEmail(student.getEmail());
    toUpdate.setName(student.getName());

    studentList.set(index, toUpdate);

    return toUpdate;
  }

  @Override
  public boolean remove(Integer id) {
    Student toRemove = findById(id);
    if (toRemove != null) {
      return studentList.remove(toRemove);
    }

    return false;
  }

  @Override
  public Student findById(Integer id) {
    if (id == null) throw new IllegalArgumentException("id is null");
    for (Student element : studentList) {
      if (element.getId().intValue() == id.intValue()) {
        return element;
      }
    }
    return null;
  }

  @Override
  public List<Student> getAll() {
    return studentList;
  }

  @Override
  public Student findByEmail(String email) {
    if (email == null) throw new IllegalArgumentException("Email is null");
    for (Student element : studentList) {
      if (element.getEmail().equalsIgnoreCase(email)) {
        return element;
      }
    }
    return null;
  }
}
