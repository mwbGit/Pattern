package com.mwb.create.Singleton;

/**
 * Created by mwb on 16-1-12.
 * 懒汉模式/Singleton for Lazy pattern
 *   不延时加载 初始化 无同步 效率高
 */
public class SingletonLazy {
    private  static SingletonLazy s=new SingletonLazy();
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        return s;
    }
}

