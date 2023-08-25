package com.jasper;

public class client
{
    public static void main( String[] args )
    {
        com.jasper.OldDevice oldDevice = new com.jasper.OldDevice();
        com.jasper.Adapter adapter = new com.jasper.Adapter(oldDevice);
//        通过adapter invoke 旧设备的方法
        adapter.powerOn();
    }
}
