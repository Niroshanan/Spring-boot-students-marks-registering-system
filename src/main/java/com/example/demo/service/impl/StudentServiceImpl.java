package com.example.demo.service.impl;
//CS/2018/030
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository studentRepository;

    @Override
    public void insertStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentsMark() {
        return studentRepository.findAll();
    }
}
