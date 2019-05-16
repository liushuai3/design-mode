package cn.lcools.singleton;

/**
 * Created by liushuai on 2019/5/15.
 * 单例模式，枚举式实现
 *
 */
public enum SingletonDemo4 {
    SINGLETON_DEMO_4;
    public void operation(){
        System.out.println("This is a Singleton "+ SINGLETON_DEMO_4.getClass().getName());
    }
}
