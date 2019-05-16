package cn.lcools.factory.factorymethod;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = new BydCarFactory().createCar();
        car1.run();
        Car car2 = new XflCarFactory().createCar();
        car2.run();
    }
}
