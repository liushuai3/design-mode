package cn.lcools.singleton;

/**
 * Created by liushuai on 2019/5/15.
 * 单例模式，静态内部类实现
 *
 */
public class SingletonDemo3 {
    private static class SingletonInstance{
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }
    private SingletonDemo3(){}
    public static SingletonDemo3 getInstance(){
        return SingletonInstance.instance;
    }
    public void operation(){
        System.out.println("This is a Singleton "+ getInstance().getClass().getName());
    }
}
