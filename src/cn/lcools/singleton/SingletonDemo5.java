package cn.lcools.singleton;

/**
 * Created by liushuai on 2019/5/15.
 * 单例模式，双重检测锁式实现
 *
 */
public class SingletonDemo5 {
    private volatile static SingletonDemo5 instance;
    private SingletonDemo5(){}
    public static SingletonDemo5 getInstance(){
        if(instance==null){
            synchronized (SingletonDemo5.class){
                if(instance==null){
                    instance = new SingletonDemo5();
                }
            }
        }
        return instance;
    }
    public void operation(){
        System.out.println("This is a Singleton "+ getInstance().getClass().getName());
    }
}
