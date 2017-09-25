/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kaz
 */
public class PrototypeKeeper {

    private Map<String, Cloneable> map;

    public PrototypeKeeper() {
        //Mapはインタフェースなのでnewできない
        this.map = new HashMap<String, Cloneable>();
    }
    
    public void addCloneable(String key, Cloneable prototype) {
        map.put(key, prototype);
    }
    
    public Cloneable getClone(String key) {
        Cloneable prototype = map.get(key);
        return prototype.createClone();
    }
}
