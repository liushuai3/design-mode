package cn.lcools.singleton;

/**
 * Created by liushuai3 on 2019/5/15.
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
        singletonDemo1.operation();
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        singletonDemo2.operation();
        SingletonDemo3 singletonDemo3 = SingletonDemo3.getInstance();
        singletonDemo3.operation();
        SingletonDemo4 singletonDemo4 = SingletonDemo4.SINGLETON_DEMO_4;
        singletonDemo4.operation();

    }
}
