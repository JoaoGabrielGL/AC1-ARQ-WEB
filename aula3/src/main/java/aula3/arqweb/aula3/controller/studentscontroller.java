package aula3.arqweb.aula3.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/students")
public class studentscontroller {
    private List<String> students = new ArrayList<>();

    public studentscontroller() {
        students.add("João");
        students.add("Antonio");
        students.add("Marcus");
    }

    @GetMapping
    public List<String> getAllStudents() {
        return students;
    }

    @GetMapping("/{student}")
    public String getStudentById(@PathVariable int student) {
        if (student >= 0 && student < students.size()) {
            return students.get(student);
        } else {
            return "Aluno não foi encontrado na lista!";
        }
    }

    @PostMapping("/add")
    public void createStudent(@RequestBody String student) {
        students.add(student);
        System.out.println("Aluno adicionado: " + student);
    }
}