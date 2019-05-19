package com.artgeektech.iocdemo.tesla.ac;

import com.artgeektech.iocdemo.tesla.battery.BatterySystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// component meaning is external container to find this AirConditioner
@Component
public class AirConditioner {

    // now I don't need to hardcode with what kind of battery, Spring will autowire for us
    @Autowired
    private BatterySystem batterySystem;

    public void coolDown() {
        batterySystem.providePower();
        System.out.println(this.getClass().getSimpleName() + " is cooling down the car\n\n");
    }
}
