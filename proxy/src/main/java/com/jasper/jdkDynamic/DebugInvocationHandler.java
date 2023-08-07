package com.jasper.jdkDynamic;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Data
public class DebugInvocationHandler implements InvocationHandler {
    private final Object target;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method "+method.getName());
        Object result = method.invoke(target, args);
        System.out.println("after method "+method.getName());
        return result;
    }
}
