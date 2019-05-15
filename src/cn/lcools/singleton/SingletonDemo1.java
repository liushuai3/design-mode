package cn.lcools.singleton;

/**
 * Created by liushuai on 2019/5/15.
 * 单例模式，饿汉式实现
 *
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();
    private SingletonDemo1(){}
    public static SingletonDemo1 getInstance(){
        return instance;
    }
    public void operation(){
        System.out.println("This is a Singleton "+ getInstance().getClass().getName());
    }
}
