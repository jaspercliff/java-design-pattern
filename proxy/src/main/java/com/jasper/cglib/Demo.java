package com.jasper.cglib;

public class Demo {
    public static void main(String[] args) {
        SmsService smsService = (SmsService)CglibProxyFactory.getProxy(SmsService.class);
        smsService.send("jasper");
    }
}
