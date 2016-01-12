package test.mwb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

/**
 * Created by mwb on 15-11-23.
 */
public class TestMain {
    public static void main(String[] args) throws FileNotFoundException {
        ThreadOne t1=new ThreadOne();
        t1.setName("Thread1:");
        ThreadTwo t2=new ThreadTwo();
        t2.setName("Thread2:");
        t1.start();
        t2.start();


    }
}
class ThreadOne extends Thread{

    @Override
    public void run() {
        for (int i=0;i<100;i=i+2){

            try {
                Thread.sleep(1000);
                System.setOut(new PrintStream(new FileOutputStream("src/test.txt"), true));
                System.out.print(new Date().toLocaleString());
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
class ThreadTwo extends Thread{

    @Override
    public void run() {
        for (int i=1;i<100;i=i+2){
            System.out.println(Thread.currentThread().getName()+i+"");
        }
    }
}