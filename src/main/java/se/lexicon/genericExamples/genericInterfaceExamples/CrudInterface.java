package se.lexicon.genericExamples.genericInterfaceExamples;


public interface CrudInterface<T, ID> {

  T save(T t);
  T update(T t);
  boolean remove(ID id);
  T findById(ID id);

}
