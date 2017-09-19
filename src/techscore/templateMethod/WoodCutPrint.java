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
public abstract class WoodCutPrint {

    public abstract void draw(Cuttable hanzai);

    public abstract void cut(Cuttable hanzai);

    public abstract void print(Cuttable hanzai);

    public void createWoodCutPrint() {
        Wood hanzai = new Wood();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }
}
