/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.iterator;

import java.util.Vector;

/**
 *
 * @author kaz
 */
public class StudentList {

    protected Vector<Student> students;

    StudentList() {
        students = new Vector<Student>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student getStudentAt(int index) {
        return students.get(index);
    }

    public int getLastNum() {
        return students.size();
    }
}
