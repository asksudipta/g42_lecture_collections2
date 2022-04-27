package se.lexicon.genericExamples.genericInterfaceExamples.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

  private String id;
  private String courseName;
  private LocalDate startDate;
  private int weekDuration;
  private List<Student> students;

  public Course(String courseName, LocalDate startDate, int weekDuration, List<Student> students) {
    this.courseName = courseName;
    this.startDate = startDate;
    this.weekDuration = weekDuration;
    this.students = students;
  }

  public Course(String id, String courseName, LocalDate startDate, int weekDuration, List<Student> students) {
    this.id = id;
    this.courseName = courseName;
    this.startDate = startDate;
    this.weekDuration = weekDuration;
    this.students = students;
  }

  public Course(String courseName, LocalDate startDate, int weekDuration) {
    this.courseName = courseName;
    this.startDate = startDate;
    this.weekDuration = weekDuration;
  }

  public void register(Student student) {
    // step1: checking parameters
    if (student == null) throw new IllegalArgumentException("student is null");
    // step2: check the arraylist should not be null if it is null then instantiate it
    if (students == null) students = new ArrayList<>();
    students.add(student);
  }


  public void unregister(Student student) {
    if (student == null) throw new IllegalArgumentException("student is null");
    if (students != null){
      students.remove(student);
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public int getWeekDuration() {
    return weekDuration;
  }

  public void setWeekDuration(int weekDuration) {
    this.weekDuration = weekDuration;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Course course = (Course) o;
    return weekDuration == course.weekDuration && Objects.equals(id, course.id) && Objects.equals(courseName, course.courseName) && Objects.equals(startDate, course.startDate) && Objects.equals(students, course.students);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseName, startDate, weekDuration, students);
  }

  @Override
  public String toString() {
    return "Course{" +
            "id='" + id + '\'' +
            ", courseName='" + courseName + '\'' +
            ", startDate=" + startDate +
            ", weekDuration=" + weekDuration +
            ", students=" + students +
            '}';
  }
}
