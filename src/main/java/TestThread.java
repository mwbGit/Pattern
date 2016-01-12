import java.util.Date;

/**
 * Created by mwb on 15-11-23.
 */
public  class TestThread extends Thread {

    @Override
    public synchronized void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date().toLocaleString());
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}
