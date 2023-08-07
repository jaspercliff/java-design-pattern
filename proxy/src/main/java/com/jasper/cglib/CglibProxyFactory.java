package com.jasper.cglib;

import net.sf.cglib.proxy.Enhancer;

import java.util.Stack;

public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz){
//        动态代理增强类
        Enhancer enhancer = new Enhancer();
//        类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
//        被代理类
        enhancer.setSuperclass(clazz);
//        回调 方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());
//        返回代理类
        return enhancer.create();
    }
}
