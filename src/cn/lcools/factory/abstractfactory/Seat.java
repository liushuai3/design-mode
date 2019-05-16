package cn.lcools.factory.abstractfactory;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public interface Seat {
    void sit();
}

class HaoSeat implements Seat{

    @Override
    public void sit() {
        System.out.println("好的座位");
    }
}

class ChaSeat implements Seat{

    @Override
    public void sit() {
        System.out.println("差的座位");
    }
}