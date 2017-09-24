/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.singleton;

/**
 *
 * @author kaz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //何度インスタンスを取得しても同一のインスタンスを取得できる
        RegisterNote registerNote1 = RegisterNote.getInstance();
        RegisterNote registerNote2 = RegisterNote.getInstance();
        
//        オブジェクト同士の比較
        if (registerNote1 == registerNote2) {
            System.out.println("同一である");
        } else {
            System.out.println("異なる");
        }
        
//        オブジェクトに格納された値の比較。
        if (registerNote1.equals(registerNote2)) {
            System.out.println("同一である");
        } else {
            System.out.println("異なる");
        }
    }

}
