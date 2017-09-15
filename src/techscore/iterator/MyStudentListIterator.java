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
public class MyStudentListIterator implements Iterator {

    private MyStudentList myStudentList;
    private int index;

    MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index = 0;
    }

    public boolean hasNext() {
        if (myStudentList.getLastNum() > index) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
