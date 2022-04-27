package se.lexicon.genericExamples.genericInterfaceExamples;

import se.lexicon.genericExamples.genericInterfaceExamples.model.Course;

import java.time.LocalDate;
import java.util.List;

public interface CourseDao extends CrudInterface<Course, String> {

  List<Course> findByName(String name);
  List<Course> findByStartDate(LocalDate localDate);


}
