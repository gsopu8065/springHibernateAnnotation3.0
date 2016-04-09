package org.nashville.dao;

import org.nashville.model.Student;

import java.util.List;
import java.util.Set;

/**
 * Created by srujangopu on 4/8/16.
 */
public interface StudentDAO {

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public List<Student> getAllStudents();
}
