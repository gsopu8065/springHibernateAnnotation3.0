package org.nashville.service;

import org.nashville.dao.StudentDAO;
import org.nashville.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by srujangopu on 4/8/16.
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Transactional
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
}
