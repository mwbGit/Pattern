import test.mwb.TestSingleton;

/**
 * Created by mwb on 15-11-23.
 */
public class Testmain {
    public  static void main(String[] args) throws InterruptedException {
        TestSingleton s=TestSingleton.getInstance();
        TestSingleton s1=TestSingleton.getInstance();
        System.out.println(s1==s);
    }


}
