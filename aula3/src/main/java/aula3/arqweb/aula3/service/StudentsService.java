package aula3.arqweb.aula3.service;

import java.util.List;
import aula3.arqweb.aula3.model.Student;

    public interface StudentsService {
        List<Student> getAllStudents();
        Student getStudentById(Long id);
        Student createStudent(Student student); 
    }   
