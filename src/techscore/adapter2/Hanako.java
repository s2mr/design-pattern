/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.adapter2;

/**
 *
 * @author kaz
 */
public class Hanako implements Chairperson {
    Taro taro;
    
    Hanako() {
        taro = new Taro();
    }
    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmates();
    }
    
}
