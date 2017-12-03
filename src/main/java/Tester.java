import model.RankHorse;

/**
 * Created by TY on 2017/12/2.
 */
public class Tester {

    public static void main(String[] args)  {
        double start = System.currentTimeMillis();
        Tester testerObj = new Tester();

        testerObj.testConcurrent();
        double elapsedTime = System.currentTimeMillis() - start;
        System.out.println("elapsedTime: " + elapsedTime/1000 + " s");
    }

    public void testConcurrent() {
        Tester testerObj = new Tester();
//        for (int i=0; i<5; i++) {
//            testerObj.test();
//        }
        testerObj.test();
        System.out.println("test end.");
    }

    public void test() {
//        final Data.DataCenter dataCenter = new Data.DataCenter();

        RankHorse rankHorse = new RankHorse();
        Thread horse1 = new Thread(rankHorse, "horse1");

        horse1.start();

        Thread horse2 = new Thread(rankHorse, "horse2");

        horse2.start();

        try {
            horse1.join();
            horse2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

