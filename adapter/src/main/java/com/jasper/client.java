package com.jasper;
public class client
{
    public static void main( String[] args )
    {
        OldDevice oldDevice = new OldDevice();
        Adapter adapter = new Adapter(oldDevice);
//        通过adapter invoke 旧设备的方法
        adapter.powerOn();
    }
}
