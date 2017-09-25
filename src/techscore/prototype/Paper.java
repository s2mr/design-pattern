/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.prototype;

/**
 *
 * @author kaz
 */
public class Paper implements Cloneable {

    private String name;

    public Paper() {
    }

    public Paper(String name) {
        this.name = name;
    }

    @Override
    public Cloneable createClone() {
        Paper newPaper = new Paper();
        //これでも行ける？
//        newPaper = this;
        newPaper.name = this.name;
        return newPaper;
    }
    
    public String getName() {
        return this.name;
    }
}
