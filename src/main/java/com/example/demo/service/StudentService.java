package com.example.demo.service;
//CS/2018/030
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    void insertStudent(Student student);

    List<Student> getStudentsMark();
}
