package cn.lcools.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liushuai3 on 2019/5/16.
 */
public class StarHandler implements InvocationHandler {
    private Star star;
    public StarHandler(Star star) {
        this.star = star;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        if("sing".equals(method.getName())){
            object = method.invoke(star,args);
        }
        return object;
    }
}
