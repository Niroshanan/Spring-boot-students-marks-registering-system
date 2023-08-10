package com.example.demo.repository;
//CS/2018/030
import com.example.demo.model.Student;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
