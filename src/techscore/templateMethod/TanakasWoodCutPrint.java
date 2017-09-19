/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.templateMethod;

/**
 *
 * @author kaz
 */
public class TanakasWoodCutPrint extends WoodCutPrint {

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("描く");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("切る");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("印刷する");
    }
    
}
