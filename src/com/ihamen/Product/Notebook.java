package com.ihamen.Product;

public class Notebook {
    private int CPU;
    private float display;
    private int RAM;
    private int battery;
    private int hddMemory;
    private int GPU;

    public int getCPU() {
        return CPU;
    }

    public Notebook setCPU(int CPU) {
        this.CPU = CPU;
        return this;
    }

    public float getDisplay() {
        return display;
    }

    public Notebook setDisplay(float display) {
        this.display = display;
        return this;
    }

    public int getRAM() {
        return RAM;
    }

    public Notebook setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public int getBattery() {
        return battery;
    }

    public Notebook setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public int getHddMemory() {
        return hddMemory;
    }

    public Notebook setHddMemory(int hddMemory) {
        this.hddMemory = hddMemory;
        return this;
    }

    public int getGPU() {
        return GPU;
    }

    public Notebook setGPU(int GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Notebook. CPU: %d MHz. RAM: %d MB. GPU: %d MB. Display: %.1f'. HDD: %d GB. Battery: %d mAh",CPU,RAM,GPU,display,hddMemory,battery);
    }
}
