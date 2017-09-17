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
public class Mp4Player implements AdvancedMediaPlayer {

    //mp4プレイヤーなのにこの関数があることが無駄な気が。。
    //vlcプレイヤーについても同様
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

    @Override
    public void playMp5(String fileName) {
        // do nothing
    }

}
