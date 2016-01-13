package com.mwb.create.factory;

/**
 * Created by mwb on 16-1-13.
 * 简单工厂/静态工厂
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * 静态工厂方法模式，模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SimpleFactory {

    public static Animal getDog(){
        return new Dog();
    }
    public static Animal getPig(){
        return new Pig();
    }
    public static Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("pig".equals(type)) {
            return new  Pig();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
