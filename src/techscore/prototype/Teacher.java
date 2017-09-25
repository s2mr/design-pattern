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

        Paper[] papers = new Paper[100];

        for (int i = 0; i < papers.length; i++) {
            papers[i] = (Paper) prototype.createClone();
        }

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
