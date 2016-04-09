package org.nashville.dao;

import org.nashville.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by srujangopu on 4/8/16.
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void saveStudent(Student student) {
        hibernateTemplate.save(student);
    }

    public Student getStudent(int id) {
        return hibernateTemplate.get(Student.class, id);
    }

    @Override
    public List<Student> getAllStudents() {
        return hibernateTemplate.loadAll(Student.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
