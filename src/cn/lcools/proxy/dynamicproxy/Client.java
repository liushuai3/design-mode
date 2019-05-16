package cn.lcools.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star starProxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler);
        starProxy.sing();
        starProxy.bookTicket();
        starProxy.sing();
    }
}
