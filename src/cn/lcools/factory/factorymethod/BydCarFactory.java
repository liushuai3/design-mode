package cn.lcools.factory.factorymethod;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class BydCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new BydCar();
    }
}
