/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techscore.prototype;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaz
 */
public class Teacher {

    public Paper[] createManyCrystals() {
        Paper prototype = new Paper("雪の結晶");
        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);

        PrototypeKeeper keeper = new PrototypeKeeper();
        keeper.addCloneable("crystal", prototype);
        
        //再度宣言すべきかなと思ったがこれでもなんか行けた
        prototype = new Paper("赤いおうち");
        drawCrystal(prototype);
        keeper.addCloneable("house", prototype);

        Paper[] papers = new Paper[2];

        papers[0] = (Paper) keeper.getClone("crystal");
        papers[1] = (Paper) keeper.getClone("house");

        return papers;
    }

    private void drawCrystal(Paper paper) {
        //時間のかかる処理
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cutAccordanceWithLine(Paper paper) {
        //時間のかかる処理
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
