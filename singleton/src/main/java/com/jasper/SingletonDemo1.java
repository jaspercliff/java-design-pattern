package com.jasper;

/**
 * 饿汉式
 * 不管是不是需要都会创建对象
 */
public class SingletonDemo1 {
    private static  SingletonDemo1 singletonDemo1 = new SingletonDemo1();
    private SingletonDemo1(){

    }

    public static SingletonDemo1 getInstance(){
        return singletonDemo1;
    }
}
