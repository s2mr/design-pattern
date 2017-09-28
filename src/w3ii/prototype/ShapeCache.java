/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.prototype;

import java.util.Hashtable;

/**
 *
 * @author kaz
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape;
    }

    public void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        
        Shape rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);
        
        Shape square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);
    }
    
    
}
