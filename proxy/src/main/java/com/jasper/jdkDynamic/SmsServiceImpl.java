package com.jasper.jdkDynamic;

public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message successful" + message);
        return message;
    }
}
