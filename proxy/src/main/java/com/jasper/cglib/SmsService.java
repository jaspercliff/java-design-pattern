package com.jasper.cglib;

public class SmsService {
    public String send(String message){
        System.out.println("send message: "+message);
        return message;
    }
}
