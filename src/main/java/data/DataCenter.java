package data;

import model.RankData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TY on 2017/12/3.
 */
public class DataCenter {
    static public List<RankData> getRankList() {
        return rankList;
    }

    static public void setRankList(List<RankData> rankList) {
        DataCenter.rankList = rankList;
    }

    static List<RankData> rankList = new ArrayList();
    static private int ranking = 1;

    static public int getCurrentRanking() {
        return ranking;
    }
}
