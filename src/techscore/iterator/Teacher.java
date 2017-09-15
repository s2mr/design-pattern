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
public abstract class Teacher {

    protected  StudentList studentList;

    public abstract void createStudentList();

    public abstract void callStudents();
}
