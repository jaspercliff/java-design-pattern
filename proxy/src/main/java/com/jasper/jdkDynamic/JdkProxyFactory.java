package com.jasper.jdkDynamic;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
//    主要通过Proxy.newProxyInstance方法获取某个代理对象
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}
