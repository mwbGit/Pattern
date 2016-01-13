package com.mwb.create.Singleton;

/**
 * Created by mwb on 16-1-12.
 * 饿汉模式/Singleton for Hungry pattern
 * 延时加载 不初始化 有同步 效率低
 */
public class SingletonHungry {
    private  static SingletonHungry s;
    private SingletonHungry(){}
    public static synchronized SingletonHungry getInstance(){
        if (s==null){
            s=new SingletonHungry();
        }
        return s;
    }
}

