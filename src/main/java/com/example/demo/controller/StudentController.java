package com.example.demo.controller;
//CS/2018/030
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public String insertStudentMarks(Model model){
        model.addAttribute("student",new Student());
        return "insert-student-marks";
    }

    @RequestMapping(value = "/" ,method = RequestMethod.POST)
    public String insertStudentMarks1(@ModelAttribute Student student, Model model){
        student.setFinalMarks((student.getCaMarks()*0.2) + (student.getPracticalMarks()*0.2) + (student.getTheoryMarks()*.6));
        studentService.insertStudent(student);
        System.out.println(student.toString());
        return "redirect:/";
    }

    @RequestMapping("/viewStudent")
    public String viewStudentMarks(Model model){
        model.addAttribute("students" , studentService.getStudentsMark());
        return "view-student-marks";
    }
}
