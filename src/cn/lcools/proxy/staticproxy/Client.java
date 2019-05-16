package cn.lcools.proxy.staticproxy;

/**
 * Created by liushuai3 on 2019/5/16.
 * 静态代理测试
 */
public class Client {
    public static void main(String[] args) {
        Star star = new RealStar();
        Star starProxy = new StarProxy(star);
        starProxy.confer();
        starProxy.signCon();
        starProxy.bookTicket();
        starProxy.sing();
        starProxy.collectMoney();
    }
}
