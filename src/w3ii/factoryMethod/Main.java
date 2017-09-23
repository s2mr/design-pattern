/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.factoryMethod;

/**
 *
 * @author kaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
    
}
