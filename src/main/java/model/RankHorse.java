package model;

import data.DataCenter;
import trait.IRank;

/**
 * Created by TY on 2017/12/4.
 */
public class RankHorse implements IRank {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
//        try {
            int ranking = DataCenter.getCurrentRanking();
//            sleep(2000);
            System.out.println(name + " 到達終點.");
//        } catch (InterruptedException e) {
//            System.out.println(name + " 被中斷了.");
//        }
    }
}
