package se.lexicon.genericExamples.genericInterfaceExamples;

import se.lexicon.genericExamples.genericInterfaceExamples.model.Student;

public interface StudentDao extends CrudInterface<Student, Integer> {


  Student findByEmail(String email);


}
