package cn.lcools.proxy.staticproxy;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar confer");
    }

    @Override
    public void signCon() {
        System.out.println("RealStar signCon");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar collectMoney");
    }
}
