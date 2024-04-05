package aula3.arqweb.aula3.repository;

import aula3.arqweb.aula3.model.Student;
import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    Student save(Student student);
}
