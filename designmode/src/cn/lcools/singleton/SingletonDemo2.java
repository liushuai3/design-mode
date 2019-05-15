package cn.lcools.singleton;

/**
 * Created by liushuai on 2019/5/15.
 * 单例模式，懒汉式实现
 *
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;
    private SingletonDemo2(){}
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
