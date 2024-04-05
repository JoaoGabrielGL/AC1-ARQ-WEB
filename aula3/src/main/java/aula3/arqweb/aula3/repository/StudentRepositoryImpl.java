package aula3.arqweb.aula3.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final List<Student> students = new ArrayList<>();
    private Long nextId = 1L;

    public StudentRepositoryImpl() {
        students.add(new Student("João", "Lourenco", "rua do ceu", 1L, "Pescar"));
        students.add(new Student("Rodrigo", "Lopes", "rua do pombo", 2L, "Saltar"));
        students.add(new Student("Antonio", "Tadeu", "rua da caixa", 3L, "Jogar"));
        nextId = 4L;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findById(Long id) {
        return students.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student save(Student student) {
        if (student.getId() == null) {
            student.setId(nextId++);
            students.add(student);
        } else {
            students.removeIf(t -> t.getId().equals(student.getId()));
            students.add(student);
        }
        return student;
    }
}
