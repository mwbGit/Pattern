package test.mwb;

/**
 * Created by mwb on 16-1-12.
 */
public class TestSingleton {
    private  static TestSingleton s=new TestSingleton();
    private TestSingleton(){}

    public static TestSingleton getInstance(){
        return s;
    }
}
