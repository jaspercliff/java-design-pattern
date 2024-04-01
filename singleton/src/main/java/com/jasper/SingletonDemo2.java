package com.jasper;

/**
 * 没有使用就不会创建实例
 * 但是多线程需要加锁
 */
public class SingletonDemo2 {
    private static SingletonDemo2 singletonDemo2;
    private SingletonDemo2(){

    }

    public static synchronized SingletonDemo2 getInstance(){
        if (singletonDemo2 == null){
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }
}
