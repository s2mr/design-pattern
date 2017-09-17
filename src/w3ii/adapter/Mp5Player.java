/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.adapter;

/**
 *
 * @author kaz
 */
public class Mp5Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playMp5(String fileName) {
        System.out.println("Playing mp5 file. Name: " + fileName);
    }
    
}
