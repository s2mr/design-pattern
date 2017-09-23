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
public abstract class CutPrint {
    protected abstract void draw(Cuttable hanzai);
    protected abstract void cut(Cuttable hanzai);
    protected abstract void print(Cuttable hanzai);
    
    //デフォルトの版材を作成
    protected Cuttable createCuttable() {
        return new Wood();
    }
    
    public void createCutPrint() {
        Cuttable hanzai = createCuttable();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
