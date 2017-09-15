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
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student stu1 = new Student("TARO", 1);
        Student stu2 = new Student("MOMO", 1);
        Student stu3 = new Student("PIYO", 1);

        StudentList list = new StudentList(3);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();
        
        System.out.println(list.getStudentAt(0).getName());
    }

}
