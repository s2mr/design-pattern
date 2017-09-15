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

    private MyStudentList studentList;

    public void createStudentList() {
        studentList = new MyStudentList();
        studentList.add(new Student("赤井亮太", 1));
        studentList.add(new Student("赤羽里美", 2));
        studentList.add(new Student("岡田美央", 2));
        studentList.add(new Student("西森俊介", 1));
        studentList.add(new Student("中ノ森玲菜", 2));
    }

    public void callStudents() {
        Iterator itr = studentList.iterator();
        while (itr.hasNext()) {
            Student s = (Student)itr.next();
            System.out.println(s.getName());
        }
    }
    
    public MyStudentList getStudentList() {
        return studentList;
    }
}
