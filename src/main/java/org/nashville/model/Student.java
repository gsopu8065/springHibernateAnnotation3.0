package org.nashville.model;


import javax.persistence.*;

/**
 * Created by srujangopu on 4/8/16.
 */

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue
    private int studentId;

    @Column
    private String studentName;

    @Column
    private double marks;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
