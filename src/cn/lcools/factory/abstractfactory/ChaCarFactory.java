package cn.lcools.factory.abstractfactory;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class ChaCarFactory implements CarFactory {
    @Override
    public Engine cearteEngine() {
        return new ChaEngine();
    }

    @Override
    public Seat cearteSeat() {
        return new ChaSeat();
    }
}
