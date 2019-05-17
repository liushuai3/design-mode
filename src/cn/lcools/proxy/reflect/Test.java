package cn.lcools.proxy.reflect;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liushuai3 on 2019/5/16.
 * 反射
 */
public class Test {
    public static void main(String[] args) {
        String classNmae = "cn.lcools.proxy.reflect.Customer";
        String methodName = "getCustomer";
        Map map = new HashMap();
        map.put("T","xxxx");
        Class classt = null;
        try{
            classt = Class.forName(classNmae);
            Method method =  classt.getMethod(methodName,Map.class);
            Map retmap = (Map)method.invoke(classt.newInstance(),map);
            System.out.println(retmap);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
