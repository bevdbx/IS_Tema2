package org.example;

import org.example.devices.Device;
import org.example.devices.Radio;
import org.example.devices.TV;
import org.example.remotes.AdvancedRemote;
import org.example.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}