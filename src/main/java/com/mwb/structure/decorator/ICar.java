package com.mwb.structure.decorator;

/**
 * 抽象构建
 *
 * @author mwb
 *         装饰模式（Decorator）顾名思义，装饰模式就是给一个对象增加一些新的功能，
 *         而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例，关系图如下：
 *         装饰器模式的应用场景：
 *         1、需要扩展一个类的功能。
 *         2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 *         缺点：产生过多相似的对象，不易排错！
 */
public interface ICar {
    void move();
}

//ConcreteComponent 具体构件角色(真实对象)
class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑！");
    }
}

//Decorator装饰角色
class SuperCar implements ICar {
    protected ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//ConcreteDecorator具体装饰角色
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天上飞！");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

}

//ConcreteDecorator具体装饰角色
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上游！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }

}

//ConcreteDecorator具体装饰角色
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove() {
        System.out.println("自动跑！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }

}



