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
public class MyStudentList extends StudentList implements Aggregate {
    
    //TODO: これをここに書く必要あるのかな、実装するわけでもないし
    public MyStudentList() {
        super();
    }
    
    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }
}
