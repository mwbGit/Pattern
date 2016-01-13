package com.mwb.create.Singleton;

/**
 * Created by mwb on 16-1-12.
 * 枚举类型单例模式
 * 避免反射和反序列化的漏洞
 * 无延迟加载
 */
public enum  SingletonEnum {
    INSTANCE;
    public void tast(){
        System.out.println("tast....");
    }
}
