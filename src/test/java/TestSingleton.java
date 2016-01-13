import com.mwb.create.Singleton.SingletonEnum;
import com.mwb.create.Singleton.SingletonHungry;
import com.mwb.create.Singleton.SingletonLazy;
import com.mwb.create.Singleton.SingletonStatic;

/**
 * Created by mwb on 15-11-23.
 * 单例模式测试
 */
public class TestSingleton {
    public  static void main(String[] args) throws InterruptedException {
        SingletonLazy s= SingletonLazy.getInstance();
        SingletonLazy s1= SingletonLazy.getInstance();
        System.out.println("懒汉单例模式:s1==s?"+(s1==s));

        SingletonHungry sh= SingletonHungry.getInstance();
        SingletonHungry sh1= SingletonHungry.getInstance();
        System.out.println("饿汉单例模式sh==sh1?"+(sh==sh1));

        SingletonStatic ss= SingletonStatic.getInstance();
        SingletonStatic ss1= SingletonStatic.getInstance();
        System.out.println("静态内部类单例模式ss==ss1?"+(ss==ss1));

        SingletonEnum se= SingletonEnum.INSTANCE;
        se.tast();
        SingletonEnum se1= SingletonEnum.INSTANCE;
        System.out.println("枚举类型单例模式se==se1?"+(se==se1));

    }


}
