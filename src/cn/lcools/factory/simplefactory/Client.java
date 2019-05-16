package cn.lcools.factory.simplefactory;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.createBydCar();
        car1.run();
        Car car2 = CarFactory.createXflCar();
        car2.run();
    }
}
