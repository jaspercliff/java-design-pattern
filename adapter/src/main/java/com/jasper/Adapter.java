package com.jasper;

/**
 * public class Adapter extends OldDevice implements NewDevice
 * 将继承改为聚合 实现了合成（组合，聚合）复用原则
 * CRP  composite reuse principle0
 */
public class Adapter  implements com.jasper.NewDevice {

    private com.jasper.OldDevice oldDevice;

    public Adapter(com.jasper.OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void powerOn() {
        oldDevice.start();
    }
}
