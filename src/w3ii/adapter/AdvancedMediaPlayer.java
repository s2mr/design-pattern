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
public interface AdvancedMediaPlayer {
    //消してから思ったけど、playMp4とか全部ここに書いてたのは、
    //一覧で見て何を実装しているのかわかりやすいからだったのかもしれない
    //これだとMediaPlayerとあんまり変わらないし。
    public void play(String fileName);
}
