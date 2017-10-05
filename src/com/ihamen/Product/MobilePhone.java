package com.ihamen.Product;

public class MobilePhone {
    private int CPU;
    private float display;
    private int RAM;
    private int battery;
    private float camera;
    private int memory;

    public int getCPU() {
        return CPU;
    }

    public MobilePhone setCPU(int CPU) {
        this.CPU = CPU;
        return this;
    }

    public float getDisplay() {
        return display;
    }

    public MobilePhone setDisplay(float display) {
        this.display = display;
        return this;
    }

    public int getRAM() {
        return RAM;
    }

    public MobilePhone setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public int getBattery() {
        return battery;
    }

    public MobilePhone setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public float getCamera() {
        return camera;
    }

    public MobilePhone setCamera(float camera) {
        this.camera = camera;
        return this;
    }

    public int getMemory() {
        return memory;
    }

    public MobilePhone setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Mobile Phone. CPU: %d MHz. RAM: %d MB. Display: %.1f'. Memory: %d GB. Camera: %.1f Px. Battery: %d mAh",CPU,RAM,display,memory,camera,battery);
    }
}
