/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.templateMethod;

/**
 *
 * @author kaz
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("クリケット　initialize");
    }

    @Override
    void startPlay() {
        System.out.println("クリケット　start");
    }

    @Override
    void endPlay() {
        System.out.println("クリケット　end");
    }

}
