package cn.lcools.factory.abstractfactory;

import cn.lcools.factory.factorymethod.Car;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class Client {
    public static void main(String[] args) {
        Engine engine = new HaoCarFactory().cearteEngine();
        engine.run();
        Seat seat = new ChaCarFactory().cearteSeat();
        seat.sit();
    }
}
