package com.ihamen.Builders;

import com.ihamen.Product.Notebook;

/**
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим ноутбук с помощью
 * тех же шагов, что и производили мобильные телефоны.
 */

public class NotebookBuilder extends Builder {

    private int CPU;
    private float display;
    private int RAM;
    private int battery;
    private int hddMemory;
    private int GPU;

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

    public void setHddMemory(int memory){
        hddMemory = memory;
    }

    public void setGPU(int memory){
        GPU = memory;
    }

    public Notebook getResult(){
        return new Notebook()
                .setCPU(CPU)
                .setGPU(GPU)
                .setRAM(RAM)
                .setDisplay(display)
                .setHddMemory(hddMemory)
                .setBattery(battery);
    }
}
