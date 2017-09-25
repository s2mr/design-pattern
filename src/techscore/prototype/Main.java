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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Paper[] papers = teacher.createManyCrystals();  
        System.out.println(papers[0].getName());
    }
    
}
