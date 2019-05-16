package cn.lcools.factory.simplefactory;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class CarFactory {
    public static Car createBydCar(){
        return new BydCar();
    }
    public static Car createXflCar(){
        return new XflCar();
    }
}
