package cn.lcools.proxy.staticproxy;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class StarProxy implements Star {
    private Star star;
    public  StarProxy(Star star){
        this.star = star;
    }
    @Override
    public void confer() {
        System.out.println("StarProxy confer");
    }

    @Override
    public void signCon() {
        System.out.println("StarProxy signCon");
    }

    @Override
    public void bookTicket() {
        System.out.println("StarProxy bookTicket");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("StarProxy collectMoney");
    }
}
