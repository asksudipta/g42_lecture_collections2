package se.lexicon.genericExamples.genericInterfaceExamples;

import se.lexicon.genericExamples.genericInterfaceExamples.model.Student;

import java.util.List;

public interface StudentDao extends CrudInterface<Student, Integer> {


  Student findByEmail(String email);

}
