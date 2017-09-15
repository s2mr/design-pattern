/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator1;

/**
 *
 * @author kaz
 */
public class Student {

    private String name;
    private int sex;

    public Student(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getSex() {
        return this.sex;
    }
}
