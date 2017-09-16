/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.iterator;

/**
 *
 * @author kaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NameRepository nr = new NameRepository();

        for (Iterator it = nr.getIterator(); it.hasNext();) {
            String name = (String) it.next();
            System.out.println("Name: " + name);
        }
    }

}
