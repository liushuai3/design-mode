package cn.lcools.factory.abstractfactory;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public interface Engine {
    void run();
}
class HaoEngine implements Engine{

    @Override
    public void run() {
        System.out.println("好的发动机");
    }
}
class ChaEngine implements Engine{

    @Override
    public void run() {
        System.out.println("差发动机");
    }
}