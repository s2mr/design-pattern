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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyTeacher you = new MyTeacher();
        you.createStudentList();
//        you.callStudents();

        Iterator i = you.getStudentList().iterator();

        while (i.hasNext()) {
            Object o = i.next();
            Student s = (Student)o;
            
            System.out.println(s.getName());
        }
    }

}
