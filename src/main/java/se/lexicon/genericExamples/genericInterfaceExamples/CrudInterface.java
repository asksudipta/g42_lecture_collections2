package se.lexicon.genericExamples.genericInterfaceExamples;


import se.lexicon.genericExamples.genericInterfaceExamples.model.Student;

import java.util.List;

public interface CrudInterface<T, ID> {

  T save(T t);
  T update(T t);
  boolean remove(ID id);
  T findById(ID id);
  List<T> getAll();

}
