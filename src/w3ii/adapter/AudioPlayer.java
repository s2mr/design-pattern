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
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        // mp3 はもともとサポート
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("mp5")) {
            //mp3以外はアダプターを介す
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }

    }

}
