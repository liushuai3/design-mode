package cn.lcools.singleton;

/**
 * Created by liushuai3 on 2019/5/15.
 */
public class Client {
    public static void main(String[] args) {
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
        SingletonDemo1 singletonDemo11 = SingletonDemo1.getInstance();
        System.out.println(singletonDemo1==singletonDemo11);
        singletonDemo1.operation();
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        SingletonDemo2 singletonDemo22 = SingletonDemo2.getInstance();
        System.out.println(singletonDemo2==singletonDemo22);
        singletonDemo2.operation();
        SingletonDemo3 singletonDemo3 = SingletonDemo3.getInstance();
        SingletonDemo3 singletonDemo33 = SingletonDemo3.getInstance();
        System.out.println(singletonDemo3==singletonDemo33);
        singletonDemo3.operation();
        SingletonDemo4 singletonDemo4 = SingletonDemo4.SINGLETON_DEMO_4;
        SingletonDemo4 singletonDemo44 = SingletonDemo4.SINGLETON_DEMO_4;
        System.out.println(singletonDemo4==singletonDemo44);
        singletonDemo4.operation();

    }
}
