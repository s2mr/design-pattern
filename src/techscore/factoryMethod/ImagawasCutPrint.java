/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.factoryMethod;

/**
 *
 * @author kaz
 */
public class ImagawasCutPrint extends CutPrint {

    //オーバーライド。下３つはimplements
    @Override
    protected Cuttable createCuttable() {
        return new Potato(500);
    }
    
    @Override
    protected void draw(Cuttable hanzai) {
        hanzai.setWeight(hanzai.getWeight() - 100);
        System.out.println("芋に描く");
    }
    
    @Override
    protected void cut(Cuttable hanzai) {
        System.out.println("芋を掘る");
    }
    
    @Override
    protected void print(Cuttable hanzai) {
        System.out.println("芋からプリントする");
    }
}
