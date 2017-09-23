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

    protected void displayWeight(int weight) {
        System.out.println(String.format("重さ:%dg", weight));
    }

    //デフォルトの版材を作成
    protected Cuttable createCuttable() {
        return new Wood(300);
    }

    public void createCutPrint() {
        Cuttable hanzai = createCuttable();
        displayWeight(hanzai.getWeight());
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
        displayWeight(hanzai.getWeight());
    }
}
