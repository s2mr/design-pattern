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
public class RegisterNote {

    private static final RegisterNote registerNote = new RegisterNote();

    private RegisterNote() {
        System.out.println("Initialize!!");
    }

    public static RegisterNote getInstance() {
        return registerNote;
    }
}
