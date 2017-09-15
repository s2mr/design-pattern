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
public class MyTeacher extends Teacher {

    private StudentList studentList;

    public void createStudentList() {
        studentList = new StudentList(5);
        studentList.add(new Student("赤井亮太", 1));
        studentList.add(new Student("赤羽里美", 2));
        studentList.add(new Student("岡田美央", 2));
        studentList.add(new Student("西森俊介", 1));
        studentList.add(new Student("中ノ森玲菜", 2));

    }

    public void callStudents() {
        int stuCount = this.studentList.getLastNum();

        for (int i = 0; i < stuCount; i++) {
            System.out.println(this.studentList.getStudentAt(i).getName());
        }
    }
}
