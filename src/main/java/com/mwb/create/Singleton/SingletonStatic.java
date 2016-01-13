package com.mwb.create.Singleton;

/**
 * Created by mwb on 16-1-12.
 * 静态内部类
 * 懒加载 并发高效
 */
public class SingletonStatic {

    private SingletonStatic(){}

    private static class Singleton{
        private static final SingletonStatic instance=new SingletonStatic();
    }

    public static  SingletonStatic getInstance(){
        return Singleton.instance;
    }
}


