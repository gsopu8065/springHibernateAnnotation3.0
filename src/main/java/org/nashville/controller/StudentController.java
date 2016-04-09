package org.nashville.controller;

import org.nashville.model.Student;
import org.nashville.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by srujangopu on 4/8/16.
 */

@Controller
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String getForm(){
        return "registration";
    }

    @RequestMapping(value = { "/save" }, method = RequestMethod.GET)
    public String saveStudent(@RequestParam String studentName, @RequestParam String studentMarks){

        Student s1 =new Student();
        s1.setStudentName(studentName);
        s1.setMarks(Double.parseDouble(studentMarks));
        studentService.saveStudent(s1);
        return "success";
    }

    @RequestMapping(value = { "/getAllDetails" }, method = RequestMethod.GET)
    public String getAllDetails(Model model){

        model.addAttribute("students", studentService.getAllStudents());
        return "registration";
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
