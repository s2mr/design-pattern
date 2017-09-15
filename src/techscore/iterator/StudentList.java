/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.iterator;

/**
 *
 * @author kaz
 */
public class StudentList {

    protected Student[] students;
    private int last = 0;

    public StudentList(int studentCount) {
        this.students = new Student[studentCount];
    }

    public void add(Student student) {
        this.students[last] = student;
        last += 1;
    }

    public Student getStudentAt(int index) {
        return this.students[index];
    }

    public int getLastNum() {
        return last;
    }
}
