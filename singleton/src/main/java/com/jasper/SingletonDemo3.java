package com.jasper;

/**
 * 双重检查 Double-Check Locking
 *
 */
public class SingletonDemo3 {
    private static volatile SingletonDemo3 singletonDemo3;

    private SingletonDemo3() {

    }

    public SingletonDemo3 getInstance(){
        if (singletonDemo3 == null){
            synchronized (SingletonDemo3.class){
                singletonDemo3 = new SingletonDemo3();
            }
        }
        return singletonDemo3;
    }
}
