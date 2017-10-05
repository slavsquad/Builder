package com.ihamen.Builders;

import com.ihamen.Product.MobilePhone;

/**
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */

public class MobilePhoneBuilder extends Builder {
    private int CPU;
    private float display;
    private int RAM;
    private int battery;
    private float camera;
    private int memory;

    @Override
    public void setCPU(int frequency) {
        CPU = frequency;
    }

    @Override
    public void setRAM(int volume) {
        RAM = volume;
    }

    @Override
    public void setDisplay(float diagonal) {
        display = diagonal;
    }

    @Override
    public void setBattery(int capacity) {
        battery = capacity;
    }

    public void setCamera(float camera) {
        this.camera = camera;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public MobilePhone getResult(){
        return new MobilePhone()
                .setCPU(CPU)
                .setRAM(RAM)
                .setDisplay(display)
                .setBattery(battery)
                .setCamera(camera)
                .setMemory(memory);
    }
}
