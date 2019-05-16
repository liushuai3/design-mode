package cn.lcools.proxy.reflect;

import java.util.Map;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class Customer implements CustomerInterface{
    public Map getCustomer(Map map){
        map.put("key","hello");
        return map;
    }
}
